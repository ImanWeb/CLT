package day02;

class Mobile { // class name should always be noun
	
	int price = 500;
	
	// constructor name and class name must be same
	// constructor doesn't have any return type, not even void
	
	Mobile() { // default constructor
		System.out.println(price);
	} // end of Mobile constructor
	
	// method -> verb / action
	// method always has some return type or void (no return type)
	
} // end of Mobile class

public class ConstructorExample {

	public static void main(String[] args) {
		
		new Mobile(); // once we create object of Mobile class, JVM creates a default constructor of Mobile class

	}

}
