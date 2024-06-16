package com.guardias_do_bemestar.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.guardias_do_bemestar.model.User;
import com.guardias_do_bemestar.model.Voluntario;

@Repository
public interface VoluntarioRepository extends JpaRepository<User, Integer>{
	
	Optional<User> findFirstByEmail(String email);
	
	Voluntario save(Voluntario voluntario);
}
