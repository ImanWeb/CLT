package day03;

class Bank {
	
	Bank(String location) {
		System.out.println("I am in default constructor --> Bank");
	}
	
}

class DigitalBank extends Bank {
	
	DigitalBank(String location, int code) {
		super(location); // we must use super keyword to call parent class constructor
		System.out.println(code); // 22
	}
	
}

class ChildClassOfDigitalBank extends DigitalBank {
	
	ChildClassOfDigitalBank(String location, int code, int aaa) {
		super(location, code);
		System.out.println("Digibank");
	}
	
}

public class InheritanceExample02 {

	public static void main(String[] args) {
		
		new ChildClassOfDigitalBank("hello", 22, 33); // will call line number 22

	}

}
