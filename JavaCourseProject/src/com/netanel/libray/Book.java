package com.netanel.libray;

public class Book implements Comparable<Book>{
	//
	// Attributes
	//
	
	String name;
	Author author;
	double price;
	int qty = 0;
		
	//
	// Constructors
	//
	public Book(String name){
		this.name = name;
	}
	
	public Book(String name, Author author, double price) {
		this.name = name;
		this.author = author;
		this.price = price;
	}
	
	public Book(String name, Author author, double price, int qty) {
		this.name = name;
		this.author = author;
		this.price = price;
		this.qty = qty;
	}


	//
	//Getters
	//
	
	public String getName() {
		return name;
	}

	public Author getAuthor() {
		return author;
	}

	public double getPrice() {
		return price;
	}

	public int getQty() {
		return qty;
	}

	//
	// Setters
	//
	
	public void setPrice(double price) {
		this.price = price;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}
	
	//
	// toString
	//
	public String toString() {
		return "Book [name=" + name + "," + author + ",price=" + price + ",qty=" + qty;
	}
	
	//
	// Methods
	//
	
	public String getAuthorName() {
		return author.getName();
	}
	
	public String getAuthorEmail() {
		return author.getEmail();
	}
	
	public char getAuthorGender() {
		return author.getGender();
	}

	@Override
	public int compareTo(Book o) {
		return this.name.compareTo(o.name);
	}
	
}
