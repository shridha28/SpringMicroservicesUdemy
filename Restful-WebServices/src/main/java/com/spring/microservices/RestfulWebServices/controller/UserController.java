package com.spring.microservices.RestfulWebServices.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.microservices.RestfulWebServices.HelloWorldBean;
import com.spring.microservices.RestfulWebServices.dao.DaoService;
import com.spring.microservices.RestfulWebServices.model.User;


@RestController
@RequestMapping("/crud")
public class UserController {

	@Autowired
	private	DaoService service;
	
	
	@GetMapping("/users")
	public List<User> retriveAllUsers(){
		return service.findAll();
	}
	
	@GetMapping("/users/{userID}")
	public User retriveUser(@PathVariable Integer userID){
		return service.findOne(userID);
	}
	
	@PostMapping("/users/create")
	public void  createUser(@RequestBody User user) {
		User userReturn = service.save(user);
		
	}
	
	
	
}
