package com.doranco.blog.controller;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.doranco.blog.entity.Utilisateur;
import com.doranco.blog.repository.UtilisateurRepository;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/utilisateur")
public class UtilisateurRestController {

	private final UtilisateurRepository utilisateurRepository;
	
	@GetMapping("/id")
	public Utilisateur getUtilisateurById(@PathVariable(value = "id") Long idUtilisateur) {
		return utilisateurRepository.findById(idUtilisateur).orElse(null);
	}
	
	@PostMapping
	public ResponseEntity<?> saveEtudiant(@RequestBody Utilisateur utilisateur){
		return ResponseEntity.status(HttpStatus.CREATED).body(utilisateurRepository.save(utilisateur));
	}
	
	@GetMapping
	public List<Utilisateur> listerUtilisateur(){
		return utilisateurRepository.findAll(Sort.by(Sort.Direction.ASC, "nom"));
	}
	
	@PutMapping("/id")
	public void updateUtilisateur(@RequestBody Utilisateur utilisateur, @PathVariable(value = "id") Long idUtilisateur) {
		utilisateurRepository.findById(idUtilisateur).ifPresent(utilisateurAModifier -> {
			utilisateurAModifier.setPassword(utilisateur.getPassword());
			utilisateurAModifier.setNom(utilisateur.getNom());
			utilisateurAModifier.setPrenom(utilisateur.getPrenom());
			utilisateurAModifier.setSexe(utilisateur.getSexe());
			utilisateurAModifier.setEmail(utilisateur.getEmail());
			utilisateurAModifier.setTelephone(utilisateur.getTelephone());
			utilisateurAModifier.setAvatar(utilisateur.getAvatar());
			utilisateurAModifier.setDescription(utilisateur.getDescription());
		});
	}
	
	@DeleteMapping("/id")
	public void deleteUtilisateur(@PathVariable Long id) {
		utilisateurRepository.deleteById(id);
	}
	
}
