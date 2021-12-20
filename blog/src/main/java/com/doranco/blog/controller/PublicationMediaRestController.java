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
import com.doranco.blog.entity.PublicationMedia;
import com.doranco.blog.repository.PublicationMediaRepository;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/publication-media")
public class PublicationMediaRestController {

	private final PublicationMediaRepository publicationMediaRepository;
	
	@GetMapping("/id")
	public Publication getPublicationMedia(@PathVariable(value = "id") Long idPublication) {
		return publicationMediaRepository.findById(idPublication).orElse(null);
	}
	
	@PostMapping
	public ResponseEntity<?> savePublicationMedia(@RequestBody PublicationMedia publicationMedia){
		return ResponseEntity.status(HttpStatus.CREATED).body(publicationMediaRepository.save(publicationMedia));
	}
	
	@GetMapping
	public List<PublicationMedia> listerPublicationMedia(){
		return publicationMediaRepository.findAll();
	}
}
