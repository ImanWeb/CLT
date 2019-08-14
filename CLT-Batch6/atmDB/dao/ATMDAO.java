package dao;

import model.ATMUser;

public interface ATMDAO {
	
	public void addUser(ATMUser refATMUser);
	
	public boolean checkLogin(ATMUser refATMUser);
	
	public void checkBalance(ATMUser refATMUser);

}
