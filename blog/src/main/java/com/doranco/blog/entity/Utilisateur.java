package com.doranco.blog.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Utilisateur implements Serializable {
	
	public enum Sexe{
		MASCULIN, FEMININ
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idUtilisateur;
	private String password;
	private String nom;
	private String prenom;
	@Enumerated(EnumType.STRING)
	private Sexe sexe;
	private String email;
	private String telephone;
	private String avatar;
	private String description;
	@OneToMany(mappedBy = "utilisateur", orphanRemoval = true)
	private List<Publication> publications = new ArrayList<>();
	@OneToMany(mappedBy = "utilisateur", orphanRemoval = true)
	private List<EnvoyerMessage> envoyerMessages = new ArrayList<>();
	@OneToMany(mappedBy = "utilisateur", orphanRemoval = true)
	private List<EnvoyerDemande> envoyerDemandes = new ArrayList<>();
	@ManyToMany
	private List<Groupe> groupes = new ArrayList<>();
	@ManyToMany	
	private Set<Utilisateur> amis = new HashSet<>();
	@ManyToMany(mappedBy = "amis")
	private Set<Utilisateur> amis2 = new HashSet<>();
	
	
	

}
