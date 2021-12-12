package com.doranco.blog.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PublicationEpreuve extends Publication implements Serializable {
	
	public enum CategorieEpreuve{
		DEVOIR, EVALUATION, TP
	}
	
	private String lien;
	private Date datePassage;
	private CategorieEpreuve categorieEpreuve;
	private String classe;
	
}
