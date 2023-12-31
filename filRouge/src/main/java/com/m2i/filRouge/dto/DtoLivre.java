package com.m2i.filRouge.dto;

import com.m2i.filRouge.entities.Domaine;
import com.m2i.filRouge.entities.Livre.EtatLivre;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @NoArgsConstructor
public class DtoLivre {

	private Long idLivre;
	private String titre;
	private String auteur;
	private String editeur;
	private Boolean dispo;
	private EtatLivre etat = EtatLivre.BON_ETAT;
	private Domaine domaine;
	
	
	
	public DtoLivre(Long idLivre, String titre, String auteur, String editeur, Boolean dispo, EtatLivre etat, Domaine domaine) {
		super();
		this.idLivre = idLivre;
		this.titre = titre;
		this.auteur = auteur;
		this.editeur = editeur;
		this.dispo = dispo;
		this.etat = etat;
		this.domaine = domaine;
	}



	

	
	
	
	
}
