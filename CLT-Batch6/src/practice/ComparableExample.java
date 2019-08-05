package practice;

import java.util.ArrayList;
import java.util.Collections;

class Movie implements Comparable<Movie> {
	
	private String name;
	private double rating;
	private int yearReleased;
	
	// Used to sort movies by year
	@Override
	public int compareTo(Movie m) {
		return this.yearReleased - m.yearReleased;
	}
	
	// Constructor
	public Movie (String name, double rating, int yearReleased) {
		this.name = name;
		this.rating = rating;
		this.yearReleased = yearReleased;
	}
	
	// Getter methods for accessing private variables
	public String getName() {
		return name;
	}
	public double getRating() {
		return rating;
	}
	public int getYearReleased() {
		return yearReleased;
	}
	
}

public class ComparableExample {

	public static void main(String[] args) {
		
		ArrayList<Movie> myList = new ArrayList<Movie>();
		myList.add(new Movie("Movie B", 7.5, 1980));
		myList.add(new Movie("Movie A", 8.0, 2001));
		myList.add(new Movie("Movie D", 6.6, 1999));
		myList.add(new Movie("Movie C", 8.7, 1977));
		
		Collections.sort(myList);
		
		System.out.println("Sorted by year: ");
		for (Movie myMovie : myList) {
			System.out.println(myMovie.getName() + " " + myMovie.getRating() + " " + myMovie.getYearReleased());
		}

	}

}
