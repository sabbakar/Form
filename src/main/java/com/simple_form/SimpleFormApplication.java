package com.simple_form;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = "com.simple_form.repository")
@SpringBootApplication
public class SimpleFormApplication {

	public static void main(String[] args) {
		SpringApplication.run(SimpleFormApplication.class, args);
	}

}
