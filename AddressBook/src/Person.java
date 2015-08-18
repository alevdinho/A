public class Person {
	
	private String firstName;
	private String lastName;
	private PhysicalAddress[] address;
	private EmailAddress[] emailAddress;
	int numberOfPhysicalAddresses;
	int numberOfEmailAddresses;
	final int maxAddresses = 10;
	private static int numberOfPersons;
	
	public Person() {
	}

	public Person(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public void addPhysicalAddress (PhysicalAddress pa) {
		if (address.length != maxAddresses) {
			address[numberOfPhysicalAddresses] = pa;
			numberOfPhysicalAddresses++;
		}
	}
	
	public void addEmailAddress (EmailAddress ea) {
		for (int i = 0; i < maxAddresses; i++) {
			emailAddress[numberOfPersons] = ea;
			numberOfPersons++;
		}
	}

	public PhysicalAddress[] getAddress() {
		return address;
	}

	public EmailAddress[] getEmailAddress() {
		return emailAddress;
	}

	public int getNumberOfEmailAddresses() {
		return numberOfEmailAddresses;
	}

	public int getNumberOfPhysicalAddresses() {
		return numberOfPhysicalAddresses;
	}
	
	public EmailAddress getEmailAddressAt(int index) {
		return emailAddress[index];
	}
	
	public PhysicalAddress getPhysicalAddressAt(int index) {
		return address[index];
	}
	public String toString() {
		return firstName + " " + lastName;
	}
	
	public boolean equals(Object obj) {
		Person p;
		if (obj instanceof Person)
			p = (Person) obj;
		else 
			return false;
		return this.lastName.equals(p.lastName) && this.firstName.equals(p.firstName);
	}

	public static int getNumberOfPersons() {
		return numberOfPersons;
	}
}