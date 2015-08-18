public class PhysicalAddress extends Address {
	private String street;
	private String city;
	private String state;
	private String zipCode;
	
	public PhysicalAddress() {
		super();
	}

	public PhysicalAddress(String addressType, String street, String city, String state, String zipCode) {
		super(addressType);
		// TODO Auto-generated constructor stub
		this.street = street;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}	
	
	public String toString() {
		return street + city + state + zipCode;
	}
	
	public boolean equals(Object obj) {
		PhysicalAddress pa;
		if (obj instanceof PhysicalAddress)
			pa = (PhysicalAddress) obj;
		else 
			return false;
		return this.getStreet().equals(pa.getStreet()) && this.getCity().equals(pa.getCity()) &&
			   this.getState().equals(pa.getState()) && this.getZipCode().equals(pa.getZipCode());
	}
}