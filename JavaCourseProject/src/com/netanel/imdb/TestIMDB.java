package com.netanel.imdb;

import java.io.*;
import java.util.*;

public class TestIMDB {
	public static void main(String[] args) throws Exception, IOException {

//		Movie m1 = new Movie("Agmageddon", new HashSet<>());
//		m1.addActor("Bruce Willis");
//		m1.addActor("Ben Affleck");
////		m1.addActor("Ben Affleck");
//		
//		System.out.println(m1);
//		System.out.println(m1.getActors());
//		
//		m1.setName("Armageddon (1998)");
//		System.out.println(m1);
//		
//		Set<String> actors = new HashSet<>();
//		actors.add("Billy Bob Thornton");
//		m1.setActors(actors);
//		
//		System.out.println(m1);
//		System.out.println(m1.getActors());
//		
//		
//		System.out.println("*******************************");
//		
//		IMDB imdb = new IMDB();
//		
//		Set<String> killBillActors = new HashSet<>();
//		killBillActors.add("Uma Thurman");
//		killBillActors.add("Lucy Liu");
//		imdb.addMovie("Kill Bill", killBillActors);
//		System.out.println(imdb.getAll());
//		
////		imdb.addMovie("Kill Bill", new HashSet<>());
//		
//		Set<String> reservoirDogsActors = new HashSet<>();
//		reservoirDogsActors.add("Harvey Keitel");
//		imdb.addMovie("Reservoir Dogs", reservoirDogsActors);
//		System.out.println(imdb.getAll());
//		
//		System.out.println("*******************************");
//		
//		imdb.vote("Kill Bill", 9);
//		imdb.vote("Kill Bill", 10);
//		imdb.vote("Kill Bill", 0);
//		imdb.vote("Kill Bill", 3);
//		imdb.vote("Kill Bill", 4);
//		imdb.vote("Kill Bill", 5);
//		imdb.vote("Kill Bill", 6);
//		
//		imdb.addMovie();
//		System.out.println(imdb.getAll());
//		
//		Set<String> starWarsActors = new HashSet<String>(Arrays.asList("Mark Hamill", "Harrison Ford", "Carrie Fisher"));
//		System.out.println(starWarsActors);
//		imdb.addMovie("Star Wars", starWarsActors);
//		System.out.println(imdb.getAll());
//		System.out.println("*******************************************");
//		System.out.println(imdb.getMovies().get("Star Wars"));
//		
//		// First, create an actor set
//		Set<String> starWarsActors = new HashSet<>();
//		// Populate it with actors
//		starWarsActors.add("Mark Hamill");
//		starWarsActors.add("Harrison Ford");
//		starWarsActors.add("Carrie Fisher");
//		// Create a new movie with the actors set
//		Movie starWars = new Movie("Star Wars", starWarsActors);
//		System.out.println("Original actors:\n" + starWars);
//		
//		// Remove an actor from the set (or create another set...)
//		starWarsActors.remove("Harrison Ford");
//		// Call setActors with the new set
//		starWars.setActors(starWarsActors);
//		System.out.println("New actors:\n" + starWars);
//		
//		System.out.println("***************");
//		// Another way is by accessing the movie from the IMDB
//		IMDB imdb = new IMDB();
//		// Create an actors set (you can use this cool shortcut) 
//		Set<String> killBillActors = new HashSet<>(Arrays.asList("Uma Thurman", "Lucy Liu", "Daryl Hannah"));
//		// Add a new movie to the IMDB, with the actors set
//		imdb.addMovie("Kill Bill", killBillActors);
//		// Print the movie from the IMDB
//		System.out.println("Original actors:\n" + imdb.getMovies().get("Kill Bill"));
//		// Create another actors set, just for fun :)
//		Set<String> newKillBillActors = new HashSet<>(Arrays.asList("David Carradine", "Uma Thurman", "Michael Madsen", "Lucy Liu", "Daryl Hannah"));
//		// Access the Movie object from the IMDB object and call setActors
//		imdb.getMovies().get("Kill Bill").setActors(newKillBillActors);
//		// Create an object referance for the movie, for ease of use
//		Movie killBill = imdb.getMovies().get("Kill Bill");
//		System.out.println("New actors:\n" + killBill);
//		
//		Movie testMovie = imdb.addMovie("Test Movie", new HashSet<>(Arrays.asList("Sami", "Susu")));
//		System.out.println(testMovie);
//		
//		imdb.addMovie(T);
//		System.out.println("*****************************");
		IMDB imdb = new IMDB();
		imdb.addMovie("Kill Bill", new HashSet<>(Arrays.asList("Uma Thurman", "Lucy Liu")));
//		imdb.addMovie("ATest2", new HashSet<>(Arrays.asList("Sami2", "Susu2")));
//		imdb.addMovie("BTest3", new HashSet<>(Arrays.asList("Sami3", "Susu3")));
//		imdb.addMovie("TTest4", new HashSet<>(Arrays.asList("Sami4", "Susu4")));
//		imdb.addMovie("STest5", new HashSet<>(Arrays.asList("Sami5", "Susu5")));
//		imdb.addMovie("STest25", new HashSet<>(Arrays.asList("Sami5", "Susu5")));
//		imdb.addMovie("STest35", new HashSet<>(Arrays.asList("Sami5", "Susu5")));
//		imdb.addMovie("STest45", new HashSet<>(Arrays.asList("Sami5", "Susu5")));
//		imdb.addMovie("STest55", new HashSet<>(Arrays.asList("Sami5", "Susu5")));
//		imdb.addMovie("STest65", new HashSet<>(Arrays.asList("Sami5", "Susu5")));
//		imdb.addMovie("STest75", new HashSet<>(Arrays.asList("Sami5", "Susu5")));
//		imdb.addMovie("STest85", new HashSet<>(Arrays.asList("Sami5", "Susu5")));
//		imdb.addMovie("STest95", new HashSet<>(Arrays.asList("Sami5", "Susu5")));
//		imdb.addMovie("STest05", new HashSet<>(Arrays.asList("Sami5", "Susu5")));
//		imdb.addMovie("STest115", new HashSet<>(Arrays.asList("Sami5", "Susu5")));
//		imdb.addMovie("STest225", new HashSet<>(Arrays.asList("Sami5", "Susu5")));
//		imdb.addMovie("STest335", new HashSet<>(Arrays.asList("Sami5", "Susu5")));
//		imdb.addMovie("STest445", new HashSet<>(Arrays.asList("Sami5", "Susu5")));
		
//		imdb.vote("XTest1", 0);
//		imdb.vote("XTest1", 1);
//		imdb.vote("XTest1", 2);
//		imdb.vote("XTest1", 3);
//		imdb.vote("XTest1", 4);
//		imdb.vote("XTest1", 5);
//		imdb.vote("XTest1", 6);
//		imdb.vote("XTest1", 10);
//		imdb.vote("XTest1", 10);
//		imdb.vote("ATest2", 2);
//		imdb.vote("BTest3", 5);
//		imdb.vote("TTest4", 9); 
//		imdb.vote("STest5", 10);
		//System.out.println(imdb.getAll());
		//System.out.println(imdb.getTop(4));
		
//		List<Movie> test = new ArrayList<>(imdb.getMovies().values());
//		System.out.println(test);
//		Collections.sort(test);
//		System.out.println(test);
		
		ImdbUI.runUI(imdb);
//		ObjectOutputStream out = new ObjectOutputStream(
//				new FileOutputStream("book.dat"));
//		out.writeObject(imdb);
//		out.close();
//		
//		ObjectInputStream in = 
//				new ObjectInputStream(
//						new FileInputStream("book.dat"));
//		IMDB b2 = (IMDB)in.readObject();
//		in.close();
//		ImdbUI.runUI(b2);
		
	}
}
