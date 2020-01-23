package com.hibernateMappingOneToOne.Instructor;

import javax.security.auth.login.Configuration;

import org.springframework.cglib.proxy.Factory;

import com.mysql.cj.Session;
import com.mysql.cj.xdevapi.SessionFactory;

public class HibernateUtil {

	private static SessionFactory factory;
	
	static {
		
		factory=new Configuration().configure().
				addAnnotatedClass(ToDo.class).
				buildSessionFactory();
	}
		private HibernateUtil() {
			
		}
		public static Session getSession()
		{
			return Factory.openSession();
		}
}
