package com.doranco.blog.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Embeddable;
import javax.persistence.Entity;

import com.doranco.blog.entity.Utilisateur.Sexe;
import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Embeddable
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CommentaireId implements Serializable {
	private Long idUtilisateur;
	private Long idPublication;
}
