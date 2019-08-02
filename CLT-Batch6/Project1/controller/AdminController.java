package controller;

import java.sql.SQLException;
import java.util.Scanner;

import model.Employee;
import service.EmployeeServiceImpl;

public class AdminController {
	
	Employee refEmployee;
	EmployeeServiceImpl refEmployeeService;
	
	public void adminProcess() throws SQLException {
		userInputShowEmployees();
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
		
		System.out.println("Showing list of employees");
		
		refEmployee.getEmployeeID();
		refEmployee.getEmployeeName();
		refEmployee.getEmployeePassword();
		
		refEmployeeService.callShowEmployees();
		
	}

}
