package com.hibernateMappingOneToOne.Instructor;

import java.io.IOException;

public class Appli {

	private static ToDoService service;
	static {
		service=new ToDoServiceImpl();
	}
	public static void main(String[] args) throws IOException

	{
		
		
		
		
		/*
		 * Person p=service.createPerson(new Person("U102","Rahul",LocalDate.now()));
		 * System.out.println(p);
		 */
		 
		
		  ToDo p=service.getToDoByid(100);
		  System.out.println(p);
}
