package br.com.workflow.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import br.com.workflow.dto.Category;
import br.com.workflow.repository.CategoryRepository;
import br.com.workflow.service.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService {

	@Autowired
	CategoryRepository categoryRepository;

	@Override
	public Category create(Category category) {
		return categoryRepository.save(category);
	}

	@Override
	public List<Category> findAll() {
		return categoryRepository.findAll();
	}

	@Override
	public void remove(String id) {
		categoryRepository.deleteById(id);
	}

	@Override
	public Category findByName(String name) {
		return categoryRepository.findByName(name);
	}

	@Override
	public List<Category> findByNameRegex(String name) {
		return categoryRepository.findByNameRegex(".*" + name + ".*");
	}

	@Override
	public Category update(Category category) {
		return categoryRepository.save(category);
	}

	@Override
	public Category findById(String id) {
		Optional<Category> categoria = categoryRepository.findById(id);
		return (categoria.isPresent()) ? categoria.get() : null;
	}

	@Override
	public List<Category> findAllPageable(int skip, int top) {
		final Pageable page = PageRequest.of(skip, top);
		Page<Category> result = categoryRepository.findAll(page);
		return (result.hasContent()) ? result.getContent() : null;
	}

}
