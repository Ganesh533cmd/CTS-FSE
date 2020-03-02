package com.example.demo;

import javax.annotation.Generated;

import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan
@Table
public class Product {

	@Id
	@Generated
	private Integer id;

	@Column
	private String name;

	public Product() {
	}

	public Product(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}
}
