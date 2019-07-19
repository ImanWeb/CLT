package day03;

//Inheritance

//Parent/Base/Super and Child/Derived/Sub

// Visa is Parent class
class Visa {
	
	void ageLimit() { // Visa follows rule --> user can't apply for credit card if age < 18
		System.out.println("Age should not be less than 18.");
	}
	
	// within a class, same method name, parameter different, return type can be different
	int ageLimit(int number) { // method overloading
		return 0;
	}
	
} // end of Visa

// Citibank is Child class
class CitiBank extends Visa { // we use extends keyword to call Parent class from Child
	
	// In inheritance, child class override method of parent class
	// method name same, parameter same, return type must be same
	@Override // we must give @Override before the method name
	int ageLimit(int number) { // method overriding --> line number 15
		return 0;
	}
	
}

public class Overriding {

	public static void main(String[] args) {
		

	}

}
