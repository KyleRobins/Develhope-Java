package com.example.springboot.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Random;

@RestController
public class HelloController {

	@GetMapping("/hello")
	public String hello() {
		return "Hello World!";
	}

	@GetMapping("/greeting")
	public ResponseEntity<String> greeting() {
		return ResponseEntity.ok("Good Afternoon!");
	}

	@GetMapping("/info")
	public ResponseEntity<String> info() {
		return ResponseEntity.ok("Information retrieved successfully!");
	}

	@GetMapping("/random")
	public ResponseEntity<String> random() {
		boolean result = new Random().nextBoolean();
		if (result) {
			return ResponseEntity.ok("200 OK");
		} else {
			return ResponseEntity.status(400).body("400 Bad Request");
		}
	}
}
