package br.com.workflow.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import br.com.workflow.dto.Process;

@Repository
public interface ProcessRepository extends MongoRepository<Process, String> {

}
