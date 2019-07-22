package packB;

import packA.MyClassA;

public class MyClassC extends MyClassA {
	
	void accessMyClassA() { // within the class
		
		MyClassA refMyClassA = new MyClassA();
		
//		System.out.println(refMyClassA.number1); // can't access since it's private
//		System.out.println(refMyClassA.number2); // can't access since it's default
		System.out.println(super.number3); // to call super class member
		System.out.println(refMyClassA.number4); // public can be accessed outside the package
		
	}

}
