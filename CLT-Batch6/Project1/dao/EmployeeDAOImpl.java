package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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
	public List<Employee> showEmployees(Employee refEmployee) throws SQLException {
		
		getConnection();
		
		try {
			psRef = conRef.prepareStatement("select * from employee");
			
			ResultSet rs = psRef.executeQuery();
			
			System.out.println("Employee ID\t\t" + "Name\t\t\t" + "Password\n");
			
			if (rs.next()) {
				do {
					System.out.println(rs.getInt(1) + "\t\t\t" + rs.getString(2) + 
							"\t\t\t" + rs.getString(3));
				} while(rs.next());
			}
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
		List<Employee> showEmployees = null;
		return showEmployees;
		
	}

	@Override
	public void getEmployeeByID(Employee refEmployee) throws SQLException {
		
		getConnection();
		
		try {
			psRef = conRef.prepareStatement("select * from employee where id=?");
			psRef.setInt(1,refEmployee.getEmployeeID());
			
			ResultSet rs = psRef.executeQuery();
			
			System.out.println("Employee ID\t\t" + "Name\t\t\t" + "Password\n");
			
			if (rs.next()) {
				do {
					System.out.println(rs.getInt(1) + "\t\t\t" + rs.getString(2) + 
							"\t\t\t" + rs.getString(3) + "\n");
				} while(rs.next());
			}
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
		
	}

	@Override
	public void removeEmployee(Employee refEmployee) throws SQLException {
		
		getConnection();
		
		try {
			psRef = conRef.prepareStatement("delete from employee where id=?");
			psRef.setInt(1,refEmployee.getEmployeeID());
			
			psRef.executeUpdate();
			System.out.println("Employee record deleted successfully");
		}
		catch (SQLException e) {
			System.out.println("Exception caught. Not able to delete record.");
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
