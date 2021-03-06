package fileReader;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Address;//imports Address
import entities.Person;//imports Person.java file for data

public class FlatFileReaderPerson {
	
	public List<Person> readPerson() {
		Scanner s = null;
		
		try {
			s  = new Scanner(new File("data/Persons.dat"));
			s.nextLine();//reads the number of records from the first line
			List<Person> result = new ArrayList<Person>();
			ArrayList<String> emailList = new ArrayList<String>();
			Address address = null;
			
			while(s.hasNext()) {
				String line = s.nextLine();//Reads Variables and give them variables
				if(!line.trim().isEmpty()) {
					Person p = null;
					String data[] = line.split(";");
					String personCode = data[0];
					
					String nameTokens[] = data[1].split(",");
					String lastName = nameTokens[0];
					String firstName = nameTokens[1];
					
					String addressTokens[] = data[2].split(",");
					String street = addressTokens[0];
					String city = addressTokens[1];
					String state = addressTokens[2];
					String zip = addressTokens[3];
					String country = addressTokens[4];
					
					String emailTokens[] = data[3].split(",");//Needs a way to grab multiple email addresses will need a subclass or a for loop
					int i = 0;
					while(emailTokens[i] != null) {
				
						String email = emailTokens[i];
						emailList.add(email);
						i++;
					}
						
					address = new Address(city, state, street, zip, country);//sends variables to constructors
					p = new Person (personCode, lastName, firstName, address, emailList);
					
					result.add(p);
				}
			}
			s.close();//closes scanner and returns array
			return result;
			
		} catch(Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	
	
	

}
