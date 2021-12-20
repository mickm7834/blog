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

import com.doranco.blog.entity.InfosGenerales;
import com.doranco.blog.repository.InfosGeneralesRepository;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/infos")
public class InfosGeneralesRestController {

	private final InfosGeneralesRepository infosGeneralesRepository;
	
	@GetMapping("/id")
	public InfosGenerales getInfosGenerales(@PathVariable(value = "id") Long idInfosGenerales) {
		return infosGeneralesRepository.findById(idInfosGenerales).orElse(null);
	}
	
	@PostMapping
    public ResponseEntity<?> saveInfosGenerales(@RequestBody InfosGenerales infosGenerales){        
        return ResponseEntity.status(HttpStatus.CREATED).body(infosGeneralesRepository.save(infosGenerales));
    }
    
    @GetMapping
    public List<InfosGenerales> listerEtudiant(){
    	return infosGeneralesRepository.findAll();
    }
	
	
}
