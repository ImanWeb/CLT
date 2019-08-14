package model;

public class ATMUser {
	
	private String emailAddress;
	private String password;
	private String favouriteColour;
	private int balance;
	
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFavouriteColour() {
		return favouriteColour;
	}
	public void setFavouriteColour(String favouriteColour) {
		this.favouriteColour = favouriteColour;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}

}
