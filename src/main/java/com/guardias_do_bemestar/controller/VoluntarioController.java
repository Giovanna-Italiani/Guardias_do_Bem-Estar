package com.guardias_do_bemestar.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.guardias_do_bemestar.model.Voluntario;
import com.guardias_do_bemestar.service.VoluntarioService;

@RestController
@RequestMapping("/voluntario")
public class VoluntarioController {
	@Autowired
	private VoluntarioService voluntarioService;
	
	@PostMapping
	public ResponseEntity<Voluntario> create (@RequestBody Voluntario voluntario) {
		Voluntario created = voluntarioService.save(voluntario);
		return ResponseEntity.ok(created);
	}
}

