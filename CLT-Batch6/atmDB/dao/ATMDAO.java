package dao;

import model.ATMUser;

public interface ATMDAO {
	
	public void addUser(ATMUser refATMUser);
	
	public boolean checkLogin(ATMUser refATMUser);
	
	public void checkBalance(ATMUser refATMUser);
	
	public void matchBalance(ATMUser refATMUser);
	
	public void depositAmount(ATMUser refATMUser);
	
	public void withdrawAmount(ATMUser refATMUser);
	
	public boolean checkSecurityKey(ATMUser refATMUser);
	
	public void updatePassAndSecurity(ATMUser refATMUser);

}
