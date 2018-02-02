package com.example.springAssignment;

import com.example.springAssignment.domain.User;
import com.example.springAssignment.domain.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class SpringAssignmentApplication {

	public static void main(String[] args) {

		SpringApplication.run(SpringAssignmentApplication.class, args);
	}

	@Bean
	CommandLineRunner init(UserRepository userRepository) {

		return args -> {
			userRepository.deleteAll();
			userRepository.save(new User("Josh", "Longton","admin","longton95@gmail.com", 1, 2, 3));
			userRepository.save(new User("Samir", "Mohammed","user","samir@gmail.com", 1, 2, 3));
			userRepository.save(new User("John", "Doe","user","john@gmail.com", 1, 2, 3));

			System.out.println(userRepository.findUserByEmail("longton95@gmail.com"));


		};

	}

}