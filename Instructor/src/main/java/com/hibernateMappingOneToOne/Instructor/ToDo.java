package com.hibernateMappingOneToOne.Instructor;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class ToDo {

	@Id@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String uId;
	@Column(name = "name")
	private String cName;
	@Column(name = "dob")
	private LocalDate dateOfBirth;
	public ToDo(String uId, String cName, LocalDate dateOfBirth) {
		super();
		this.uId = uId;
		this.cName = cName;
		this.dateOfBirth = dateOfBirth;
	}
	public void setFirstName(String name) {
		// TODO Auto-generated method stub
		
	}
	public void setDateOfBirth(LocalDate now) {
		// TODO Auto-generated method stub
		
	}
}
