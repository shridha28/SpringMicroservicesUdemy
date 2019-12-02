package com.spring.microservices.RestfulWebServices;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


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

}
