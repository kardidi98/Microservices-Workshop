package com.userservice;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

import com.userservice.Models.user;
import com.userservice.reposertories.userRepo;
@EnableEurekaClient
@SpringBootApplication
public class UserServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserServiceApplication.class, args);
	}
	
	@Bean
	CommandLineRunner run(userRepo ur) {
		return arg -> {
			ur.save(new user((long) 1,"Ahmed"));
			System.out.println(ur.findAll());
		};
	}

}
