package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import connection.DBConnection3;
import model.ATMUser;

public class ATMDAOImpl implements ATMDAO {
	
	Connection conRef;
	PreparedStatement psRef;
	
	void getConnection() {
		try {
			conRef = DBConnection3.prepareConnection();
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println("DB Connection Error");
		}
	}

	@Override
	public void addUser(ATMUser refATMUser) {
		
		getConnection();
		
		try {
			psRef = conRef.prepareStatement("insert into user(emailAddress,password,favouriteColour) values (?,?,?)");
			psRef.setString(1,refATMUser.getEmailAddress());
			psRef.setString(2,refATMUser.getPassword());
			psRef.setString(3,refATMUser.getFavouriteColour());
			
			psRef.executeUpdate();
			System.out.println("User added successfully");
		} catch (SQLException e) {
			System.out.println("Exception caught");
		} finally {
			try {
				conRef.close();
			} catch (SQLException e) {
				System.out.println("Exception caught");
			}
		}
		
	}

	@Override
	public boolean checkLogin(ATMUser refATMUser) {
		
		getConnection();
		
		try {
			psRef = conRef.prepareStatement("select password from employee where emailAddress=?");
			psRef.setString(1,refATMUser.getEmailAddress());
			
			ResultSet rs = psRef.executeQuery();
			
			if (refATMUser.getPassword().equals(rs)) {
				System.out.println("Login successful");
				return true;
			} else {
				System.out.println("Invalid login details");
			}
		} catch (SQLException e) {
			System.out.println("Exception caught");
		} finally {
			try {
				conRef.close();
			} catch (SQLException e) {
				System.out.println("Exception caught");
			}
		}
		return false;
		
	}

}
