package service;

import model.ATMUser;

public interface ATMService {
	
	public void callAddUser (ATMUser refATMUser);
	
	public boolean callCheckLogin (ATMUser refATMUser);
	
	public void callCheckBalance (ATMUser refATMUser);

}
