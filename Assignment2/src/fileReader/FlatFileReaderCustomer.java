package fileReader;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

import entities.Address;
import entities.Customer;
import entities.Person;

public class FlatFileReaderCustomer {

	public ArrayList<Customer> readCustomer(){
		Scanner s = null;
		
		try {
			s = new Scanner(new File ("data/Person.dat"));
			s.nextLine();
			ArrayList<Customer> result = new ArrayList<Customer>();
			Address address = null;//For constructing Names 
			Person person = null;// Constructing address
			
			while(s.hasNext()) {
				String line = s.nextLine();
				if(!line.trim().isEmpty()) {
					//Customer object
					Customer c = null;
					String data[] = line.split(";");
					String customerCode = data[0];
					//Names
					String nameTokens[] = data[1].split(",");
					String lastName = nameTokens[0];
					String firstName = nameTokens[1];
					//Address
					String addressTokens[] = data[2].split(",");
					String street = addressTokens[0];
					String city = addressTokens[1];
					String state = addressTokens[2];
					String zip = addressTokens[3];
					String country = addressTokens[4];
					//Constructing objects
					address = new Address(city, state, street, zip, country);
					person = new Person(null, lastName, firstName, null);
					c = new Customer(customerCode, person, null, address);
					
					result.add(c);
				}
			}
			s.close();
			return result;
		}
		catch(Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
}
