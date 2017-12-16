package com.example.springAssignment;

import com.example.springAssignment.domain.User;
import com.example.springAssignment.domain.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class SpringAssignmentApplication implements CommandLineRunner {

	public static void main(String[] args) {

		SpringApplication.run(SpringAssignmentApplication.class, args);
	}

	@Autowired
	private UserRepository repository;

	public void run(String... args) throws Exception {

		repository.deleteAll();

		repository.save(new User("Josh", "Longton", 1, 2, 3));
		repository.save(new User("Samir", "Mohammed", 1, 2, 3));
		repository.save(new User("John", "Doe",  1, 2, 3));

		System.out.println("User's found with findAll():");
		System.out.println("-------------------------------");
		for (User user : repository.findAll()) {
			System.out.println(user);
		}
		System.out.println();

		System.out.println("User found with findByFirstName('John'):");
		System.out.println("--------------------------------");
		System.out.println(repository.findByFirstName("John"));
		System.out.println();

		System.out.println("User found with findByLastName('Longton'):");
		System.out.println("--------------------------------");
		for (User user : repository.findByLastName("Longton")) {
			System.out.println(user);
		}


	}
}