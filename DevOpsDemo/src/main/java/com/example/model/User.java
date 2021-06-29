package com.example.model;

public class User {
	
	private String firstName;
	private String lastName;
	private String username;
	private String password;
	
	public User() {
		
	}
	
	public User(String firstName, String lastName, String username, String password) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.username = username;
		this.password = password;
	}

	@Override
	public String toString() {
		return "User [firstName=" + firstName + ", lastName=" + lastName + ", username=" + username + ", password="
				+ password + "]";
	}
}
