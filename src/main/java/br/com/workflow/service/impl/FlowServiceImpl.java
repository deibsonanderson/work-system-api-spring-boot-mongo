package br.com.workflow.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.workflow.dto.Flow;
import br.com.workflow.repository.FlowRepository;
import br.com.workflow.service.FlowService;

@Service
public class FlowServiceImpl implements FlowService {

	@Autowired
	FlowRepository flowRepository;

	@Override
	public List<Flow> findAll() {
		return flowRepository.findAll();
	}

	@Override
	public Flow findById(String id) {
		Optional<Flow> flow = flowRepository.findById(id);
		return (flow.isPresent()) ? flow.get() : null;
	}

	@Override
	public void remove(String id) {
		flowRepository.deleteById(id);
	}

	@Override
	public Flow update(Flow flow) {
		return flowRepository.save(flow);
	}

	@Override
	public Flow create(Flow flow) {
		return flowRepository.save(flow);
	}

}
