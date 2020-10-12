package com.rating.Models;

import java.util.List;

public class UserRatings {

	private List<rating> userRatings;

	public UserRatings(List<rating> userRatings) {
		this.userRatings = userRatings;
	}

	public UserRatings() {
	}

	public List<rating> getUserRatings() {
		return userRatings;
	}

	public void setUserRatings(List<rating> userRatings) {
		this.userRatings = userRatings;
	}

	
	
}
