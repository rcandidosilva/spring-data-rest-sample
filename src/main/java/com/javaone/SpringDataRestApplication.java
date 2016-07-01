package com.javaone;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

@SpringBootApplication
public class SpringDataRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDataRestApplication.class, args);
	}


	@Bean
	CommandLineRunner runner(PersonRepository repo) {
		return args -> {
			Arrays.asList("Rodrigo, Maria, Manuel, Joaquim".split(","))
					.forEach(x -> repo.save(new Person(x, new Address("address xpto"))));
			repo.findAll().forEach(System.out::println);
		};
	}

}
