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

import com.doranco.blog.entity.Adherer;
import com.doranco.blog.repository.AdhererRepository;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/adherer")
public class AdhererRestController {

	private final AdhererRepository adhererRepository;
	
	@GetMapping("/id")
	public Adherer getAdhererById(@PathVariable(value = "id") Long idAdherer) {
		return adhererRepository.findById(idAdherer).orElse(null);
	}
	
	@PostMapping
	public ResponseEntity<?> saveAdherer(@RequestBody Adherer adherer){
		return ResponseEntity.status(HttpStatus.CREATED).body(adhererRepository.save(adherer));
	}
	
	@GetMapping
	public List<Adherer> listerAdherer(){
		return adhererRepository.findAll();
	}
}
