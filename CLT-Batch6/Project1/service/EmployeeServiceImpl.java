package service;

import java.sql.SQLException;
import java.util.Scanner;

import dao.EmployeeDAO;
import dao.EmployeeDAOImpl;
import model.Employee;

public class EmployeeServiceImpl implements EmployeeService {
	
	EmployeeDAO refEmployeeDAO;
	
	@Override
	public void callAddEmployee(Employee refEmployee) throws SQLException {
		
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
		
		refEmployeeDAO = new EmployeeDAOImpl();
		refEmployeeDAO.addEmployee(refEmployee);
		
	}

	@Override
	public void callUpdateEmployee(Employee refEmployee) throws SQLException {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Updating user info");
		
		System.out.println("Enter User ID: ");
		int userID = sc.nextInt();
		
		System.out.println("Enter your NEW name: ");
		String name = sc.next();
		
		System.out.println("Enter your NEW password: ");
		String password = sc.next();
		
	}

}
