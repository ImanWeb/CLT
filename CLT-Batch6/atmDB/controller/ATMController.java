package controller;

import java.util.Scanner;

import model.ATMUser;
import service.ATMService;
import service.ATMServiceImpl;

public class ATMController {
	
	ATMUser refATMUser;
	ATMService refATMService;
	Scanner sc = new Scanner(System.in);
	
	public void adminProcess() {
		
		displayStartMenu();
		
	}
	
	void displayStartMenu() {
		
		int choice;
		
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
		
		// Call an Add User method in service
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
		
		// If user enters incorrect login credentials
		while (!refATMService.callCheckLogin(refATMUser)) {
			System.out.println("Invalid login details. Please enter again.");
			
			System.out.println("Enter email address: ");
			emailAddress = sc.next();
			
			System.out.println("Password: ");
			password = sc.next();
			
			refATMUser.setEmailAddress(emailAddress);
			refATMUser.setPassword(password);
		}
		
		// Successful login
		displayLoginMenu();
		
	}
	
	public void displayLoginMenu() { // Menu after user has successfully logged in
		
		int loginChoice;
		
		do {
			System.out.println("\nPlease select an option: ");
			System.out.println("Type 1: Check Available Bank Balance");
			System.out.println("Type 2: Deposit Amount");
			System.out.println("Type 3: Withdraw Amount");
			System.out.println("Type 4: Quit");
			
			loginChoice = sc.nextInt();
			
			switch (loginChoice) {
			case 1:
				userInputCheckBalance();
				break;
			case 2:
				userInputDepositAmount();
				break;
			case 3:
				userInputWithdrawAmount();
				break;
			case 4:
				System.out.println("\nThank you for banking with us!");
				break;
			default:
				System.out.println("Invalid choice!");
				break;
			}
		} while (loginChoice != 4);
	}
	
	void userInputCheckBalance() {
		
		// Call a Check Balance method in service
		refATMService.callCheckBalance(refATMUser);
		
	}
	
	void userInputDepositAmount() {
		
		// Ask user to enter amount to deposit
		System.out.println("Enter amount to deposit: ");
		int amount = sc.nextInt();
		
		// Store balance of user in a model/POJO class
		refATMUser.setBalance(refATMUser.getBalance() + amount);
		
		// Call a Deposit Amount method in service
		refATMService.callDepositAmount(refATMUser);
		
		System.out.println("$" + amount + " deposited successfully");
		
	}
	
	void userInputWithdrawAmount() {
		
		// Ask user to enter amount to withdraw
		System.out.println("Enter amount to withdraw: ");
		int amount = sc.nextInt();
		
		// Store balance of user in a model/POJO class
		refATMUser.setBalance(refATMUser.getBalance() - amount);
		
		// Call a Withdraw Amount method in service
		refATMService.callWithdrawAmount(refATMUser);
		
		System.out.println("$" + amount + " withdrawn successfully");
		
	}
	
	void userInputForgetPassword() {
		
		// Get email address
		System.out.println("\nEnter email address: ");
		String emailAddress = sc.next();
		
		// Get security key
		System.out.println("Enter security key: ");
		String securityKey = sc.next();
		
	}
	
	public void logout() {
		System.out.println("\nLogged out succesfully!");
	}

}
