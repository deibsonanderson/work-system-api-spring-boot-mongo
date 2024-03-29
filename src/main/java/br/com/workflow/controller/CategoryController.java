package br.com.workflow.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.workflow.dto.Category;
import br.com.workflow.service.CategoryService;


@RestController
@RequestMapping("/system")
public class CategoryController {

	@Autowired
	CategoryService categoryService;

	@GetMapping(value = "/category", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Category>> findAll() {
		return ResponseEntity.ok(categoryService.findAll());
	}

	@GetMapping(value = "/category/pageable", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Category>> findAllPageable(@RequestParam("skip") int skip,
			@RequestParam("top") int top) {
		return ResponseEntity.ok(categoryService.findAllPageable(skip, top));
	}

	@GetMapping(value = "/category/name/{name}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Category> findByName(@PathVariable("name") String name) {
		return ResponseEntity.ok(categoryService.findByName(name));
	}

	@GetMapping(value = "/category/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Category> findById(@PathVariable("id") String id) {
		return ResponseEntity.ok(categoryService.findById(id));
	}

	@GetMapping(value = "/category/regex/{name}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Category>> findByNameRegex(@PathVariable("name") String name) {
		return ResponseEntity.ok(categoryService.findByNameRegex(name));
	}

	@PostMapping(value = "/category", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Category> create(@RequestBody Category payload) {
		return ResponseEntity.ok(categoryService.create(payload));
	}

	@PutMapping(value = "/category", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Category> update(@RequestBody Category payload) {
		return ResponseEntity.ok(categoryService.update(payload));
	}

	@DeleteMapping(value = "/category/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Void> remove(@PathVariable("id") String id) {
		categoryService.remove(id);
		return ResponseEntity.status(HttpStatus.OK).build();
	}

}
