package service;

import pojo.User;

public class LoginServiceImpl implements LoginService {

	LoginDAO refLoginDAO;

	@Override
	public void checkStatus(User ref) {
		refLoginDAO = new LoginDAOImpl();
		if (refLoginDAO.loginValidate(ref)==true) {
			System.out.println("welcome");
		} else {
			System.out.println("not valid");
		}		
	}

}
