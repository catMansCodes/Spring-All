package com.hellocat.hellocat.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloCatController {

	@GetMapping("/hello")  
	public String hello(){  
		return "Hello Cat";  
	}  
}
