package packA;

public class MyClassB {
	
	void accessMyClassA() { // within the class
		
		MyClassA refMyClassA = new MyClassA();
		
//		System.out.println(refMyClassA.number1); // can't access since it's private
		System.out.println(refMyClassA.number2);
		System.out.println(refMyClassA.number3);
		System.out.println(refMyClassA.number4);
		
	}

}
