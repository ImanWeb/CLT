package dao;

import java.io.IOException;
import java.sql.SQLException;

import model.Employee;

public interface EmployeeDAO {
	
	public void addEmployee(Employee refEmployee) throws SQLException;

}
