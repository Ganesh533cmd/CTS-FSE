package com.hibernateMappinghbm.User;

import org.h2.engine.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
@Repository("dao")
public class UserDAOImpl  implements UserDAO {
	
	private SessionFactory sessionFactory;
	private Session session;
	

	public UserDAOImpl(SessionFactory sessionFactory) {
		super();
		this.sessionFactory = sessionFactory;
	}

	{
		session = sessionFactory.openSession();
	}

	public UserDAO createUser(User a) {
		session.save(uId);

		return a;
	}
{

	
}


public void findbyId(int uId) {
	// TODO Auto-generated method stub
	
}


public char[] deleteUser(int uId) {
	// TODO Auto-generated method stub
	return null;
}


public char[] createUser(int uId) {
	// TODO Auto-generated method stub
	return null;
}
}
