package com.example.demo.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Color {
	private String YourFavColor="GREEN";
	@GetMapping("/")
	public String getName() {
		return "My favorite color is " + YourFavColor+"!";
	}

	}



