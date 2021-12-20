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

import com.doranco.blog.entity.EnvoyerDemande;
import com.doranco.blog.repository.EnvoyerDemandeRepository;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/envoyer-demande")
public class EnvoyerDemandeRestController {
	
	private final EnvoyerDemandeRepository envoyerDemandeRepository;
	
	@GetMapping("/id")
	public EnvoyerDemande getEnvoyerDemande(@PathVariable(value = "id") Long idEnvoyerDemande) {
		return envoyerDemandeRepository.findById(idEnvoyerDemande).orElse(null);
	}
	
	@PostMapping
	public ResponseEntity<?> saveEnvoyerDemande(@RequestBody EnvoyerDemande envoyerDemande){
		return ResponseEntity.status(HttpStatus.CREATED).body(envoyerDemandeRepository.save(envoyerDemande));
	}
	
	@GetMapping
	public List<EnvoyerDemande> listerEnvoyerDemande(){
		return envoyerDemandeRepository.findAll();
	}
}
