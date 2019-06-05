package br.com.workflow.service;

import java.util.List;

public interface BaseService<T> {

	List<T> findAll();
	
	T findById(String id);
	
	void remove(String id);

	T update(T t);
	
	T create(T t);
}
