package dao;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import model.Employee;

public interface EmployeeDAO {
	
	public void addEmployee(Employee refEmployee) throws SQLException;
	
	public void updateEmployee(Employee refEmployee) throws SQLException;
	
	public List<Employee> showEmployees() throws SQLException;

}
