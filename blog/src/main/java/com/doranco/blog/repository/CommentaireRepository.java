package com.doranco.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.doranco.blog.entity.Commentaire;

public interface CommentaireRepository extends JpaRepository<Commentaire, Long> {

}
