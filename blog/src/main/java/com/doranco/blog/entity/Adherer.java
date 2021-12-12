package com.doranco.blog.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Adherer implements Serializable {
	@EmbeddedId
	private AdhererId adhererId;
	private Date dateAdhesion;
	@ManyToOne(optional = false)
	@MapsId("idUtilisateur")
	private Utilisateur utilisateur;
	@ManyToOne(optional = false)
	@MapsId("idGroupe")
	private Groupe groupe;
}
