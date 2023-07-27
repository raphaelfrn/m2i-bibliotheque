package com.m2i.filRouge.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString @NoArgsConstructor @AllArgsConstructor
public class Domaine {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="idDomaine")
	private Long idDomaine;
	
	@Column(name="nom")
	private String nom;
	
	@Column(name="description")
	private String description;
	
	@OneToMany(fetch= FetchType.LAZY, mappedBy= "livre")
	private List<Livre> livres;
}
