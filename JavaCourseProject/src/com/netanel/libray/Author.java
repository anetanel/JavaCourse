package com.netanel.libray;

public class Author {
	//
	// Attributes
	//
	
	private String name;
	private String email;
	private char gender;
	
	//
	// Constructors
	//
	
	public Author(String name, String email, char gender) {
		this.name = name;
		this.email = email;
		this.gender = gender;				
	}
	
	//
	// Getters
	//
	
	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public char getGender() {
		return gender;
	}

	//
	// Setters
	//
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	//
	// toString
	//
	public String toString() 
	{
		return "Author[name=" + name+ ",email=" + email + ",gender=" + gender + "]";
	}
}
