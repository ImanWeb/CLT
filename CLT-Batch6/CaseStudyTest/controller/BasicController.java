package controller;

import java.util.Scanner;

public class BasicController {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("User Home Page");
		System.out.println("1. Register");
		System.out.println("2. Login");
		System.out.println("3. Forget Password");
		System.out.println("4. Logout (exit)");
		
		System.out.println("\nEnter Your Choice: ");
		int frontPage = sc.nextInt();
		
		if (frontPage == 1) {
			System.out.println("Enter Email Address: ");
			String emailAddress = sc.next();
			
			if (emailAddress == "xyz@gmail.com") {
				System.out.println("Email already exists!");
			}
		}

	}

}
