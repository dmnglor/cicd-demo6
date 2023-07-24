package com.devops.demo.cicddemo6.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	
	@GetMapping(value = "/hello")
	public String hello()
	{
		return "Hello to the world of devops";
	}
	@GetMapping(value = "/welcome")
	public String welcome()
	{
		return "Welcome to the world of devops";
	}
	

}
