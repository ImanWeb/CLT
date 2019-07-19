package day04;

abstract class Visa { // parent class
	
	abstract void login1(); // Abstract method, without a body, ends with a semicolon. Abstract methods also cannot be static
	abstract void login2();
	abstract void login3();
	
	// if we declare any abstract method in an abstract class we must define in its sub class
	
	void logout() {
		
		// method with a body
		
	}
}

class HSBC extends Visa { // HSBC is child class

	@Override
	void login1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void login2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void login3() {
		// TODO Auto-generated method stub
		
	}
	
}

public class AbstractClassExample01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
