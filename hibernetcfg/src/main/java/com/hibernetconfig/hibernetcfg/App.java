package com.hibernetconfig.hibernetcfg;

import java.io.IOException;
import java.sql.SQLException;
import java.time.LocalDate;

/**
 * Hello world!
 *
 */
public class App 
{
	private static PersonService service;
	static {
		service=new PersonServiceImpl();
	}
	public static void main(String[] args) throws IOException,SQLException

	{
		Person p=service.createPerson(new Person("76gt", "ygyu", LocalDate.now()));
	  //Person p=service.getPersonByid(100);
	  System.out.println(p);
		 
    }
}
