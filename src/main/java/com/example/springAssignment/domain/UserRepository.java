package com.example.springAssignment.domain;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "user", path = "user")
public interface UserRepository extends MongoRepository<User, Integer> {

    public User findByFirstName(String firstName);
    public List<User> findByLastName(String lastName);


}
