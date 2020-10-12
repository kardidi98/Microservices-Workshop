package com.rating.Controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.rating.Models.rating;
import com.rating.Models.UserRatings;
import com.rating.Models.user;
import com.rating.ratingReposetories.ratingRepo;

@RestController
@RequestMapping("ratings")
@CrossOrigin(origins="http://localhost:3000",allowedHeaders = "*")
public class RatingResource {

	
	@Autowired
	private RestTemplate restTemplate;
	
	@Autowired
	private ratingRepo ratingRepository; 
	
	@GetMapping("/{movieId}")
	public rating getRating(@PathVariable("movieId") Long movieId) {
		return ratingRepository.findByMovieId(movieId);
	}
	
	@GetMapping("/user/{userId}")
	public  UserRatings getUserRatings(@PathVariable("userId") Long userId) {
		
		//ResponseEntity<user> utilisateur = restTemplate.getForEntity("http://user-service/users/"+userId, user.class);
		
		
		List<rating> ratings = ratingRepository.findByUtilisateur(userId);
		UserRatings userRatings = new UserRatings(ratings);
		return userRatings;
	}
}
