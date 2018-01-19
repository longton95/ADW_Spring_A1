package com.example.springAssignment.service;

import com.example.springAssignment.domain.User;
import com.example.springAssignment.domain.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public List<User> findAllEntries () {

        List <User> entries = this.repository.findAll ();

        return entries;

    }

    public void save(User newData) {
        this.repository.save (newData);
    }

    public void delete (String id) {
        this.repository.deleteUserById (id);
    }

    public User findUserById (String id) {
        return this.repository.findUserById (id);
    }

//    public User getUserById (String id) {
//        return this.repository.findById (id);
//    }

    public User findUserByEmail (String email) {
        return this.repository.findUserByEmail (email);
    }

}
