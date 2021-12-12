package com.doranco.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.doranco.blog.entity.EnvoyerDemande;

public interface EnvoyerDemandeRepository extends JpaRepository<EnvoyerDemande, Long> {

}
