package service;

import model.ATMUser;

public interface ATMService {
	
	public void callAddUser (ATMUser refATMUser);
	
	public boolean callCheckLogin (ATMUser refATMUser);
	
	public void callCheckBalance (ATMUser refATMUser);
	
	public void callMatchBalance (ATMUser refATMUser);
	
	public void callDepositAmount (ATMUser refATMUser);
	
	public void callWithdrawAmount (ATMUser refATMUser);
	
	public boolean callCheckSecurityKey (ATMUser refATMUser);
	
	public void callUpdatePassAndSecurity (ATMUser refATMUser);

}
