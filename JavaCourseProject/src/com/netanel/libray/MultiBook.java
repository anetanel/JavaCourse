package com.netanel.libray;

public class MultiBook {
	//
	// Attributes
	//
	
	String name;
	Author authors[];
	double price;
	int qty = 0;
		
	//
	// Constructors
	//
	
	public MultiBook(String name, Author[] authors, double price) {
		this.name = name;
		this.authors = authors;
		this.price = price;
	}
	
	public MultiBook(String name, Author[] authors, double price, int qty) {
		this.name = name;
		this.authors = authors;
		this.price = price;
		this.qty = qty;
	}


	//
	//Getters
	//
	
	public String getName() {
		return name;
	}

	public Author[] getAuthor() {
		return authors;
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
		String strAuthors = "";
		for (int i = 0; i < authors.length; i++) {
			if (i != 0){
				strAuthors += ",";
			}
			strAuthors += authors[i];
		}
		return "Book [name=" + name + ",authors={" + strAuthors + "},price=" + price + ",qty=" + qty;
	}
	
	//
	// Methods
	//
	
//	public String getAuthorName() {
//		return author.getName();
//	}
//	
//	public String getAuthorEmail() {
//		return author.getEmail();
//	}
//	
//	public char getAuthorGender() {
//		return author.getGender();
//	}
	
}
