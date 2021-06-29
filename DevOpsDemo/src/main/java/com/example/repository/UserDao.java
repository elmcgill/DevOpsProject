package com.example.repository;

import java.util.ArrayList;
import java.util.List;
import com.example.model.User;

public class UserDao {
	
	public List<User> getAllUsers(){
		List<User> users = new ArrayList<User>();
		users.add(new User("Ethan", "McGill", "emcgill", "password"));
		return users;
	}
	
}
