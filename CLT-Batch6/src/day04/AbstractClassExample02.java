package day04;

class A { }

abstract class Oracle {
	abstract void driverConnection();
}

abstract class Microsoft { // Microsoft and Oracle is not a Parent and Child class
	abstract void getSoftware();
}

class MyClass {
	
	void display() {
		
		Oracle refOracle = new Oracle() {
			@Override
			void driverConnection() {
				System.out.println("Oracle Driver Connected");
			}			
		};
		
		refOracle.driverConnection();
		
		Microsoft refMicrosoft = new Microsoft() {
			@Override
			void getSoftware() {
				System.out.println("Microsoft Software Loaded");				
			}			
		};
		
		refMicrosoft.getSoftware();
		
	}
}

public class AbstractClassExample02 {

	public static void main(String[] args) {
		
		MyClass refMyClass = new MyClass();
		refMyClass.display();
		// anonymous inner class which is part of nested class		
		
	}

}
