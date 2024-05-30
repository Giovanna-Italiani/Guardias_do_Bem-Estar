package com.guardias_do_bemestar.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.guardias_do_bemestar.model.User;
import com.guardias_do_bemestar.model.Voluntario;
import com.guardias_do_bemestar.repository.UserRepository;

@Service
public class VoluntarioService {
	@Autowired
	private UserRepository userRepository;
	
	public Voluntario save(Voluntario voluntario) {
		return userRepository.save(voluntario);
	}
	
	public Optional<User> findByEmail(String email) {
		return userRepository.findFirstByEmail(email);
	}
}

