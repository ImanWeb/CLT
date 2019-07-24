package service;

import dao.RegisterDAO;
import pojo.UserDetails;

public class RegisterService {
	
	RegisterDAO refRegisterDAO;

	public void checkStatus(UserDetails ref) {	
		
		refRegisterDAO = new RegisterDAO();
		
		if (refRegisterDAO.checkEmail(ref) == true) {
			System.out.println("Email already exists!");
		} else {
			System.out.println("not valid");
		}
		
	}

}
