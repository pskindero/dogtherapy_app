package com.pskindero.dogtherapy.jpa;

import java.io.Serializable;

import javax.inject.Inject;
import javax.persistence.EntityManager;

public class GenericDaoImpl<T, PK extends Serializable> implements GenericDao<T, PK> {

	protected Class<T> entityClass;

	@Inject
	protected EntityManager entityManager;
	
	public GenericDaoImpl() {}

	public T create(T entity) {
		startTransaction();
		this.entityManager.persist(entity);
		commitTransaction();
		return entity;
	}

	public T update(T entity) {
		startTransaction();
		this.entityManager.merge(entity);
		commitTransaction();
		return entity;
	}

	public void delete(T entity) {
		startTransaction();
		this.entityManager.remove(entity);
		commitTransaction();
	}

	public T read(PK id) {
		startTransaction();
		T result =this.entityManager.find(this.entityClass, id);
		commitTransaction();
		return result;
	}

	protected void startTransaction() {
		entityManager.getTransaction().begin();
	}
	
	protected void commitTransaction() {
		entityManager.getTransaction().commit();
		entityManager.close();
	}
}