package application;

import java.sql.SQLException;

import controller.AdminController;

public class ProjectApplication {

	public static void main(String[] args) throws SQLException {
		
		AdminController adminControllerRef = new AdminController();
		adminControllerRef.adminProcess();

	}

}