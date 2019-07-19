package day05;

class A {
	
	B refB; // class A has a reference of class B
	
	public void setRefB(B refB) {
		this.refB = refB;
	}
	
	// this is an example of a constructor
//	A(B refB) {
//		this.refB = refB;
//	}
	
	public B getRefB() {
		return refB;
	}
}

class B {
	
	C refC; // class B has a reference of class C
	
	public void setRefC(C refC) {
		this.refC = refC;
	}
	
	// example of constructor
//	B(C refC) {
//		this.refC = refC;
//	}
	
	public C getRefC() {
		return refC;
	}
}

class C {
	String name;
	
	public void setName(String name) {
		this.name = name;
	}
	
	// example of constructor
//	C(String name) {
//		this.name = name;
//	}
	
	public String getName() {
		return name;
	}
}

public class SimpleApplication {

	public static void main(String[] args) {
		
		A refA = new A();
		B refB = new B();
		C refC = new C();
		refC.setName("Hello, I am in class C");
		refA.setRefB(refB);
		refB.setRefC(refC);
		
		// example of calling constructors
//		refC.setName("Hello, I am in class C");
//		refA.setRefB(refB);
//		refB.setRefC(refC);
		
		System.out.println(refA.getRefB().getRefC().getName());

	}

}
