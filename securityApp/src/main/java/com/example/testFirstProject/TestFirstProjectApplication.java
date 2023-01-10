package com.example.testFirstProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
public class TestFirstProjectApplication {
	public static void main(String[] args) {
		SpringApplication.run(TestFirstProjectApplication.class, args);
	}

}
