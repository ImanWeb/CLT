package day01;

class StaticNonStaticDemo{
	
	int variable1 = 50;
	static int variable2 = 60;
	
	void showVariables() { // not static method
		
		System.out.println(variable1 + " " + variable2); // no need to create object
		
	} // end of showVariables
	
	static String reference1 = "Python";
	String reference2 = "Java";
	
	static void showReferences() { // static method can only access static data member directly(without creating object)
		
		System.out.println(reference1);
		
		// reference2 can't be called directly, since it's not static
		// therefore have to create an object
		
		System.out.println(new StaticNonStaticDemo().reference2);
		
	} // end of references
	
} // end of StaticNonStaticDemo

public class Example03 {

	public static void main(String[] args) {
		StaticNonStaticDemo.showReferences();
		new StaticNonStaticDemo().showVariables();

	} // end of main

} // end of Example03
