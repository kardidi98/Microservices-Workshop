package com.catalog.Models;

import java.util.List;

public class UserRatings {

	private List<Rating> userRatings;

	public UserRatings(List<Rating> userRatings) {
		this.userRatings = userRatings;
	}

	public UserRatings() {
	}

	public List<Rating> getUserRatings() {
		return userRatings;
	}

	public void setUserRatings(List<Rating> userRatings) {
		this.userRatings = userRatings;
	}

	
	
}
