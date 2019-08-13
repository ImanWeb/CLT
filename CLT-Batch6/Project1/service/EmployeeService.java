package service;

import java.sql.SQLException;
import java.util.List;

import model.Employee;

public interface EmployeeService {
	
	public void callAddEmployee(Employee refEmployee) throws SQLException;
	
	public void callUpdateEmployee(Employee refEmployee) throws SQLException;
	
	public void callShowEmployees(Employee refEmployee) throws SQLException;
	
	public void callGetEmployeeByID(Employee refEmployee) throws SQLException;
	
	public void callRemoveEmployee(Employee refEmployee) throws SQLException;

}
