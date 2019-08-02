package service;

import java.sql.SQLException;

import model.Employee;

public interface EmployeeService {
	
	public void callAddEmployee(Employee refEmployee) throws SQLException;
	
	public void callUpdateEmployee(Employee refEmployee) throws SQLException;

}
