package com.cognito.controller;

import java.security.Principal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Resource {
	
	@GetMapping("/getUser")
	public String getUserName (Principal principal){
		System.err.println("it working");
		return "Currently logged user Id :: " + principal.getName();
	}

}
