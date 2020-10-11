package com.info.RestControllers;

import java.util.Arrays;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.info.Models.Movie;

@RestController
@RequestMapping("/info")
public class InfoResource {

	@GetMapping("/{id}")
	public Movie getInfo(@PathVariable("id") String id) {
		return new Movie(id, "Aladin");
	}
}
