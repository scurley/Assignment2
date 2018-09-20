package fileReader;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Person;//imports Person.java file for data

public class FlatFileReaderPerson {
	
	public ArrayList<Person> readPerson() {
		
		try {
			File f = new File("data/Persons.dat");
			Scanner s = new Scanner(f);
			s.nextLine();//reads the number of records from the first line
			List<Person> result = new ArrayList<Person>();
			
			while(s.hasNext()) {
				String line = s.nextLine();
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
					
					
					result.add(p);
				}
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	
	
	
	

}
