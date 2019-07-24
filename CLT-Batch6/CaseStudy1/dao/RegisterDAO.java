package dao;

import pojo.UserDetails;

public class RegisterDAO {

	boolean status;
	
	public boolean checkEmail(UserDetails ref) {
		
		if (ref.getEmailAddress().equals("xyz@gmail.com")) {
			status = true;
		} else {
			status = false;
		}
		
		return status;
	}

}
