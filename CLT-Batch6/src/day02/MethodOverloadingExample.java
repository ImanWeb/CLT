package day02;

public class MethodOverloadingExample {

	public static void main(String[] args) { // step 1 - execution starts here
		
		System.out.println("class loader loads this main"); // step 2
		main(20); // step 3
		System.out.println("final line"); // Step 9

	} // end of main
	
	public static void main(int number) { // step 4
		
		main("data"); // Step 5
		System.out.println(number); // Step 8
		
	} // end of main
	
	public static void main(String reference) { // Step 6
		
		System.out.println(reference); // Step 7
		
	} // end of main

} // end of MethodOverloadingExample class
