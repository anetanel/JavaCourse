package com.netanel.imdb;

import java.io.IOException;
import java.util.*;

public class ImdbUI {
	public static void runUI(IMDB imdb) {
		// Main UI function
		boolean done = false;
		String[] tokens;
		String name;
		String availableCommands = "Available commands: add, add actor, vote, get, get all, top, save, load, done.";

		System.out.println("Welcome to the IMDB User Interface.\n" + availableCommands);
		while (!done) {
			tokens = getLine();
			switch (tokens[0]) {
			case "add":
				// "add" method
				if (tokens.length == 1) {
					// Print usage if no arguments are given
					System.out.println("Add a movie to the DB.");
					System.out.println("USAGE: add;Movie Name;Actor 1;Actor 2...");
					break;
				}
				name = tokens[1];
				Set<String> actors = new HashSet<>();
				for (int i = 2; i < tokens.length; i++) {
					actors.add(tokens[i]);
				}
				try {
					imdb.addMovie(name, actors);
				} catch (IllegalArgumentException e) {
					System.out.println(e.getMessage());
					break;
				}
				System.out.println(name + " successfully added to the DB.");
				break;

			case "vote":
				// "vote" method
				if (tokens.length == 1) {
					// Print usage if no arguments are given
					System.out.println("Rank a movie in the DB.");
					System.out.println("USAGE: vote;Movie Name;vote (0-10)");
					break;
				}
				name = tokens[1];
				int vote = Integer.parseInt(tokens[2]);
				try {
					imdb.vote(name, vote);
				} catch (IllegalArgumentException e) {
					System.out.println(e.getMessage());
					break;
				}
				System.out.println("Vote accepted");
				break;

			case "get all":
				// "get all" method
				System.out.println(imdb.getAll());
				break;
			case "get":
				// "get" method
				if (tokens.length == 1) {
					// Print usage if no arguments are given
					System.out.println("Get a movie from the DB.");
					System.out.println("USAGE: get;Movie Name");
					break;
				}
				name = tokens[1];
				if (!imdb.getMovies().containsKey(name)) {
					System.out.println("The movie '" + name + "' is not in the DB!");
					break;
				}
				System.out.println(imdb.getMovies().get(name));
				break;
				
			case "top":
				getTop(imdb, tokens);
				break;

			case "add actor":
				// "add actor" method
				if (tokens.length == 1) {
					// Print usage if no arguments are given
					System.out.println("Add an actor(s) to a movie in the DB.");
					System.out.println("USAGE: add actor;Movie Name;Actor 1;Actor 2...");
					break;
				}
				name = tokens[1];
				if (!imdb.getMovies().containsKey(name)) {
					System.out.println("The movie '" + name + "' is not in the DB!");
					break;
				}
				for (int i = 2; i < tokens.length; i++) {
					try {
						imdb.getMovies().get(name).addActor(tokens[i]);
						System.out.println("Added " + tokens[i] + " to " + name);
					} catch (IllegalArgumentException e) {
						System.out.println(e.getMessage());
					}
				}
				break;
				
			case "save":
				save(imdb);
				break;

			case "load":
				load(imdb);
				break;
				
			case "done":
				// End the loop
				done = true;
				System.out.println("Bye bye...");
				break;

			default:
				System.out.println(availableCommands);

			}
		}
	}

	private static String[] getLine() {
		// Splits a semi-colon delimited line to a String array
		@SuppressWarnings("resource")
		Scanner stdInScanner = new Scanner(System.in);
		String[] tokens = stdInScanner.nextLine().split(";");
		//stdInScanner.close();
		return tokens;
	}
	
	private static void getTop(IMDB imdb, String[] tokens) {
		// Define default top size to be used when an error occurs.
		int top, defaultTop = 8;
		if (imdb.getMovies().size() < defaultTop) {
			defaultTop = imdb.getMovies().size();
		}
		// Check if the user entered a top number
		if (tokens.length > 1) {
			top = Integer.parseInt(tokens[1]);
		} else {
			top = defaultTop;
		}
		try {
			System.out.println("Showing top " + top + " movies:\n" + imdb.getTop(top));
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
			System.out.println("Showing top " + defaultTop + " movies:\n" + imdb.getTop(defaultTop));
		}
	}
	
	private static void save(IMDB imdb) {
		try {
			imdb.save();
			System.out.println("Database saved succesfuly.");
		} catch (IOException e) {
			e.getMessage();
		}
	}
	
	private static void load(IMDB imdb) {
		try {
			imdb.load();
			System.out.println("Database loaded succesfuly.");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
