package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

public class ProductController {

	@Autowired
	ProductRepository repo;

	@GetMapping("/products")
	public ResponseEntity<?> getAllProducts() {
		return ResponseEntity.ok(repo.findAll());
	}
}
