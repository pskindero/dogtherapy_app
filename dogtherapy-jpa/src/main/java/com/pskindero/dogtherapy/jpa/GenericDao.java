package com.pskindero.dogtherapy.jpa;

import java.io.Serializable;

public interface GenericDao<T, PK extends Serializable> {

	T create(T entity);
	
	T update(T entity);
	
	void delete(T entity);
	
	T read(PK id);

}