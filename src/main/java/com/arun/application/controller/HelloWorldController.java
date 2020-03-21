package com.arun.application.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	@RequestMapping("/hello")
	public String helloWorld() {
		
		return "Hello World";
	}
	
	@RequestMapping("/howareyou")
	public String howAreYou() {
		
		return "I am Fine";
	}
	
	

}
