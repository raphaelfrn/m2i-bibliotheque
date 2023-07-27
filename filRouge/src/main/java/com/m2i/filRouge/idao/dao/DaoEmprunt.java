package com.m2i.filRouge.idao.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.m2i.filRouge.entities.Emprunt;
import com.m2i.filRouge.idao.IDaoEmprunt;

@Repository
@Transactional
public class DaoEmprunt extends DaoGeneric<Emprunt, Long> implements IDaoEmprunt  {

	@PersistenceContext
	private EntityManager entityManager;

	public DaoEmprunt() {
		super(Emprunt.class);
	}

	@Override
	public EntityManager getEntityManager() {
		return entityManager;
	}

}
