package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Film implements Comparable<Film> {
	
	private String name;
	private double ratings;
	private int yearReleased;

	// Used to sort films by year. For the Comparable Interface
	@Override
	public int compareTo(Film o) {
		return this.yearReleased - o.yearReleased;
	}
	
	// Constructor
	public Film (String name, double ratings, int yearReleased) {
		this.name = name;
		this.ratings = ratings;
		this.yearReleased = yearReleased;
	}
	
	// Getter methods for accessing private data
	public String getName() {
		return name;
	}

	public double getRatings() {
		return ratings;
	}

	public int getYearReleased() {
		return yearReleased;
	}
	
}

// Class to compare films by ratings
class RatingsCompare implements Comparator<Film> {

	@Override
	public int compare(Film o1, Film o2) {
		
		if (o1.getRatings() < o2.getRatings()) {
			return -1;
		}
		if (o1.getRatings() > o2.getRatings()) {
			return 1;
		}
		else {
			return 0;
		}
		
	}
	
}

// Class to compare films by name
class NameCompare implements Comparator<Film> {

	@Override
	public int compare(Film o1, Film o2) {
		return o1.getName().compareTo(o2.getName());
	}
	
}

//Class to compare films by year
class YearCompare implements Comparator<Film> {

	@Override
	public int compare(Film o1, Film o2) {
		
		if (o1.getYearReleased() < o2.getYearReleased()) {
			return -1;
		}
		if (o1.getYearReleased() > o2.getYearReleased()) {
			return 1;
		}
		else {
			return 0;
		}
		
	}
	
}

public class Practice08 {

	public static void main(String[] args) {
		
		ArrayList<Film> myList = new ArrayList<Film>();
		myList.add(new Film("Movie B", 7.5, 1980));
		myList.add(new Film("Movie A", 8.0, 2001));
		myList.add(new Film("Movie D", 6.6, 1999));
		myList.add(new Film("Movie C", 8.7, 1977));
		
		// Sort by rating: (1) Create an object of ratingCompare 
        //                 (2) Call Collections.sort 
        //                 (3) Print Sorted list
		System.out.println("Sorted by ratings: ");
		RatingsCompare myRatingsCompare = new RatingsCompare();
		Collections.sort(myList, myRatingsCompare);
		for (Film myFilm : myList) {
			System.out.println(myFilm.getName() + " " + myFilm.getRatings() + " " + myFilm.getYearReleased());
		}
		
		// Sort by name
		System.out.println("\nSorted by name: ");
		NameCompare myNameCompare = new NameCompare();
		Collections.sort(myList, myNameCompare);
		for (Film myFilm : myList) {
			System.out.println(myFilm.getName() + " " + myFilm.getRatings() + " " + myFilm.getYearReleased());
		}
		
		// Sort by year released
		System.out.println("\nSorted by year: ");
		YearCompare myYearCompare = new YearCompare();
		Collections.sort(myList, myYearCompare);
		for (Film myFilm : myList) {
			System.out.println(myFilm.getName() + " " + myFilm.getRatings() + " " + myFilm.getYearReleased());
		}
		
//		// Use Comparable to sort by year
//		System.out.println("\nSorted by year: ");
//		Collections.sort(myList);
//		for (Film myFilm : myList) {
//			System.out.println(myFilm.getName() + " " + myFilm.getRatings() + " " + myFilm.getYearReleased());
//		}

	}

}
