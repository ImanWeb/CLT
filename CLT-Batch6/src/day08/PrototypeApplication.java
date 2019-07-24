package day08;

import java.util.Scanner;

public class PrototypeApplication {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Employee ID: ");
		int employeeID = sc.nextInt();
		
		System.out.println("Enter Employee Name: ");
		String empName = sc.next();
		
		System.out.println("Enter Employee Designation: ");
		String designation = sc.next();
		
		EmployeeDetails refEmployeeDetails1 = new EmployeeDetails();
		refEmployeeDetails1.setEmpID(employeeID);
		refEmployeeDetails1.setEmpName(empName);
		refEmployeeDetails1.setDesignation(designation);
		refEmployeeDetails1.showRecord();
		
		// creating an object uses up memory from heap and slows down performance
		// cloning will make the same image of an object without creating a new object
		// cloning object
		EmployeeDetails refEmployeeDetails2 = (EmployeeDetails) refEmployeeDetails1.clone();
		refEmployeeDetails2.showRecord();

	}

}
