package com.example.springAssignment.service;

import com.example.springAssignment.domain.User;
import com.example.springAssignment.domain.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> findAllEntries () {
        List <User> entries = this.userRepository.findAll ();

        return entries;

    }

}
