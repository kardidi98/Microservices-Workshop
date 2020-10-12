package com.rating;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import com.rating.Models.rating;
import com.rating.ratingReposetories.ratingRepo;

@SpringBootApplication
@EnableEurekaClient
public class RatingServiceApplication {

	
	@Bean
	@LoadBalanced
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}
	
	public static void main(String[] args) {
		SpringApplication.run(RatingServiceApplication.class, args);
	}

	@Bean
	CommandLineRunner run(ratingRepo rR) {
		return arg -> {
			rR.save(new rating((long) 2, 3, (long) 1));
			System.out.println(rR.findAll());
		};
	}
}
