package day01;

import java.util.Scanner;

class User {
	// userID take as String
	// userPassword take as String
}

class AuthenticationLogic {
	
	String userID, userPassword;
	boolean status;
	
	public void userInput(String userID, String userPassword) { // we are going to hold the value
		this.userID = userID; // this.globalVariable = localVariable (if both names are same)
		this.userPassword = userPassword;		
		printOut();
	} // end of userInput()
	
	void printOut() {
		validateUser();
		if (validateUser() == true) {
			System.out.println("Welcome");
		} else {
			System.out.println("Not Valid");
		}
	}
	
	// write logic to validate user
	public boolean validateUser() {
		
		if (userID.equals("admin") && userPassword.equals("admin123")) {
			status = true;
		} else {
			status = false;
		}
		
		return status;
	}
	
} // end of AuthenticationLogic

public class UserLoginAuthentication {

	public static void main(String[] args) {
		
		// Scanner class helps to take input from the user
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter UserID: ");
		String userID = sc.next();
		System.out.println("Enter UserPassword: ");
		String userPassword = sc.next();
		AuthenticationLogic refAL = new AuthenticationLogic();
		refAL.userInput(userID, userPassword);

	}

}
