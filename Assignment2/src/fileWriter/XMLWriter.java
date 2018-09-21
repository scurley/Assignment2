package fileWriter;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.List;

import com.thoughtworks.xstream.XStream;

import entities.Person;

public class XMLWriter {

	private XStream xstream = null;
	
	public XMLWriter() {
		this.xstream = new XStream();
		xstream.alias("person", Person.class);
	}
	
	public void xmlConverter(List<Person> person) {
		File xmlOutput = new File ("data/Person.xml");
		
		PrintWriter xmlPrintWriter = null;
		try {
			xmlPrintWriter = new PrintWriter(xmlOutput);
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		xml.PrintWriter.write("Hello");
	}
}
