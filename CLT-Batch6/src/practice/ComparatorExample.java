package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Movie2 {
	
	private String name;
	private double rating;
	private int yearReleased;
	
	// Constructor
	public Movie2 (String name, double rating, int yearReleased) {
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

//Class to compare Movies by rating 
class RatingCompare implements Comparator<Movie2> {
	 public int compare(Movie2 m1, Movie2 m2) { 
	     if (m1.getRating() < m2.getRating()) {
	    	 return -1; 
	     }
	     if (m1.getRating() > m2.getRating()) {
	    	 return 1; 
	     }
	     else {
	    	 return 0; 
	     }
	 } 
}

//Class to compare Movies by name 
class NameCompare implements Comparator<Movie2> { 
	 public int compare(Movie2 m1, Movie2 m2) { 
	     return m1.getName().compareTo(m2.getName()); 
	 } 
} 

//Class to compare Movies by year
class YearCompare implements Comparator<Movie2> {
	public int compare(Movie2 m1, Movie2 m2) {
		if (m1.getYearReleased() < m2.getYearReleased()) {
			return -1;
		}
		if (m1.getYearReleased() > m2.getYearReleased()) {
			return 1;
		}
		else {
			return 0;
		}
	}
}

public class ComparatorExample {

	public static void main(String[] args) {
		
		ArrayList<Movie2> myList = new ArrayList<Movie2>();
		myList.add(new Movie2("Movie B", 7.5, 1980));
		myList.add(new Movie2("Movie A", 8.0, 2001));
		myList.add(new Movie2("Movie D", 6.6, 1999));
		myList.add(new Movie2("Movie C", 8.7, 1977));
		
		// Sort by rating
		System.out.println("Sorted by rating: ");
		RatingCompare myRatingCompare = new RatingCompare();
		Collections.sort(myList, myRatingCompare);
		for (Movie2 myMovie : myList) {
			System.out.println(myMovie.getName() + " " + myMovie.getRating() + " " + myMovie.getYearReleased());
		}
		
		// Sort by name
		System.out.println("\nSorted by name: ");
		NameCompare myNameCompare = new NameCompare();
		Collections.sort(myList, myNameCompare);
		for (Movie2 myMovie : myList) {
			System.out.println(myMovie.getName() + " " + myMovie.getRating() + " " + myMovie.getYearReleased());
		}
		
		// Sort by year released
		System.out.println("\nSorted by year: ");
		YearCompare myYearCompare = new YearCompare();
		Collections.sort(myList, myYearCompare);
		for (Movie2 myMovie : myList) {
			System.out.println(myMovie.getName() + " " + myMovie.getRating() + " " + myMovie.getYearReleased());
		}

	}

}
