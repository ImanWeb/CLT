package day01;

public class Customer { // Customer is the name of the class
	
	// declare variable
	int age = 22; // has a relationship
	String NRIC = "G67676767B"; // has a relationship
	
	void customerDetails(int age, String NRIC) { // method
		System.out.println(age);
		System.out.println(NRIC);
	}

	public static void main(String[] args) {
		
		// create an object of Customer class
		Customer refCustomer = new Customer(); // object we create by using new operator
		
		// call the method through the reference
		refCustomer.customerDetails(10,"S1234567A");

	}

}
