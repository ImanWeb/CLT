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
		
		refEmployeeDAO = new EmployeeDAOImpl();
		refEmployeeDAO.addEmployee(refEmployee);
		
	}

	@Override
	public void callUpdateEmployee(Employee refEmployee) throws SQLException {
		
		refEmployeeDAO = new EmployeeDAOImpl();
		refEmployeeDAO.updateEmployee(refEmployee);
		
	}

	@Override
	public void callShowEmployees() throws SQLException {
		
		refEmployeeDAO = new EmployeeDAOImpl();
		refEmployeeDAO.showEmployees();		
		
	}

}
