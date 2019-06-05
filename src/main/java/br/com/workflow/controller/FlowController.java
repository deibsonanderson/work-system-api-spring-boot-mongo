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

import br.com.workflow.dto.Flow;
import br.com.workflow.service.FlowService;

@RestController
@RequestMapping("/system")
public class FlowController {

	@Autowired
	FlowService flowService;

	@GetMapping(value = "/flow", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Flow>> findAll() {
		return ResponseEntity.ok(flowService.findAll());
	}

	@GetMapping(value = "/flow/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Flow> findById(@PathVariable("id") String id) {
		return ResponseEntity.ok(flowService.findById(id));
	}

	@PostMapping(value = "/flow", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Flow> create(@RequestBody Flow payload) {
		return ResponseEntity.ok(flowService.create(payload));
	}

	@PutMapping(value = "/flow", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Flow> update(@RequestBody Flow payload) {
		return ResponseEntity.ok(flowService.update(payload));
	}

	@DeleteMapping(value = "/flow/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Void> remove(@PathVariable("id") String id) {
		flowService.remove(id);
		return ResponseEntity.status(HttpStatus.OK).build();
	}

}
