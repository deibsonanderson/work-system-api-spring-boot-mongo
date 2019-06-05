package br.com.workflow.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import br.com.workflow.dto.Category;

@Repository
public interface CategoryRepository extends MongoRepository<Category, String> {

	public Category findByTitle(String title);

	public List<Category> findByTitleRegex(String title);
	
	public Page<Category> findAll(Pageable pageable);

}
