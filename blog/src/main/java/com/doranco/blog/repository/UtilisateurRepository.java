package com.doranco.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.doranco.blog.entity.Utilisateur;

public interface UtilisateurRepository extends JpaRepository<Utilisateur, Long> {

}
