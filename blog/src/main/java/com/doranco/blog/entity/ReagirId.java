package com.doranco.blog.entity;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Embeddable
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ReagirId implements Serializable {
	private Long idUtilisateur;
	private Long idPublication;
}
