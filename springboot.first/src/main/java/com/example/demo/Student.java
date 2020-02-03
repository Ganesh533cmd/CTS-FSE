package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Student {
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	public String id;
	public String first_name;
	public String last_name;
	public String e_mail;
}
