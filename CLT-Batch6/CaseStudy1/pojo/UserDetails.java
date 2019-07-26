package pojo;

public class UserDetails {
	
	private String emailAddress;
	private String password;
	private String favouriteColour;
	
	public UserDetails() {
		emailAddress = "";
		password = "";
		favouriteColour = "";
	}

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

}
