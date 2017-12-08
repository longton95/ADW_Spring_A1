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

		repository.save(new Address("Josh", "Longton", "24", "HD3 4YW"));
		repository.save(new Address("Samir", "Mohammed", "12", "HD3 2YB"));
		repository.save(new Address("John", "Doe", "1", "AA1 2BB"));

		System.out.println("Address's found with findAll():");
		System.out.println("-------------------------------");
		for (Address address : repository.findAll()) {
			System.out.println(address);
		}
		System.out.println();


	}
}