package com.guardias_do_bemestar.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.guardias_do_bemestar.model.User;


@Repository
public interface UserRepository extends JpaRepository<User, Integer>{
	
	Optional<User> findFirstByEmail(String email);

	User save(User user);
}