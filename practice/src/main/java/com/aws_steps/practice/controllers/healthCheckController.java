package com.aws_steps.practice.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class healthCheckController {
	
	@GetMapping("/")
	public ResponseEntity<String> healthCheckController()
	{
		return ResponseEntity.ok("ok");
	}

}

