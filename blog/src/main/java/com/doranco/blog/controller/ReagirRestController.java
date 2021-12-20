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

import com.doranco.blog.entity.Reagir;
import com.doranco.blog.repository.ReagirRepository;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/reagir")
public class ReagirRestController {
	
	private final ReagirRepository reagirRepository;
	
	@GetMapping("/id")
	public Reagir getReagirById(@PathVariable(value = "id") Long idReagir) {
		return reagirRepository.findById(idReagir).orElse(null);
	}
	
	@PostMapping
	public ResponseEntity<?> saveReagir(@RequestBody Reagir reagir){
		return ResponseEntity.status(HttpStatus.CREATED).body(reagirRepository.save(reagir));
	}
	
	@GetMapping
	public List<Reagir> listerReagir(){
		return reagirRepository.findAll();
	}
}
