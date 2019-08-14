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
			psRef = conRef.prepareStatement("select * from user where emailAddress=? and password=?");
			psRef.setString(1,refATMUser.getEmailAddress());
			psRef.setString(2, refATMUser.getPassword());
			
			ResultSet rs = psRef.executeQuery();
			
			if (rs.next()) {
				do {
					if (rs.getString(1).equals(refATMUser.getEmailAddress())) {
						if (rs.getString(2).equals(refATMUser.getPassword())) {
							System.out.println("Login Successful");
							return true;
						}
					}
				} while (rs.next());
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

	@Override
	public void checkBalance(ATMUser refATMUser) {
		
		getConnection();
		
		try {
			psRef = conRef.prepareStatement("select * from user where emailAddress=?");
			psRef.setString(1,refATMUser.getEmailAddress());
			
			ResultSet rs = psRef.executeQuery();
			
			if (rs.next()) {
				do {
					System.out.println("Available balance: $" + rs.getInt(4));
				} while(rs.next());
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
		
	}

	@Override
	public void depositAmount(ATMUser refATMUser) {
		
		getConnection();
		
		try {
			psRef = conRef.prepareStatement("update user set balance=? where emailAddress=?");
			psRef.setInt(1,refATMUser.getBalance());
			psRef.setString(2,refATMUser.getEmailAddress());
			
			psRef.executeUpdate();
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
	public void withdrawAmount(ATMUser refATMUser) {
		
		getConnection();
		
		try {
			psRef = conRef.prepareStatement("update user set balance=? where emailAddress=?");
			psRef.setInt(1,refATMUser.getBalance());
			psRef.setString(2,refATMUser.getEmailAddress());
			
			psRef.executeUpdate();
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

}
