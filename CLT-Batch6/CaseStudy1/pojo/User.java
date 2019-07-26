package pojo;

// POJO to store user information

public class User {
	
	private UserDetails refUserDetails;
	private AccountInfo refAccountInfo;
	
	public User() {		
		refUserDetails = new UserDetails();
		refAccountInfo = new AccountInfo();
	}

	public UserDetails getRefUserDetails() {
		return refUserDetails;
	}

	public AccountInfo getRefAccountInfo() {
		return refAccountInfo;
	}

}