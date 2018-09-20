package entities;

public class Address {
	
	//what address consists of
	private String city;
	private String state;
	private String street;
	private String zip;//int or string?
	private String country;
	
	// Constructor
	public Address(String city, String state, String street, String zip, String country) {
		super();
		this.city = city;
		this.state = state;
		this.street = street;
		this.zip = zip;
		this.country = country;
	}

	// Getter & Setter methods
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

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	
	
	
	
}
