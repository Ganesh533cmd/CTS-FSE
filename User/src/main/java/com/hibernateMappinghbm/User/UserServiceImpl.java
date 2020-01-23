package com.hibernateMappinghbm.User;

import org.springframework.transaction.annotation.Transactional;

public class UserServiceImpl implements UserService {
	private UserDAO dao;

	public UserServiceImpl(UserDAO dao) {
		super();
		this.dao = dao;
	}

	@Transactional
	public UserDAO createUser(UserDAO user) {
		// TODO Auto-generated method stub
		return dao.createUser(user);
	}{

	
}
}