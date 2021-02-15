package com.example.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.beans.User;
import com.example.service.UserService;

@RestController
public class Controller {
	
	@Autowired
	public UserService userservice;
	
	@GetMapping("/all")
	public ArrayList<User> findAll() {
		return userservice.findall();
	}
	
	@GetMapping("/find/{id}")
	public User findOneUser(@PathVariable int id) {
		return userservice.findOneUser(id);
	}
	
	@PostMapping("/save")
	public User saveUser(@RequestBody User user) {
		return userservice.saveUser(user);
	}
	

}
