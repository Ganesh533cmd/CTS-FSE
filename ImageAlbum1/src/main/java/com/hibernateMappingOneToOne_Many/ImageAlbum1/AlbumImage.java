package com.hibernateMappingOneToOne_Many.ImageAlbum1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class AlbumImage {

public static void main(String[] args) {

		
		SessionFactory factory = new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Album.class)
								.addAnnotatedClass(AlbumDetail.class)
								.addAnnotatedClass(Image.class)
								.buildSessionFactory();
		

		Session session = factory.getCurrentSession();
		
		try {			
			session.beginTransaction();
			int theId = 1;
			Album tempAlbum = session.get(Album.class, theId);		
			Image tempImage1 = new Image("Air Guitar - The Ultimate Guide");
			Image tempImage2 = new Image("The Pinball Masterclass");
			tempAlbum.add(tempImage1);
			tempAlbum.add(tempImage2);
			session.save(tempImage1);
			session.save(tempImage2);
			session.getTransaction().commit();
			System.out.println("Done!");
		}
		finally {
		//	session.close();
			factory.close();
		}
	}

}
