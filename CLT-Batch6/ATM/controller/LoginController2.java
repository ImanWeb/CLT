package controller;

import java.util.Scanner;

import pojo.User;
import service.LoginService;
import service.LoginServiceImpl2;

public class LoginController2 {
	
	// loose coupling through reference of the interface
	LoginService refLoginService; // LoginService is an interface
	User refUser; // User is a POJO (Plain Old Java Class)
	
	public void userLoginController() {
		
		userInput();
		
	}
	
	void userInput() {
		Scanner sc = new Scanner(System.in);
		
		// step 1: ask user ID and password
		System.out.println("Enter User ID: ");
		int userID = sc.nextInt();
		
		System.out.println("Enter User Password: ");
		String password = sc.next();
		
		// step 2: create object of User class
		refUser = new User();
		
		// step 3: set values to setter method of User class
		refUser.setUserID(userID);
		refUser.setUserPassword(password);
		
		// step 4: create object of LoginServiceImpl class and refer to its interface
		refLoginService = new LoginServiceImpl2(); // we have to create object
		
		// step: calling checkStatus method and pass the reference of User class
		refLoginService.checkStatus(refUser);
	}

}
