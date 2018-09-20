package entities;

import java.util.ArrayList;

public class Person {
	
	private String personCode;
	private String firstName;
	private String lastName;
	private Address address;
	ArrayList<String> emailList = new ArrayList<String>();//To store Email Arraylist to save multiple emails

	public Person(String personCode, String firstName, String lastName, Address address, ArrayList<String> emailList) {
		super();
		this.personCode = personCode;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.emailList = emailList;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public String getPersonCode() {
		return personCode;
	}
	public void setPersonCode(String personCode) {
		this.personCode = personCode;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public ArrayList<String> getEmailList() {
		return emailList;
	}
	public void setEmailList(ArrayList<String> emailList) {
		this.emailList = emailList;
	}
	
	
	
	
//	private ArrayList<String>email;
	//method for getting email:- loop in a scanner to skip the (in the toString)
	
}
