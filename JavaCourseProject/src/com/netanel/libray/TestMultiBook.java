package com.netanel.libray;

public class TestMultiBook {
	public static void main(String[] args) {
		// Declare and allocate an array of Authors
		Author[] authors = new Author[2];
		authors[0] = new Author("Tan Ah Teck", "AhTeck@somewhere.com", 'm');
		authors[1] = new Author("Paul Tan", "Paul@nowhere.com", 'm');

		// Declare and allocate a Book instance
		MultiBook javaDummy = new MultiBook("Java for Dummy", authors, 19.99, 99);
		System.out.println(javaDummy);  // toString()
		
		for (int i = 0; i < javaDummy.getAuthor().length; i++) {
			System.out.println("Author: " + javaDummy.getAuthor()[i].getName() + ", Gender: " + javaDummy.getAuthor()[i].getGender());
		}
		
	}
}
