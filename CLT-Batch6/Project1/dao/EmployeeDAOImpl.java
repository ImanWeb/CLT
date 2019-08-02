package dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import connection.DBConnection;
import model.Employee;
import service.EmployeeService;
import service.EmployeeServiceImpl;

public class EmployeeDAOImpl implements EmployeeDAO {
	
	Connection conRef;
	PreparedStatement psRef;
	
	void getConnection() {
		try {
			conRef = DBConnection.prepareConnection();
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println("DB Connection Error");
		}
	}
	
	@Override
	public void addEmployee(Employee refEmployee) throws SQLException {
		
		getConnection();
		
		try {
			psRef = conRef.prepareStatement("insert into employee(id,name,password) values (?,?,?)");
			psRef.setInt(1,refEmployee.getEmployeeID());
			psRef.setString(2,refEmployee.getEmployeeName());
			psRef.setString(3,refEmployee.getEmployeePassword());
			
			psRef.executeUpdate();
			System.out.println("Record added successfully");
		}
		catch (SQLException e) {
			System.out.println("Exception caught. Not able to add record.");
		}
		finally {
			try {
				conRef.close();
			} catch (SQLException e) {
				System.out.println("Exception caught. Not able to clone connection");
			}
		}
	}

}
