package day03;

class MasterCard {
	
	static void loginAuthentication1() {
		System.out.println("I am in MasterCard --> loginAuthentication1");
	}
	
	void loginAuthentication2() {
		System.out.println("I am in MasterCard --> loginAuthentication2");
	}
	
} // end of Visa

class DBSBank extends MasterCard {
	
	static void loginAuthentication1() {
		System.out.println("I am in DBSBank --> loginAuthentication1");
	}
	
	void loginAuthentication2() {
		System.out.println("I am in DBSBank --> loginAuthentication2");
	}
	
} // end of DBSBank

public class InheritanceExample01 {

	public static void main(String[] args) {
		
		MasterCard refMasterCard = new DBSBank(); // up casting
		// DBSBank refDBSBank = (DBSBank) new MasterCard(); // down casting
		refMasterCard.loginAuthentication1(); // parent class will get called because cannot override static method
		refMasterCard.loginAuthentication2(); // child class will get called

	}

}
