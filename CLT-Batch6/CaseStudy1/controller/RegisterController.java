package controller;

import java.util.Scanner;

import pojo.UserDetails;
import service.RegisterService;

public class RegisterController {
	
	RegisterService refRegisterService;
	UserDetails refUserDetails;

	public void userRegisterController() {
		
		userInput();
		
	}
	
	void userInput() {
		
		Scanner sc = new Scanner(System.in);
		
		// step 1: ask for email address
		System.out.println("Enter email address: ");
		String emailAddress = sc.next();
				
		// step 2: create object of UserDetails class
		refUserDetails = new UserDetails();
		
		// step 3: set values to setter method of User class
		refUserDetails.setEmailAddress(emailAddress);
		
		// step 4: create object of RegisterService class
		refRegisterService = new RegisterService();
		
		// step 5: calling checkStatus method and pass the reference of User class
		refRegisterService.checkStatus(refUserDetails);
		
		
		
		System.out.println("Enter password: ");
		String password = sc.next();
		
		refUserDetails.setPassword(password);
		
	}
}
