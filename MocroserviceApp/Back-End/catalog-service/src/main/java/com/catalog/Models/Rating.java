package com.catalog.Models;

public class Rating {

	
	private Long id;
	private Long movieId;
	private int rating;
	
	private Long utilisateur;
	
	public Rating(Long movieId, int rating, Long utilisateur) {
		this.movieId = movieId;
		this.rating = rating;
		this.utilisateur = utilisateur;
	}
	public Rating(Long movieId, int rating) {
		this.movieId = movieId;
		this.rating = rating;
	}
	public Rating() {
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getMovieId() {
		return movieId;
	}
	public void setMovieId(Long movieId) {
		this.movieId = movieId;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public Long getUtilisateur() {
		return utilisateur;
	}
	public void setUtilisateur(Long utilisateur) {
		this.utilisateur = utilisateur;
	}
	
}
