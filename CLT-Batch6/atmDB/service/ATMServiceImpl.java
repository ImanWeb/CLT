package service;

import dao.ATMDAO;
import dao.ATMDAOImpl;
import model.ATMUser;

public class ATMServiceImpl implements ATMService {
	
	ATMDAO refATMDAO;

	@Override
	public void callAddUser(ATMUser refATMUser) {
		
		refATMDAO = new ATMDAOImpl();
		refATMDAO.addUser(refATMUser);
		
	}

	@Override
	public boolean callCheckLogin(ATMUser refATMUser) {
		
		refATMDAO = new ATMDAOImpl();
		return refATMDAO.checkLogin(refATMUser);
		
	}

	@Override
	public void callCheckBalance(ATMUser refATMUser) {
		
		refATMDAO = new ATMDAOImpl();
		refATMDAO.checkBalance(refATMUser);
		
	}

}
