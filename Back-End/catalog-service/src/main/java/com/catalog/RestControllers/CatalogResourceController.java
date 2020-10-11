package com.catalog.RestControllers;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import com.catalog.Models.Catalog;
import com.catalog.Models.Movie;
import com.catalog.Models.Rating;
import com.catalog.Models.UserRatings;

@RestController
@RequestMapping("/catalog")
public class CatalogResourceController {
	
	@Autowired
	private RestTemplate restTemplate;
	
	//Reactive Programming :  Web Client
	@Autowired
	private WebClient.Builder webClientBuilder;
	
	@GetMapping("/{userId}")
	public List<Catalog> getListCatalogItem(@PathVariable("userId") String userId){
		
		//RestTemplate restTemplate = new RestTemplate();
		
		
		UserRatings ratings= restTemplate.getForObject("http://rating-service/rating/user/"+userId, UserRatings.class);
		
		/*List<Rating> ratings = Arrays.asList(
				new Rating("1", 5),
				new Rating("2", 3)
		);*/
		
		return ratings.getUserRatings().stream().map(rating -> {
			Movie movie = restTemplate.getForObject("http://info-service/info/"+rating.getMovieId(), Movie.class);
			
			return new Catalog(movie.getName(), "Desc", rating.getRating());
		}).collect(Collectors.toList());
		
		
	}

}


/*Movie movie = webClientBuilder.build()
.get()
.uri("http://localhost:8082/info/"+rating.getMovieId())
.retrieve()
.bodyToMono(Movie.class)
.block();*/
