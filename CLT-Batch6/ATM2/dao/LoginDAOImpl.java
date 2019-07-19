package dao;

import pojo.User;

public class LoginDAOImpl implements LoginDAO {

	boolean status; // if don't declare anything, the default is false
	
	// connect with the DB here

	@Override
	public boolean loginValidate(User ref) {
		
		if (ref.getUserID()==1234 && ref.getUserPassword().equals("test")) {
			status = true;
		} else {
			status = false;
		}
		
		return false;
	}

}
