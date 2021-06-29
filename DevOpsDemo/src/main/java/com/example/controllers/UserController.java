package com.example.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.repository.UserDao;
import com.example.model.User;

@CrossOrigin(origins="*")
@Controller("UserController")
@RequestMapping("/users")
public class UserController {
	
	private UserDao uDao;
	
	public UserController() {
		super();
	}
	
	@Autowired
	public UserController(UserDao uDao) {
		this.uDao = uDao;
	}
	
	@GetMapping("/")
	public List<User> getAllUsers(){
		return uDao.getAllUsers();
	}
	
}
