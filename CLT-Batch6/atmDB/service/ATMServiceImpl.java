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
	
	@Override
	public void callMatchBalance(ATMUser refATMUser) {
		
		refATMDAO = new ATMDAOImpl();
		refATMDAO.matchBalance(refATMUser);
		
	}

	@Override
	public void callDepositAmount(ATMUser refATMUser) {
		
		refATMDAO = new ATMDAOImpl();
		refATMDAO.depositAmount(refATMUser);
		
	}

	@Override
	public void callWithdrawAmount(ATMUser refATMUser) {
		
		refATMDAO = new ATMDAOImpl();
		refATMDAO.withdrawAmount(refATMUser);
		
	}

	@Override
	public boolean callCheckSecurityKey(ATMUser refATMUser) {
		
		refATMDAO = new ATMDAOImpl();
		return refATMDAO.checkSecurityKey(refATMUser);
		
	}

	@Override
	public void callUpdatePassAndSecurity(ATMUser refATMUser) {
		
		refATMDAO = new ATMDAOImpl();
		refATMDAO.updatePassAndSecurity(refATMUser);
		
	}

}
