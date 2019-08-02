package controller;

import java.sql.SQLException;
import java.util.Scanner;

import model.Employee;
import service.EmployeeServiceImpl;

public class AdminController {
	
	Employee refEmployee;
	EmployeeServiceImpl refEmployeeService;
	
	public void adminProcess() throws SQLException {
		userInput();
	}
	
	void userInput() throws SQLException {
		refEmployee = new Employee();
		refEmployeeService = new EmployeeServiceImpl();
		
		refEmployeeService.callAddEmployee(refEmployee);
		
		refEmployeeService.callUpdateEmployee(refEmployee);
		
	}

}
