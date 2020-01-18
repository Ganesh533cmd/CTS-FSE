package com.company.springdemo;

import java.util.UUID;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Appl {
	
		
	    public static void main( String[] args )
	    {
	      try {
	    	  ApplicationContext context=new ClassPathXmlApplicationContext("appContext.xml");
	    	  CustomerDao dao=context.getBean("dao",CustomerDao.class);
	    	  Customer c=dao.createCustomer(new Customer(UUID.randomUUID().toString(),"neem", "Dove", ".com"));
	    	  System.out.println(c);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	    
	    }}
	    

