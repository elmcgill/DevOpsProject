package com.example.controllers;

import java.awt.PageAttributes.MediaType;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.User;
import com.example.repository.UserDao;

@CrossOrigin(origins="*")
@RestController
public class UserController {
	
	private UserDao udao;
	
	@Autowired
	public UserController(UserDao udao) {
		this.udao = udao;
	}
	
	@GetMapping("/users")
	public List<User> getAllUsers(){
		List<User> users = udao.getAllUsers();
		return users;
	}
	
}
