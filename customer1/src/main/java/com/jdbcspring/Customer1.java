package com.jdbcspring;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Setter@Getter
@Component
public class Customer1 {
	private String uid;
	private String firstName;
	private String lastName;
	private String email;
	public Customer1(String firstName, String lastName, String email) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}
	@Override
	public String toString() {
		return "uid=" + uid + " firstName=" +
	firstName + " lastName=" + lastName + " email=" + email;


}
	
	}
