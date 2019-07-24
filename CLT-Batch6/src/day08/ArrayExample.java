package day08;

import java.util.Scanner;

class Person {
	
	int id;
	String name;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
//	public Person (int id, String name) {
//		this.id = id;
//		this.name = name;
//	}
//
//	@Override
//	public String toString() {
//		return id + " " + name;
//	}
	
}

public class ArrayExample {

	public static void main(String[] args) {
		
//		String str[] = {"Physics", "Chemistry", "Maths"};
//		
//		for (int i = 0; i < str.length; i++) {
//			System.out.println(str[i]);
//		} // traditional for loop
//		
//		for (String temp : str) {
//			System.out.println(temp);
//		} // for each loop
		
		Scanner sc = new Scanner(System.in);
		System.out.println("How many records you want to enter: ");
		int number = sc.nextInt();
		Person refPerson[] = new Person[number]; // we are creating space for an array
		
		for (int i = 0; i < refPerson.length; i++) {
			System.out.println("Enter your ID: ");
			int id = sc.nextInt();
			System.out.println("Enter your Name: ");
			String name = sc.next();
			
			//refPerson[i] = new Person(id, name);
			
			Person refPersonDetails = new Person();
			refPersonDetails.setId(id);
			refPersonDetails.setName(name);
			refPerson[i] = refPersonDetails;
		}
		
		for (Person person : refPerson) {
			System.out.println(person); // person is reference of Person class
		}

	}

}
