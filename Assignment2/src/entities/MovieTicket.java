package entities;
import org.joda.time.DateTime;

public class MovieTicket extends Product {
	private String code;
	private DateTime dateTime;//date time
	private String movieName;
	private Address address;
	private int screenNo;
	private double price;
	
	
	public MovieTicket(String productCode,String code, DateTime dateTime,String movieName, Address address, int screenNo,double price ) {
		super(productCode);
		// TODO Auto-generated constructor stub
	}
	
	
	

}
