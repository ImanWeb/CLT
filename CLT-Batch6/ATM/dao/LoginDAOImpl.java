package dao;

import pojo.User2;

public class LoginDAOImpl implements LoginDAO {
	
	boolean status; // if don't declare anything, the default is false
	
	// connect with the DB here

	@Override
	public boolean loginValidate(User2 ref) {
		
		if (ref.getUserID()==1234 && ref.getUserPassword().equals("test")) {
			status = true;
		} else {
			status = false;
		}
		
		return status;

	}

}
