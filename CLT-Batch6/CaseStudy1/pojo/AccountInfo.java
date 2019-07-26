package pojo;

public class AccountInfo {
	
private int balance;
	
	public AccountInfo() {
		balance = 0; // $0 is the default balance
	}
	
	// Method to check current balance
	public int getBalance() {
		return balance;
	}
	
	// Method to deposit amount
	public void depositAmount(int amount) {
		balance += amount;
	}
	
	// Method to withdraw amount
	public boolean withdrawAmount(int amount) {
		if (isSufficient(amount)) {
			balance -= amount;
			return true;
		} else {
			return false;
		}
	}
	
	// Checks if there is enough in the balance. If not enough, user can't withdraw
	public boolean isSufficient(int amount) {
		if (balance < amount) {
			return false;
		} else {
			return true;
		}
	}

}
