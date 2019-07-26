package service;

import dao.LoginDAO;
import dao.LoginDAOImpl;
import pojo.User2;

public class LoginServiceImpl2 implements LoginService {
	
	LoginDAO refLoginDAO;
	
	@Override
	public void checkStatus(User2 ref) {	
		refLoginDAO = new LoginDAOImpl();		
		if (refLoginDAO.loginValidate(ref)==true) {
			System.out.println("welcome");
		} else {
			System.out.println("not valid");
		}
	}

}