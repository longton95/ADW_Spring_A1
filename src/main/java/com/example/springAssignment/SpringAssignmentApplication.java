package com.example.springAssignment;

import com.example.springAssignment.domain.User;
import com.example.springAssignment.domain.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class SpringAssignmentApplication {

	public static void main(String[] args) {

		SpringApplication.run(SpringAssignmentApplication.class, args);
	}


}