package com.netanel.imdb;

import java.io.*;
import java.util.*;

public class IMDB implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//
	// Attributes
	//
	private Map<String, Movie> movies = new HashMap<>();
	
	//
	// Constructors
	//
	public IMDB() {}
	
	//
	// Functions
	//
	public Map<String, Movie> getMovies() {
		//Return Map of all Movies
		return movies;
	}
	
	public Collection<Movie> getAll(){
		//Return Collection of all Movies
		return movies.values();
	}
	
	public Movie addMovie(String name, Set<String> actors){
		//Create new movie and add to the DB
		if (movies.containsKey(name)){
			throw new IllegalArgumentException(name + " already exists in DB");
		}
		//Movie movie = new Movie(name, actors);
		movies.put(name, new Movie(name, actors));
		return movies.get(name);
	}
	
	
	public void addMovie(){
		Movie movie = new Movie();
		movies.put(movie.getName(), movie);
	}
	

	public double vote(String name, int voting){
		//send a single vote for a movie. Returns the new calculated rank.
		if (movies.get(name) == null) {
			throw new IllegalArgumentException(name + " does not exist in DB!");
		}
		movies.get(name).updateRank(voting);
		return movies.get(name).getRank();
	}
	
	public List<Movie> getTop(int number){
		// Returns a list of size 'number', of top ranked movies.
		if (number > movies.size()){
			throw new IllegalArgumentException(number + " is larger than movies size " + movies.size());
		}
		if (number < 1) {
			throw new IllegalArgumentException("Illegal number: " + number);
		}
		List<Movie> movieList = new ArrayList<>(movies.values());
		// Define a Comperator by rank
		Collections.sort(movieList, (m1, m2) -> {
			if (m1.getRank() < m2.getRank()) return 1;
			if (m1.getRank() > m2.getRank()) return -1;
			return 0;			
		});
		return movieList.subList(0, number);
	}
	
	public void save() throws IOException {
		ObjectOutputStream out = new ObjectOutputStream(
				new FileOutputStream("imdb.dat"));
		out.writeObject(movies);
		out.close();
	}
	
	public void load() throws IOException, ClassNotFoundException {
		ObjectInputStream in = 
				new ObjectInputStream(
						new FileInputStream("imdb.dat"));
		movies = (Map<String, Movie>)in.readObject();
		in.close();
	}
	
}
