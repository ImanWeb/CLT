package controller;

import java.util.ArrayList;
import java.util.Scanner;

import pojo.User;
import service.MainService;

public class MainController {
	
	MainService refMainService = new MainService();
	User refUser = new User();
	
	ArrayList<User> userList = new ArrayList<User>();
	int choice;
	
	public void userMainController() {
		
		Scanner sc = new Scanner(System.in);
		
		do {
			refMainService.displayMainMenu();
			System.out.println("\nEnter Your Choice: ");
			choice = sc.nextInt();
			
			switch (choice) {
			case 1:
				refMainService.register(userList);
				break;
			case 2:
				refMainService.login(userList);
				break;
			case 3:
				refMainService.forgetPassword(userList);
				break;
			case 4:
				refMainService.logout();
				break;
			default:
				System.out.println("Invalid choice!\n"); // This gets printed if user enters a number outside 1 - 4
				break;
			}			
		} while (choice != 4);
		
	}	

}
