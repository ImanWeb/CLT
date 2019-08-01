package practice;

import java.util.ArrayList;
import java.util.Collections;

class Film2 implements Comparable<Film2> {
	
	private String name;
	private double rating;
	private int yearReleased;
	
	public String getName() {
		return name;
	}

	public double getRatings() {
		return rating;
	}

	public int getYearReleased() {
		return yearReleased;
	}

	//Used to sort films by year
	@Override
	public int compareTo(Film2 o) {
		return this.yearReleased - o.yearReleased;
	}
	
	public Film2 (String name, double rating, int yearReleased) {
		this.name = name;
		this.rating = rating;
		this.yearReleased = yearReleased;
	}
	
}

public class ComparableExample {

	public static void main(String[] args) {
		
		ArrayList<Film2> myList = new ArrayList<Film2>();
		myList.add(new Film2("Movie B", 7.5, 1980));
		myList.add(new Film2("Movie A", 8.0, 2001));
		myList.add(new Film2("Movie D", 6.6, 1999));
		myList.add(new Film2("Movie C", 8.7, 1977));
		
		System.out.println("Sorted by year: ");
		Collections.sort(myList);
		for (Film2 myFilm : myList) {
			System.out.println(myFilm.getName() + " " + myFilm.getRatings() + " " + myFilm.getYearReleased());
		}

	}

}
