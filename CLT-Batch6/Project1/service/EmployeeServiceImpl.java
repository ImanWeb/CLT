package service;

import java.sql.SQLException;
import java.util.List;
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
	public void callShowEmployees(Employee refEmployee) throws SQLException {
		
		refEmployeeDAO = new EmployeeDAOImpl();
		refEmployeeDAO.showEmployees(refEmployee);
		
	}

	@Override
	public void callGetEmployeeByID(Employee refEmployee) throws SQLException {
		
		refEmployeeDAO = new EmployeeDAOImpl();
		refEmployeeDAO.getEmployeeByID(refEmployee);
		
	}

	@Override
	public void callRemoveEmployee(Employee refEmployee) throws SQLException {
		
		refEmployeeDAO = new EmployeeDAOImpl();
		refEmployeeDAO.removeEmployee(refEmployee);
		
	}

}
