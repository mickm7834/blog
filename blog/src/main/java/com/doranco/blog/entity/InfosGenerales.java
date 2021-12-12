package com.doranco.blog.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class InfosGenerales implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idInfosGenerales;
	private Date dateCreation;
	private Date dateModification;
}
