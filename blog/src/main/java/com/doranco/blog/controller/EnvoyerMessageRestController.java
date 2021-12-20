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

import com.doranco.blog.entity.EnvoyerMessage;
import com.doranco.blog.repository.EnvoyerMessageRepository;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/envoyer-message")
public class EnvoyerMessageRestController {
	
	private final EnvoyerMessageRepository envoyerMessageRepository;
	
	@GetMapping("/id")
	public EnvoyerMessage getEnvoyerMessage(@PathVariable(value = "id") Long idEnvoyerMessage) {
		return envoyerMessageRepository.findById(idEnvoyerMessage).orElse(null);
	}
	
	@PostMapping
	public ResponseEntity<?> saveEnvoyerMessage(@RequestBody EnvoyerMessage envoyerMessage){
		return ResponseEntity.status(HttpStatus.CREATED).body(envoyerMessageRepository.save(envoyerMessage));
	}
	
	@GetMapping
	public List<EnvoyerMessage> listerEnvoyerMessage(){
		return envoyerMessageRepository.findAll();
	}
}
