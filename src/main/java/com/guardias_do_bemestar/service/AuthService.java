package com.guardias_do_bemestar.service;

import java.time.Instant;
import java.util.Base64;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.guardias_do_bemestar.model.User;

@Service
public class AuthService {
	@Autowired
	private UserService userService;
	
	public String authenticate(String email, String pwd) {
		Optional<User> user = userService.findByEmail(email);
		if (user.isPresent() && user.get() .getSenha() .equals(pwd)) {
			String token = generateToken(user.get());
			return String.format("{\"token\": \"%s\"}", token);			
		}
		return null;
	}

	private String generateToken(User user) {
		String token = String.format("%s|%s|%d|%d", user.getEmail(), 
													user.getNickname(), 
													user.getId(), 
													Instant.now().toEpochMilli());
		
		return Base64.getEncoder() .encodeToString(token.getBytes());
	}
	
	public static boolean validateToken(String token) {
		String[] split = toUserArray(token);
		Instant instant = Instant.ofEpochMilli(Long.valueOf(split[3]));
		return instant.isAfter(Instant.now() .minusSeconds(120));
	}

	private static String[] toUserArray(String token) {
		byte[] decode = Base64.getDecoder() .decode(token);
		String auth = new String(decode);
		return auth.split("\\|");
	}

	public static User toUser(String token) {
		String[] split = toUserArray(token);
		User u = new User();
		u.setId(Integer.valueOf(split[2]));
		u.setEmail(split[0]);
		u.setNickname(split[1]);
		return u;
	}
}
