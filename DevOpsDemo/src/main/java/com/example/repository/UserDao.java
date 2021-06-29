package com.example.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.model.User;

public class UserDao {
	
	@Autowired
	public UserDao() {
		
	}
	
	public List<User> getAllUsers(){
		List<User> users = new ArrayList<User>();
		users.add(new User("Ethan", "McGill", "emcgill", "password"));
		return users;
	}
	
}
