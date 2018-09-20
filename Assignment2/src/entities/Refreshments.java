package entities;

public class Refreshments extends Product {
	private String name;
	private double cost;
	
	

	public Refreshments(String productCode, String name, double cost) {
		super(productCode);
		this.name = name;
		this.cost = cost;
		
	}

}
