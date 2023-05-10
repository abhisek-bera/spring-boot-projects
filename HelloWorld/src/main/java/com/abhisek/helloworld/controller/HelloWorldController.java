package com.abhisek.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author Abhisek
 * This class acts as a REST Controller
 */
@RestController
public class HelloWorldController {

	/**
	 * This is a controller method which acts as an end point - GET method
	 * @returns a String "Hello World"
	 */
	@PostMapping("/hello") 
	public String getHelloWorld(@PathVariable, ){
		return "Hello World!!";
	}
}
