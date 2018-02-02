package com.example.springAssignment.domain;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Example;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.query.QueryByExampleExecutor;

public interface UserRepository extends MongoRepository<User, String> {


    List <User> findAll ();

    Long deleteUserById(String id);

    User findUserByEmail(String email);

    User findUserById(String id);


    //    User findOne(String email);


//    List<User> findAll(Predicate predicate, OrderSpecifier<?>... orders);
//
//    Page<User> findAll(Predicate predicate, Pageable pageable);
//
//    Long count(Predicate predicate);

//    public User findByEmail(String email);
//
//    public List<User> findByLastName(String lastName);
//
//    void delete(String email);
//
//    User findOne(String email);


}
