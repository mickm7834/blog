package com.doranco.blog.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Groupe implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idGroupe;
	private String libelle;
	private String description;
	@ManyToMany(mappedBy = "groupes")
	private List<Utilisateur> utilisateurs;
	
	
}
