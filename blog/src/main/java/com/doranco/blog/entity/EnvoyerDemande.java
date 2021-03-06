package com.doranco.blog.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class EnvoyerDemande implements Serializable {
	
	public enum Etat{
		ATTENTE, ACCEPTER, REFUSER
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idEnvoyerDemande;
	@Enumerated(EnumType.STRING)
	private Etat etat;
	private Date dateEnvoi;
	@ManyToOne
	private Utilisateur utilisateur;
}
