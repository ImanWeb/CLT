package service;

import dao.LoginDAO;
import dao.LoginDAOImpl;
import pojo.User;

public class LoginServiceImpl2 implements LoginService {
	
	LoginDAO refLoginDAO;
	
	@Override
	public void checkStatus(User ref) {	
		refLoginDAO = new LoginDAOImpl();		
		if (refLoginDAO.LoginValidate(ref)==true) {
			System.out.println("welcome");
		} else {
			System.out.println("not valid");
		}
	}

}
