package controller;

import java.util.Scanner;

import model.ATMUser;
import service.ATMService;
import service.ATMServiceImpl;

public class ATMController {
	
	ATMUser refATMUser;
	ATMService refATMService;
	Scanner sc = new Scanner(System.in);
	int choice;
	
	public void adminProcess() {
		
		displayStartMenu();
		
	}
	
	void displayStartMenu() {
		
		do {
			System.out.println("-----THIS IS THE HOME PAGE-----");
			System.out.println("Please select an option");
			System.out.println("1. Register");
			System.out.println("2. Login");
			System.out.println("3. Forget Password");
			System.out.println("4. Logout (exit)");
			choice = sc.nextInt();
			
			switch (choice) {
			case 1:
				userInputRegister();
				break;
			case 2:
				userInputLogin();
				break;
			case 3:
				userInputForgetPassword();
				break;
			case 4:
				logout();
				break;
			default:
				System.out.println("Invalid choice!\n"); // This gets printed if user enters a number outside 1 - 4
				break;
			}
		} while (choice != 4);

	}
	
	void userInputRegister() {
		
		refATMUser = new ATMUser();
		refATMService = new ATMServiceImpl();
		
		System.out.println("Registering account");
		
		// Get email address
		System.out.println("Enter email address:");
		String emailAddress = sc.next();
		
		// Get password
		System.out.println("Enter password:");
		String password = sc.next();
		
		// Get retyped password
		System.out.println("Retype password: ");
		String password2 = sc.next();
		
		// Check if the passwords match
		while (!password.equals(password2)) {
			System.out.println("Password doesn't match!");
			System.out.println("Re-type password: ");
			password2 = sc.next();
		}
		
		// Get favourite colour
		System.out.println("What is your favourite colour?");
		String favouriteColour = sc.next();
		
		// Store details of user in a model/POJO class
		refATMUser.setEmailAddress(emailAddress);
		refATMUser.setPassword(password);
		refATMUser.setFavouriteColour(favouriteColour);
		
		// Call a register method in service
		refATMService.callAddUser(refATMUser);
		
	}
	
	void userInputLogin() {
		
		refATMUser = new ATMUser();
		refATMService = new ATMServiceImpl();
		
		System.out.println("Logging in");
		
		// Get email address
		System.out.println("Enter email address: ");
		String emailAddress = sc.next();
		
		// Get password
		System.out.println("Password: ");
		String password = sc.next();
		
		// Store details of user in a model/POJO class
		refATMUser.setEmailAddress(emailAddress);
		refATMUser.setPassword(password);
		
		// Call a login method in service
		if (refATMService.callCheckLogin(refATMUser)) {
			displayLoginMenu();
		}
		
		
	}
	
	public void displayLoginMenu() { // Menu after user has successfully logged in
		
		System.out.println("Type 1: Check Available Bank Balance");
		System.out.println("Type 2: Deposit Amount");
		System.out.println("Type 3: Withdraw Amount");
		System.out.println("Type 4: Quit");
		
	}
	
	void userInputForgetPassword() {
		
	}
	
	public void logout() {
		System.out.println("\nLogged out succesfully!");
	}

}
