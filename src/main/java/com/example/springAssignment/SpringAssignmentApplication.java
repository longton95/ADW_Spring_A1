package com.example.springAssignment;

import com.example.springAssignment.domain.Address;
import com.example.springAssignment.domain.AddressRepository;
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
	private AddressRepository repository;

	public void run(String... args) throws Exception {

		repository.deleteAll();

		repository.save(new Address("John", "Doe", "24", "hd1"));

		System.out.println("Address's found with findAll():");
		System.out.println("-------------------------------");
		for (Address address : repository.findAll()) {
			System.out.println(address);
		}
		System.out.println();


	}
}