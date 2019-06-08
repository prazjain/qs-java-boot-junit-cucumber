package com.sample.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {
	
	@GetMapping("/sample/getObject/{id}")
	public ResponseEntity<?> getObject(final @PathVariable Long id) { 
		return ResponseEntity.ok().body("Object");
	}

}
