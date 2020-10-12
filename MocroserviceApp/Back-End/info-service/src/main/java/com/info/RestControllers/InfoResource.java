package com.info.RestControllers;

import java.util.Arrays;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.info.Models.Movie;
import com.info.reposetories.InfoRepo;

@RestController
@RequestMapping("movies")
public class InfoResource {

	
	@Autowired
	private InfoRepo infoRepo;
	
	@GetMapping("/{id}")
	public Optional<Movie> getInfo(@PathVariable("id") Long id) {
		return infoRepo.findById(id);
	}
}
