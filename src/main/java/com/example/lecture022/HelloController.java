package com.example.lecture022;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	@GetMapping("/hello")
	public String hellow() {
		return "Hellow Spring";
	}
	
	@GetMapping("/hello2")
	public String hello2() {
		return "Hellow Spring";
	}
}
