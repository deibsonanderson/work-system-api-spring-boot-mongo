package br.com.workflow.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import br.com.workflow.dto.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}
