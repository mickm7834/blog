package com.doranco.blog.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.doranco.blog.entity.Groupe;
import com.doranco.blog.repository.GroupeRepository;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/groupe")
public class GoupeRestController {

	private final GroupeRepository groupeRepository;
	
	@GetMapping
	public Groupe getGroupeById(@PathVariable(value = "id") Long idGroupe) {
		return groupeRepository.findById(idGroupe).orElse(null);
	}
	
	@PostMapping
	public ResponseEntity<?> saveGroupe(@RequestBody Groupe groupe){
		return ResponseEntity.status(HttpStatus.CREATED).body(groupeRepository.save(groupe));
	}
	
	@GetMapping
	public List<Groupe> listerGroupe(){
		return groupeRepository.findAll();
	}
	
}
