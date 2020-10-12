package com.catalog.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Catalog {

	@Id
	@GeneratedValue
	private Long id;
	private String name;
	private String description;
	private int rating;
	
	public Catalog(String name, String description, int rating) {
		this.name = name;
		this.description = description;
		this.rating = rating;
	}

	public Catalog() {
	}

	

	public Catalog(Long id, String name, String description, int rating) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.rating = rating;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "Catalog [name=" + name + ", description=" + description + ", rating=" + rating + "]";
	}
	
	
	
	
}
