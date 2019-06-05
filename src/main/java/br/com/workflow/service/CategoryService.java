package br.com.workflow.service;

import java.util.List;

import br.com.workflow.dto.Category;

public interface CategoryService extends BaseService<Category> {
	
	List<Category> findByNameRegex(String name);

	Category findByName(String name);

	List<Category> findAllPageable(int skip, int top);

}
