package day02;

class MyClass {
	
	int number1 = 20;
	String reference = "data";
	
	void displayNumber() {
		System.out.println(number1);
	}
} // end of MyClass

public class JVMDemo {

	public static void main(String[] args) { // entry point of execution
		
		MyClass refMyClass = null;
		refMyClass = new MyClass();
		refMyClass.displayNumber();
		System.out.println(refMyClass.reference);
		refMyClass = null; // we are doing garbage collection by freeing memory

	}

}
