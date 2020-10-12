package com.info.reposetories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.info.Models.Movie;

@RepositoryRestResource
public interface InfoRepo extends JpaRepository<Movie, Long>{

}
