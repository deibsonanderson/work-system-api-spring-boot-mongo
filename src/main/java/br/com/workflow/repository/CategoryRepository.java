package br.com.workflow.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.workflow.dto.Category;


public interface CategoryRepository extends MongoRepository<Category, String> {

	public Category findByName(String name);

	public List<Category> findByNameRegex(String name);
	
	public Page<Category> findAll(Pageable pageable);

}
