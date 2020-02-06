package com.example.demo;

import com.example.demo.User;
import com.example.demo.SharedUser;
public interface UserService {

	public SharedUser createUser(User user);
	public SharedUser findUserById(Integer id);

}
