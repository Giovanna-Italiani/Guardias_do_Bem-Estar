package com.guardias_do_bemestar.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.guardias_do_bemestar.model.User;
import com.guardias_do_bemestar.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository userRepository;
	
	public User save(User user) {
		return userRepository.save(user);
	}
	
	public Optional<User> findByEmail(String email) {
		return userRepository.findFirstByEmail(email);
	}

	public List<User> findAll(User user) {
		// TODO Auto-generated method stub
		return null;
	}
}
