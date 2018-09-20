package entities;
import org.joda.time.DateTime;

public class SeasonPass extends Product{
	
	private String name;
	private DateTime startDate;
	private DateTime endDate;
	private double cost;
	
	

	public SeasonPass(String productCode,String name, DateTime startDate, DateTime endDate, double cost) {
		super(productCode);
		this.name = name;
		this.startDate = startDate;
		this.endDate = endDate;
		this.cost = cost;
		// TODO Auto-generated constructor stub
	}

}
