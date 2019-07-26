package service;

import java.util.ArrayList;
import java.util.Scanner;

import pojo.User;

public class MainService {
	
	public void displayMainMenu() { // Starting menu
		
		System.out.println("User Home Page");
		System.out.println("1. Register");
		System.out.println("2. Login");
		System.out.println("3. Forget Password");
		System.out.println("4. Logout (exit)");
		
	}
	
	public void displayLoginMenu() { // Menu after user has successfully logged in
		
		System.out.println("Type 1: Check Available Bank Balance");
		System.out.println("Type 2: Deposit Amount");
		System.out.println("Type 3: Withdraw Amount");
		System.out.println("Type 4: Quit");
		
	}
	
	public void register(ArrayList<User> userList) {
		
		Scanner sc = new Scanner(System.in);
		
		// Get email address
		System.out.println("Enter email address: ");
		String emailAddress = sc.next();
		
		// Check if email exists
		while (doesEmailExist(userList, emailAddress)) {
			// Displays 'email already exists' message
			System.out.println("Email already exists!");
			System.out.println("Enter email address");
			emailAddress = sc.next();
		}
		
		// Get password
		System.out.println("Enter password: ");
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
		String colour = sc.next();
		System.out.println(colour + " is your security key, in case you forget your password");
		
		// Store details of user in a POJO class
		User refUser = new User();
		refUser.getRefUserDetails().setEmailAddress(emailAddress);
		refUser.getRefUserDetails().setPassword(password);
		refUser.getRefUserDetails().setFavouriteColour(colour);
		userList.add(refUser);
		
		// Display success message
		System.out.println("\nRegistration successful!");
		
	}
	
	public void login(ArrayList<User> userList) {
		
		Scanner sc = new Scanner(System.in);
		
		// Get email address
		System.out.println("Enter User ID: ");
		String emailAddress = sc.next();
		
		// Get password
		System.out.println("Password: ");
		String password = sc.next();
		
		// Check if user details are valid
		while (!isUserDataValid(userList, emailAddress, password)) {
			System.out.println("Invalid email/password!");
			System.out.println("Enter email: ");
			emailAddress = sc.next();
			System.out.println("Enter password: ");
			password = sc.next();
		}
		
		System.out.println("\nLogin successful!");
		
		// Reference to the current email in the records
		User currentEmail = getCurrentEmail(userList, emailAddress);
		int loginChoice;
		
		// Displays the next menu after successful login
		do {
			displayLoginMenu();
			System.out.println("\nEnter Your Choice: ");
			loginChoice = sc.nextInt();
			
			switch (loginChoice) {
			case 1:
				checkBalance(currentEmail);
				break;
			case 2:
				depositAmount(currentEmail);
				break;
			case 3:
				withdrawAmount(currentEmail);
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
	
	public void forgetPassword(ArrayList<User> userList) {
		
		Scanner sc = new Scanner(System.in);
		
		// Get email address
		System.out.println("\nEnter Your ID: ");
		String emailAddress = sc.next();
		
		// Check if email exists. If not, loop
		while (!doesEmailExist(userList, emailAddress)) {
			System.out.println("\nUser does not exist!");
			System.out.println("\nEnter Your ID: ");
			emailAddress = sc.next();
		}
		
		// Get security key
		System.out.println("Enter security key: ");
		String securityKey = sc.next();
		
		// Loops if security key is incorrect
		while (!isSecurityKeyCorrect(userList, emailAddress, securityKey)) {
			System.out.println("Security key is incorrect!");
			System.out.println("\nEnter security key: ");
			securityKey = sc.next();
		}
		
		// Get new password
		System.out.println("Enter new password: ");
		String password = sc.next();
		
		// Get retyped password
		System.out.println("Retype password: ");
		String password2 = sc.next();
		
		// Check that both passwords match
		while (!password.equals(password2)) {
			System.out.println("Password doesn't match");
			System.out.println("Retype password: ");
			password2 = sc.next();
		}
		
		// Get new security key
		System.out.println("What is your favourite colour?");
		String favouriteColour = sc.next();
		System.out.println(favouriteColour + " is your security key, if you forget your password");
		
		// Store new password and new security key
		User refUser = getCurrentEmail(userList, emailAddress);
		refUser.getRefUserDetails().setPassword(password2);
		refUser.getRefUserDetails().setFavouriteColour(favouriteColour);
		
		// Display success message
		System.out.println("\nYour password has been reset successfully\n");
		
	}
	
	public void logout() {
		System.out.println("\nLogout succesfully!");
	}
	
	// Check if email exists within a list of users
	public boolean doesEmailExist(ArrayList<User> userList, String emailAddress) {
		
		for (User refUser : userList) {
			if (refUser.getRefUserDetails().getEmailAddress().equals(emailAddress)) {
				return true;
			}
		}
		return false;
		
	}
	
	// Takes in email and password and checks against records
	public boolean isUserDataValid(ArrayList<User> userList, String emailAddress, String password) {
		
		for (User refUser : userList) {
			// Check if email exists in records
			if (refUser.getRefUserDetails().getEmailAddress().equals(emailAddress)) {
				// Check if the password is correct
				if (refUser.getRefUserDetails().getPassword().equals(password)) {
					return true;
				}
			}
		}
		return false;
		
	}
	
	// Checks if user's Security Key is correct
	public boolean isSecurityKeyCorrect(ArrayList<User> userList, String emailAddress, String securityKey) {
		
		for (User refUser : userList) {
			// Find the user
			if (refUser.getRefUserDetails().getEmailAddress().equals(emailAddress)) {
				// Check if the Security Key is correct
				if (refUser.getRefUserDetails().getFavouriteColour().equals(securityKey)) {
					return true;
				}
			}
		}
		return false;
	}
	
	// Return reference to the Email being searched for
	public User getCurrentEmail (ArrayList<User> userList, String emailAddress) {
		
		for (User refUser : userList) {
			if (refUser.getRefUserDetails().getEmailAddress().equals(emailAddress)) {
				return refUser;
			}
		}
		// Return nothing if user is not found
		return null;
	}
	
	public void checkBalance (User refUser) {
		
		System.out.println("Available balance: $" + refUser.getRefAccountInfo().getBalance());
		
	}
	
	public void depositAmount (User refUser) {
		
		Scanner sc = new Scanner(System.in);
		
		// Get amount to deposit
		System.out.println("\nEnter Amount: ");
		int depositAmount = sc.nextInt();
		
		// Loops when user enters a negative amount
		while (depositAmount < 0) {
			System.out.println("Amount can't be negative!");
			System.out.println("\nEnter Amount: $");
			depositAmount = sc.nextInt();
		}
		
		// Deposits amount in user account
		refUser.getRefAccountInfo().depositAmount(depositAmount);
		System.out.println("$" + depositAmount + " deposited successfully!");
		
	}
	
	public void withdrawAmount (User refUser) {
		
		Scanner sc = new Scanner(System.in);
		
		// Get amount to withdraw
		System.out.println("\nEnter Amount: $");
		int withdrawAmount = sc.nextInt();
		
		// Loops when user enters amount that is more than current balance
		while (!refUser.getRefAccountInfo().isSufficient(withdrawAmount)) {
			if (!refUser.getRefAccountInfo().isSufficient(withdrawAmount)) {
				System.out.println("Sorry! Insufficient balance");
			}
			System.out.println("\nEnter Amount: $");
			withdrawAmount = sc.nextInt();
		}
		
		// Withdraw amount from user account
		refUser.getRefAccountInfo().withdrawAmount(withdrawAmount);
		System.out.println("Transaction successful!");
		
	}

}
