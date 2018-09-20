package fileReader;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.datacontainers.Address;
import com.datacontainers.Person;


public class FlatFileReaderPerson {
	
	public static List<Person> readPerson() {
		
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
					String nameTokens[] = 
					String lastName = data[0];
					String firstName = data[1];
					String addressTokens[] = data[2].split(",");
					String street = addressTokens[0];
					String city = addressTokens[1];
					String state = addressTokens[2];
					String zip = addressTokens[3];
					String country = addressTokens[4];
					
					
					
					
					
//					if(tokens.length == 6) {
//						hourlyPayRate = Double.parseDouble(tokens[4]);
//						hoursWorked = Double.parseDouble(tokens[5]);
//					} else if(tokens.length == 5) {
//						annualSalary = Double.parseDouble(tokens[4]);
//					}
//					
//					if(tokens[0].equals("E")) {
//						e = new salaryEmployee(id, firstName, lastName, title, annualSalary); //TODO: modify this
//					} else if(tokens[0].equals("S")) {
//						e = new Staff(id, firstName, lastName, title, hourlyPayRate, hoursWorked); //TODO: modify this
//					} else if(tokens[0].equals("T")) {
//						e = new Temporary(id, firstName, lastName, title, hourlyPayRate,
//								hoursWorked); //TODO: modify this
//					}
					
					result.add(p);
				}
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	
	
	
	

}
