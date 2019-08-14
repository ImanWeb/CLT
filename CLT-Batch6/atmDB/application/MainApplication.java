package application;

import controller.ATMController;

public class MainApplication {

	public static void main(String[] args) {
		
		ATMController ATMControllerRef = new ATMController();
		ATMControllerRef.adminProcess();

	}

}