package com.rating.ratingReposetories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.http.ResponseEntity;

import com.rating.Models.rating;
import com.rating.Models.user;

@RepositoryRestResource
public interface ratingRepo extends JpaRepository<rating, Long>{


	
	public List<rating> findByUtilisateur(Long utilisateur);

	public rating findByMovieId(Long movieId);
}
