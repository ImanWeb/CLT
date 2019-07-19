package day02;

class Laptop {
	
	Laptop() {
		this(20);
		System.out.println("hello I am in default constructor");
	}
	
	Laptop(int price) {
		this(30, "Dell");
		System.out.println(price);
	}
	
	Laptop(int price, String brand) {
		System.out.println(price + " " + brand);
	}
	
} // end of class Laptop

public class ConstructorChainingExample {

	public static void main(String[] args) {
		
		new Laptop();

	}

}
