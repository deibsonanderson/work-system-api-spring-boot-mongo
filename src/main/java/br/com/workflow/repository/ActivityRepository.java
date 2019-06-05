package br.com.workflow.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import br.com.workflow.dto.Activity;

@Repository
public interface ActivityRepository extends MongoRepository<Activity, String> {

}
