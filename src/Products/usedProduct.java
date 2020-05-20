package Products;

import java.util.Date;

public final class usedProduct extends product {

	//Local Variables
	Date manufactureDate;
	
	//Constructors
	
	public usedProduct () {
		
	}

	public usedProduct(String name, Double price, Date manufactureDate) {
		super(name, price);
		this.manufactureDate = manufactureDate;
	}


	//Getters and Setters
	
	public Date getManufactureDate() {
		return manufactureDate;
	}

	public void setManufactureDate(Date manufactureDate) {
		this.manufactureDate = manufactureDate;
	}
	
	//Override Functions
	
	@Override
	protected String priceTag() {
		return name + " (used) $" + price +" (Manufacture date: "+manufactureDate;
	}
	
	
}
