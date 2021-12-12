package com.doranco.blog.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
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
public class EnvoyerMessage implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idEnvoyerMessage;
	private String contenu;
	private Date dateEnvoi;
	private boolean lu;
	@ManyToOne
	private Utilisateur	utilisateur;
}
