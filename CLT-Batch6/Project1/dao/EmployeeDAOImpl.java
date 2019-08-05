package dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import connection.DBConnection;
import model.Employee;

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

	@Override
	public void updateEmployee(Employee refEmployee) throws SQLException {
		
		getConnection();
		
		try {
			psRef = conRef.prepareStatement("update employee set name=?, password=? where id=?");
			psRef.setString(1,refEmployee.getEmployeeName());
			psRef.setString(2,refEmployee.getEmployeePassword());
			psRef.setInt(3,refEmployee.getEmployeeID());
			
			psRef.executeUpdate();
			System.out.println("Record updated successfully");
		}
		catch (SQLException e) {
			System.out.println("Exception caught. Not able to update record.");
		}
		finally {
			try {
				conRef.close();
			} catch (SQLException e) {
				System.out.println("Exception caught. Not able to clone connection");
			}
		}		
	}

	@Override
	public List<Employee> showEmployees() throws SQLException {
		
		getConnection();
		
		try {
			psRef = conRef.prepareStatement("select * from employee");
			
			ResultSet rs = psRef.executeQuery();
			
			// List to hold Employees
			List<Employee> listOfEmployee = new ArrayList<Employee>();
			
			// Extract values from result set and store in List
			while (rs.next()) {
				Employee e = new Employee();	
				e.setEmployeeID(rs.getInt("employeeId"));
				e.setEmployeeName(rs.getString("employeeName"));
				e.setEmployeePassword(rs.getString("password"));
				listOfEmployee.add(e);
			}
			
			System.out.println("Record shown successfully");
			
			// Return the Employee List
			return listOfEmployee;
		
		}
		catch (SQLException e) {
			System.out.println("Exception caught. Not able to show record.");
		}
		finally {
			try {
				conRef.close();
			} catch (SQLException e) {
				System.out.println("Exception caught. Not able to clone connection");
			}
		}
		return null;
		
	}

}