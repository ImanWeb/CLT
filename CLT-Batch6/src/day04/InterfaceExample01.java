package day04;

// interface is a fully abstract class
interface Bank { // we use interface keyword to create an interface
	void deposit(); // method is abstract by default
	abstract void withdraw(); // abstract is optional to write
	void checkBalance();
	// int code; // we can't declare like this, compilation error
	final static int code = 204050; // we have to declare variable value, by default it is final and static
}

interface UserLoginCredential {
	void userLogin();
	void userLogout();
}

// functional interface: Java 1.8 version onwards

@FunctionalInterface
interface SingleMethod { // functional interface can't have more than one abstract method
	void method1();
}

// Java 1.8 new feature --> default method in interface
interface DefaultMethod extends SingleMethod {
	default public void myMethod() {
		System.out.println("from Java 1.8 version can have method with a body");
	}
}

class CitiBank implements Bank, UserLoginCredential {

	@Override
	public void userLogin() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void userLogout() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deposit() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void withdraw() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void checkBalance() {
		// TODO Auto-generated method stub
		
	} // Jave supports multiple inheritance by using interface
	
}

public class InterfaceExample01 {

	public static void main(String[] args) {
		
		System.out.println(Bank.code);

	}

}
