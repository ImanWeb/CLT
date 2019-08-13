package controller;

import java.sql.SQLException;
import java.util.Scanner;

import model.Employee;
import service.EmployeeServiceImpl;

public class AdminController {
	
	Employee refEmployee;
	EmployeeServiceImpl refEmployeeService;
	
	public void adminProcess() throws SQLException {
		displayStartMenu();
	}
	
	void displayStartMenu() throws SQLException {
		System.out.println("-----THIS IS THE START MENU-----");
		System.out.println("Please select an option");
		System.out.println("1. Add an employee");
		System.out.println("2. Update an employee");
		System.out.println("3. Show all employees");
		System.out.println("4. Show employee by ID");
		System.out.println("5. Delete an employee");
		
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		
		switch (choice) {
		
		case 1: userInputAddEmployee();
		break;
		case 2: userInputUpdateEmployee();
		break;
		case 3: userInputShowEmployees();
		break;
		case 4: userInputGetEmployeeByID();
		break;
		case 5: userInputRemoveEmployee();
		break;
		default: System.out.println("Invalid input!");
		break;
		
		}
	}
	
	void userInputAddEmployee() throws SQLException {
		
		refEmployee = new Employee();
		refEmployeeService = new EmployeeServiceImpl();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Creating new user");
		
		System.out.println("Enter User ID: ");
		int userID = sc.nextInt();
		
		System.out.println("Enter Name: ");
		String name = sc.next();
		
		System.out.println("Enter Password: ");
		String password = sc.next();
		
		refEmployee.setEmployeeID(userID);
		refEmployee.setEmployeeName(name);
		refEmployee.setEmployeePassword(password);
		
		refEmployeeService.callAddEmployee(refEmployee);
		
	}
	
	void userInputUpdateEmployee() throws SQLException {
		
		refEmployee = new Employee();
		refEmployeeService = new EmployeeServiceImpl();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Updating user info");
		
		System.out.println("Enter User ID: ");
		int userID = sc.nextInt();
		
		System.out.println("Enter your NEW name: ");
		String name = sc.next();
		
		System.out.println("Enter your NEW password: ");
		String password = sc.next();
		
		refEmployee.setEmployeeID(userID);
		refEmployee.setEmployeeName(name);
		refEmployee.setEmployeePassword(password);
		
		refEmployeeService.callUpdateEmployee(refEmployee);
		
	}
	
	void userInputShowEmployees() throws SQLException {
		
		refEmployee = new Employee();
		refEmployeeService = new EmployeeServiceImpl();
		
		refEmployeeService.callShowEmployees(refEmployee);
		
	}
	
	void userInputGetEmployeeByID() throws SQLException {
		
		refEmployee = new Employee();
		refEmployeeService = new EmployeeServiceImpl();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Getting employee details");
		
		System.out.println("Enter User ID: ");
		int userID = sc.nextInt();
		
		refEmployee.setEmployeeID(userID);
		
		refEmployeeService.callGetEmployeeByID(refEmployee);
		
	}
	
	void userInputRemoveEmployee() throws SQLException {
		
		refEmployee = new Employee();
		refEmployeeService = new EmployeeServiceImpl();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Removing employee");
		
		System.out.println("Enter User ID: ");
		int userID = sc.nextInt();
		
		refEmployee.setEmployeeID(userID);
		
		refEmployeeService.callRemoveEmployee(refEmployee);
		
	}

}
