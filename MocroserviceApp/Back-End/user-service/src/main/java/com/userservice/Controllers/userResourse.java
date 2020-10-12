package com.userservice.Controllers;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.userservice.Models.user;
import com.userservice.reposertories.userRepo;

@RestController
@RequestMapping("users")
@CrossOrigin(origins="http://localhost:3000",allowedHeaders = "*")
public class userResourse {

	@Autowired
	private userRepo userReposetory;
	
	@GetMapping("")
	public List<user> getUsers(){
		return userReposetory.findAll();
	}
	
}
