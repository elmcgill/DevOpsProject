package com.example.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.example.model.User;

@Component
public class UserDao {

	public UserDao() {
		
	}
	
	public List<User> getAllUsers(){
		List<User> users = new ArrayList<User>();
		users.add(new User("Rick", "Sanchez", "rick", "password"));
		users.add(new User("Summer", "Smith", "summer", "password"));
		users.add(new User("Morty", "Smith", "morty", "password"));
		return users;
	}
	
}
