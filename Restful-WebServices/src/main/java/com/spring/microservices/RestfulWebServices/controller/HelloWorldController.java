package com.spring.microservices.RestfulWebServices.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.microservices.RestfulWebServices.HelloWorldBean;


@RestController
@RequestMapping("/microservices")
public class HelloWorldController {
	
	@GetMapping("/message")
	public String getMessage() {
		
		return "Hello World";
	}
	
	@GetMapping("/messagebean")
	public HelloWorldBean getMessageBean() {
		
		return new HelloWorldBean("Hello Shridha Jalihal");
	}
	
	@GetMapping("/messagebean/{name}")
	public HelloWorldBean getNameMessage(@PathVariable String name) {
		
		return new HelloWorldBean("Hello "+name+" Welcome to Rest WebService");
	}

}
