public class EmailAddress extends Address{
	private String emailAddress;

	public EmailAddress() {
		super();
	}

	public EmailAddress(String emailAddress) {
		super();
		// TODO Auto-generated constructor stub
		this.emailAddress = emailAddress;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	
	public String toString() {
		return emailAddress;
	}
	
	public boolean equals(Object obj) {
		EmailAddress ea;
		if (obj instanceof EmailAddress)
			ea = (EmailAddress) obj;
		else 
			return false;
		return this.getEmailAddress().equals(ea.getEmailAddress());
	}
}