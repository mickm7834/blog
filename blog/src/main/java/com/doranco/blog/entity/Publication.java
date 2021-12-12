package com.doranco.blog.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Publication implements Serializable {
	
	public enum Visiblite{
		PUBLIC, PRIVE;
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idPublication;
	@Enumerated(EnumType.STRING)
	private Visiblite visibilite;
	private String texte;
	@ManyToOne
	private Utilisateur utilisateur;
}
