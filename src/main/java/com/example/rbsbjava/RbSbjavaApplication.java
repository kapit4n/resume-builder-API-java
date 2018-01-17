package com.example.rbsbjava;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class RbSbjavaApplication {

	public static void main(String[] args) {
		SpringApplication.run(RbSbjavaApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo(ResumeRepository repository) {
		return (args) -> {
			// save a couple of customers
			repository.save(new Resume("Bauer"));
			repository.save(new Resume("O'Brian"));
			repository.save(new Resume("Bauer"));
			repository.save(new Resume("Palmer"));
			repository.save(new Resume("Dessler"));

			// fetch all customers
			System.out.println("Resumes found with findAll():");
			System.out.println("-------------------------------");
			for (Resume customer : repository.findAll()) {
				System.out.println(customer.toString());
			}
			System.out.println("");

			// fetch an individual customer by ID
			Resume customer = repository.findOne(1L);
			System.out.println("Resume found with findOne(1L):");
			System.out.println("--------------------------------");
			System.out.println(customer.toString());
			System.out.println("");

			// fetch customers by last name
			System.out.println("Resume found with findByContent('Bauer'):");
			System.out.println("--------------------------------------------");
			for (Resume bauer : repository.findByContent("Bauer")) {
				System.out.println(bauer.toString());
			}
			System.out.println("");
		};
	}

}
