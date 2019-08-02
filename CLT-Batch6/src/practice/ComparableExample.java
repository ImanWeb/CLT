package practice;

import java.util.ArrayList;
import java.util.Collections;

class Movie implements Comparable<Movie> {
	
	private String name;
	private double rating;
	private int yearReleased;
	
	// Getter methods for accessing private variables
	public String getName() {
		return name;
	}
	public double getRatings() {
		return rating;
	}
	public int getYearReleased() {
		return yearReleased;
	}

	// Used to sort movies by year
	@Override
	public int compareTo(Movie o) {
		return this.yearReleased - o.yearReleased;
	}
	
	// Constructor
	public Movie (String name, double rating, int yearReleased) {
		this.name = name;
		this.rating = rating;
		this.yearReleased = yearReleased;
	}
	
}

public class ComparableExample {

	public static void main(String[] args) {
		
		ArrayList<Movie> myList = new ArrayList<Movie>();
		myList.add(new Movie("Movie B", 7.5, 1980));
		myList.add(new Movie("Movie A", 8.0, 2001));
		myList.add(new Movie("Movie D", 6.6, 1999));
		myList.add(new Movie("Movie C", 8.7, 1977));
		
		System.out.println("Sorted by year: ");
		Collections.sort(myList);
		for (Movie myFilm : myList) {
			System.out.println(myFilm.getName() + " " + myFilm.getRatings() + " " + myFilm.getYearReleased());
		}

	}

}
