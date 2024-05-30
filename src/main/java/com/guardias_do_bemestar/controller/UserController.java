package com.guardias_do_bemestar.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.guardias_do_bemestar.model.User;
import com.guardias_do_bemestar.service.AuthService;
import com.guardias_do_bemestar.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService userService;
	
	@PostMapping
	public ResponseEntity<User> create (@RequestBody User user) {
		User created = userService.save(user);
		return ResponseEntity.ok(created);
	}
	
	@GetMapping("/all")
	public ResponseEntity<List<User>> findAll (
		@RequestHeader(name="token") String token) {
		if (!AuthService.validateToken(token)) {
			return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
		}
		User user = AuthService.toUser(token);
		List<User> list = userService.findAll(user);
		return ResponseEntity.ok(list);
	}
}
