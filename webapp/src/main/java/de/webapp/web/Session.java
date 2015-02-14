package de.webapp.web;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class Session {
	
	@PersistenceContext
	EntityManager entityManager;

	public void persist() {
		UserModel entity = new UserModel();
		entity.id = 8;
		entityManager.persist(entity);
		System.out.println();
	}
}
