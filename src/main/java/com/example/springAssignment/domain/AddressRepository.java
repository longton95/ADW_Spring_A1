package com.example.springAssignment.domain;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "address", path = "address")
public interface AddressRepository extends MongoRepository<Address, String> {

    Address findByFirstName(String firstName);
    List<Address> findByLastName(String lastName);
    List<Address> findByHouseNumber(String houseNumber);
    List<Address> findByPostCode(String postcode);

}
