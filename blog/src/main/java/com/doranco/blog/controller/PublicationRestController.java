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

import com.doranco.blog.entity.Publication;
import com.doranco.blog.repository.PublicationRepository;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/publication")
public class PublicationRestController {

	private final PublicationRepository publicationRepository;
	
	@GetMapping("/id")
	public Publication getPublication(@PathVariable(value = "id") Long idPublication) {
		return publicationRepository.findById(idPublication).orElse(null);
	}
	
	@PostMapping
	public ResponseEntity<?> savePublication(@RequestBody Publication publication){
		return ResponseEntity.status(HttpStatus.CREATED).body(publicationRepository.save(publication));
	}
	
	@GetMapping
	public List<Publication> listerPublication(){
		return publicationRepository.findAll();
	}
}
