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
import org.springframework.web.bind.annotation.RestController;

import br.com.workflow.dto.Process;
import br.com.workflow.service.ProcessService;

@RestController
@RequestMapping("/system")
public class ProcessController {

	@Autowired
	ProcessService processService;

	@GetMapping(value = "/process", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Process>> findAll() {
		return ResponseEntity.ok(processService.findAll());
	}

	@GetMapping(value = "/process/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Process> findById(@PathVariable("id") String id) {
		return ResponseEntity.ok(processService.findById(id));
	}

	@PostMapping(value = "/process", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Process> create(@RequestBody Process payload) {
		return ResponseEntity.ok(processService.create(payload));
	}

	@PutMapping(value = "/process", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Process> update(@RequestBody Process payload) {
		return ResponseEntity.ok(processService.update(payload));
	}

	@DeleteMapping(value = "/process/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Void> remove(@PathVariable("id") String id) {
		processService.remove(id);
		return ResponseEntity.status(HttpStatus.OK).build();
	}

}
