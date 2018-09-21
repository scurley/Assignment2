package fileWriter;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import entities.Person;

public class JsonWriter {

	public void jsonConverter(List<Person> person) {
		
		Gson json = new GsonBuilder().setPrettyPrinting().create();
		File jsonOutput = new File("data/Person.json");
		
		PrintWriter jsonPrinterWriter = null;
		
		try {
			jsonPrinterWriter = new PrintWriter(jsonOutput);
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();// need to write the info converter *******************************
		}
	}
}
