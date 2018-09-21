package entities;

public class Refreshments extends Product {
	private String name;
	private double cost;

	public Refreshments(String productCode, String name, double cost) {
		super(productCode);
		this.name = name;
		this.cost = cost;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

}
