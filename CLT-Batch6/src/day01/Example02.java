package day01;

class UserApplication{
	public static void main(String[] args) {
		System.out.println("hello");
		
	}
	
} // end of UserApplication

class StaticDemo{
	
	static int number = 10; // static variable
	int number2 = 30; // non-static variable
	
} // end of StaticDemo

public class Example02 {

	public static void main(String[] args) {
		System.out.println("Hi");	
		UserApplication.main(null);
		
		System.out.println(StaticDemo.number); // classname.variable - since variable is static
		
		// to call non-static variable we must create object of the class StaticDemo
		StaticDemo refSD = new StaticDemo();
		System.out.println(refSD.number2);
	}

}
