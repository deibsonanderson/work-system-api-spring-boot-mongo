package br.com.workflow.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import br.com.workflow.dto.Flow;

@Repository
public interface FlowRepository extends MongoRepository<Flow, String> {

}
