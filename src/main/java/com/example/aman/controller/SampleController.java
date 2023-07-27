package com.example.aman.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {
	
	@GetMapping("/")
	public String helloWorld() {
		return "Hello world";
	}
	
	@GetMapping("/home")
	public String home() {
		return "This is Home Route";
	}

}
