package Products;

public class product {

	//Local Variables
	
	String name;
	Double price;
	
	///Constructors 
	
	public product() {
		
	}
	
	public product(String name, Double price) {
		this.name = name;
		this.price = price;
	}

	//Getters and Setters
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	//Functions
	
	protected String priceTag() {
		return name + " $" + price;
	}
	
	
}