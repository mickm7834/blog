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
import com.doranco.blog.entity.PublicationEpreuve;
import com.doranco.blog.repository.PublicationEpreuveRepository;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/publication-epreuve")
public class PublicationEpreuveRestController {

	private final PublicationEpreuveRepository publicationEpreuveRepository;
	
	@GetMapping("/id")
	public Publication getPublicationEpreuve(@PathVariable(value = "id") Long idPublication) {
		return publicationEpreuveRepository.findById(idPublication).orElse(null);
	}
	
	@PostMapping
	public ResponseEntity<?> savePublicationEpreuve(@RequestBody PublicationEpreuve publicationEpreuve){
		return ResponseEntity.status(HttpStatus.CREATED).body(publicationEpreuveRepository.save(publicationEpreuve));
	}
	
	@GetMapping
	public List<PublicationEpreuve> listerPublicationEpreuve(){
		return publicationEpreuveRepository.findAll();
	}
}
