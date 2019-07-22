package day06;

// nested (inner) class

// a. non-static inner class
// b. static inner class
// c. method local inner class
// d. anonymous inner class

// example of non-static, static and method local inner class
class JPMorgan {
	
	void adminAccess() {
		class AdminJPMC {
			void display() {
				System.out.println("Hello I am in Admin");
			}
		}
		AdminJPMC JPMCRef = new AdminJPMC();
		JPMCRef.display();
	}
	
	static void adminAccess2() {
		class FinanceJPMC {
			void display() {
				System.out.println("Hello I am in Finance");
			}
		}
		FinanceJPMC JPMCRef2 = new FinanceJPMC();
		JPMCRef2.display();
	}
	
}

public class NestedClassExample01 {

	public static void main(String[] args) {
		
		JPMorgan JPRef = new JPMorgan();
		JPRef.adminAccess(); // calling a non-static method
		
		JPMorgan.adminAccess2(); // calling a static method --> don't need to create object

	}

}
