package entities;

public abstract class Product {
	private String productCode;

	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public Product(String productCode) {
		this.productCode = productCode;
	}
	
	 
	
	

}
