package com.javaconfig.Customerconfig;

import java.util.List;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Component
public class Customer {
	private String uid;
	private String firstName;
	private String lastName;
	private String email;

	public Customer(String firstName, String lastName, String email) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}

	@Override
	public String toString() {
		return "uid=" + uid + " firstName=" + firstName + " lastName=" + lastName + " email=" + email;

	}
 

}