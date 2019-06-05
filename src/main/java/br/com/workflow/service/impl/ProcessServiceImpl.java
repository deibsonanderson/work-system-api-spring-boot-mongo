package br.com.workflow.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.workflow.dto.Process;
import br.com.workflow.repository.ProcessRepository;
import br.com.workflow.service.ProcessService;

@Service
public class ProcessServiceImpl implements ProcessService {

	@Autowired
	ProcessRepository processRepository;

	@Override
	public List<Process> findAll() {
		return processRepository.findAll();
	}

	@Override
	public Process findById(String id) {
		Optional<Process> process = processRepository.findById(id);
		return (process.isPresent()) ? process.get() : null;
	}

	@Override
	public void remove(String id) {
		processRepository.deleteById(id);
	}

	@Override
	public Process update(Process process) {
		return processRepository.save(process);
	}

	@Override
	public Process create(Process process) {
		return processRepository.save(process);
	}

}
