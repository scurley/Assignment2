package entities;

public class ParkingPass extends Product{
	
	private double parkingFee;

	public ParkingPass(String productCode, double parkingFee) {
		super(productCode);
		this.parkingFee = parkingFee;
	}
	

}
