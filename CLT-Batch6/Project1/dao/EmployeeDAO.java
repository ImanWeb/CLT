package dao;

import java.sql.SQLException;
import java.util.List;

import model.Employee;

public interface EmployeeDAO {
	
	public void addEmployee(Employee refEmployee) throws SQLException;
	
	public void updateEmployee(Employee refEmployee) throws SQLException;
	
	public List<Employee> showEmployees(Employee refEmployee) throws SQLException;
	
	public void getEmployeeByID(Employee refEmployee) throws SQLException;
	
	public void removeEmployee(Employee refEmployee) throws SQLException;

}
