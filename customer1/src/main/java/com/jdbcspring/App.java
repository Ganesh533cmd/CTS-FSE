package com.jdbcspring;

import java.io.Closeable;
import java.io.IOException;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
static CustomerService service;
	
    public static void main( String[] args )
    {
    	
    	ClassPathXmlApplicationContext context=null;
    	
    	
    	
    	
    	try {
			context=new ClassPathXmlApplicationContext();
			service=context.getBean("service",CustomerService.class);
			List<Customer1> l=service.getAllCustomers();
			l.forEach(c1->{
				System.out.println(c1);
			});
		} catch (Exception e) {
			e.printStackTrace();
		}
    	finally {
			try {
				((Closeable) context).close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
}
}

