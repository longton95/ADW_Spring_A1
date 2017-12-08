package com.example.springAssignment.domain;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "address", path = "address")
public interface AddressRepository extends MongoRepository<Address, String> {

    public Address findByFirstName(String firstName);
    public List<Address> findByLastName(@Param("name") String name);

}
