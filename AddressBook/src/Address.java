public class Address {
	private String addressType;

	public Address() {
	}
	public Address(String addressType) {
		this.addressType = addressType;
	}

	public String getAddressType() {
		return addressType;
	}

	public void setAddressType(String addressType) {
		this.addressType = addressType;
	}
	
	public String toString() {
		return addressType;
	}
	
	public boolean equals(Object obj) {
		Address a;
		if (obj instanceof Address)
			a = (Address) obj;
		else 
			return false;
		return this.getAddressType().equals(a.getAddressType());
	}
	
}