package com.netanel.imdb;

import java.io.IOException;
import java.util.*;

public class ImdbUI {
	private static final String ADD_CMD = "add",
								ADD_ACTOR_CMD = "add actor",
								VOTE_CMD = "vote",
								GET_CMD = "get",
								GET_ALL_CMD = "get all",
								FIND_ACTOR_CMD = "find actor",
								TOP_CMD = "top",
								SAVE_CMD = "save",
								LOAD_CMD = "load",
								DONE_CMD = "done";

	public static void runUI(IMDB imdb) {
		// Main UI function
		boolean done = false;
		String[] tokens;
		String availableCommands = "Available commands: " + 
										ADD_CMD + ", " + 
										ADD_ACTOR_CMD + ", " + 
										VOTE_CMD + ", " + 
										GET_CMD + ", " + 
										GET_ALL_CMD + ", " + 
										FIND_ACTOR_CMD + ", " + 
										TOP_CMD + ", " + 
										SAVE_CMD + ", " + 
										LOAD_CMD + ", "	+ 
										DONE_CMD + ".";
		System.out.println("Welcome to the IMDB User Interface.\n" + availableCommands);
		
		// UI Loop
		while (!done) {
			//Get line from user
			tokens = getLine();
			
			switch (tokens[0]) {
			case ADD_CMD:
				add(imdb, tokens);
				break;

			case VOTE_CMD:
				vote(imdb, tokens);
				break;

			case GET_ALL_CMD:
				System.out.println(imdb.getAll());
				break;

			case GET_CMD:
				get(imdb, tokens);
				break;

			case FIND_ACTOR_CMD:
				findActor(imdb, tokens);
				break;

			case TOP_CMD:
				getTop(imdb, tokens);
				break;

			case ADD_ACTOR_CMD:
				addActor(imdb, tokens);
				break;

			case SAVE_CMD:
				save(imdb);
				break;

			case LOAD_CMD:
				load(imdb);
				break;

			case DONE_CMD:
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
		return tokens;
	}

	private static void add(IMDB imdb, String[] tokens) {
		// Add movie to DB
		if (tokens.length == 1) {
			// Print usage if no arguments are given
			System.out.println("Add a movie to the DB.");
			System.out.println("USAGE: add;Movie Name;Actor 1;Actor 2...");
			return;
		}
		String name = tokens[1];
		// Create and populate a new set of actors
		Set<String> actors = new HashSet<>();
		for (int i = 2; i < tokens.length; i++) {
			actors.add(tokens[i]);
		}
		try {
			imdb.addMovie(name, actors);
			System.out.println(name + " successfully added to the DB.");
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	}

	private static void vote(IMDB imdb, String[] tokens) {
		// "vote" method
		if (tokens.length != 3) {
			// Print usage if more or less than 3 arguments are given
			System.out.println("Rank a movie in the DB.");
			System.out.println("USAGE: vote;Movie Name;vote (0-10)");
			return;
		}
		String name = tokens[1];
		int vote;
		try {
			// Parse vote integer from string
			vote = Integer.parseInt(tokens[2]);
		} catch (NumberFormatException e) {
			System.out.println("Vote must be a whole number between 0 and 10!");
			return;
		}
		try {
			imdb.vote(name, vote);
			System.out.println("Vote accepted");
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	}

	private static void get(IMDB imdb, String[] tokens) {
		// Gets a movie from DB
		if (tokens.length == 1) {
			// Print usage if no arguments are given
			System.out.println("Get a movie from the DB.");
			System.out.println("USAGE: get;Movie Name");
			return;
		}
		String name = tokens[1];
		if (!imdb.getMovies().containsKey(name)) {
			System.out.println("The movie '" + name + "' is not in the DB!");
			return;
		}
		System.out.println(imdb.getMovies().get(name));
	}

	private static void getTop(IMDB imdb, String[] tokens) {
		// Gets top ranked movies
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

	private static void addActor(IMDB imdb, String[] tokens) {
		// "add actor" method
		if (tokens.length == 1) {
			// Print usage if no arguments are given
			System.out.println("Add an actor(s) to a movie in the DB.");
			System.out.println("USAGE: add actor;Movie Name;Actor 1;Actor 2...");
			return;
		}
		String name = tokens[1];
		// Check that the movie exists in the IMDB map
		if (!imdb.getMovies().containsKey(name)) {
			System.out.println("The movie '" + name + "' is not in the DB!");
			return;
		}

		// Iterate the actors "list" and add to the movie
		for (int i = 2; i < tokens.length; i++) {
			try {
				imdb.getMovies().get(name).addActor(tokens[i]);
				System.out.println("Added " + tokens[i] + " to " + name);
			} catch (IllegalArgumentException e) {
				System.out.println(e.getMessage());
			}
		}
	}

	private static void save(IMDB imdb) {
		// Save the IMDB map to file
		try {
			imdb.save();
			System.out.println("Database saved succesfuly.");
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

	private static void load(IMDB imdb) {
		// Loads the IMDB map from file
		try {
			imdb.load();
			System.out.println("Database loaded succesfuly.");
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

	private static void findActor(IMDB imdb, String[] tokens) {
		// Find all movies by an actor
		if (tokens.length != 2) {
			// Print usage wrong number of arguments is given
			System.out.println("Finds all movies by an actor.");
			System.out.println("USAGE: find actor;Actor Name");
			return;
		}
		String actor = tokens[1];

		if (!imdb.getByActor(actor).isEmpty()) {
			System.out.println(imdb.getByActor(actor));
		} else {
			System.out.println("Could not find any movie by " + actor + "...");
		}
	}
}
