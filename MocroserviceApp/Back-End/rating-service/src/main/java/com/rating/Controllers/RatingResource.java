package com.rating.Controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rating.Models.Rating;
import com.rating.Models.UserRatings;

@RestController
@RequestMapping("rating")
public class RatingResource {

	@GetMapping("/{movieId}")
	public Rating getRating(@PathVariable("movieId") String movieId) {
		return new Rating(movieId, 5);
	}
	
	@GetMapping("/user/{userId}")
	public  UserRatings getUserRatings(@PathVariable("userId") String userId) {
		List<Rating> ratings = Arrays.asList(
				new Rating("1", 5),
				new Rating("2", 3)
		);
		UserRatings userRatings = new UserRatings(ratings);
		return userRatings;
	}
}
