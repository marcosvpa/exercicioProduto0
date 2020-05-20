package Products;

public final class importedProduct extends product {
	
	//Local Variables
	Double customsFee;

	//Constructors 
	
	public importedProduct() {
		
	}
	
	public importedProduct(String name, Double price, Double customsFee) {
		super(name, price);
		this.customsFee = customsFee;
	}

	
	//Getters and Setters
	
	public Double getCustomsFee() {
		return customsFee;
	}

	public void setCustomsFee(Double customsFee) {
		this.customsFee = customsFee;
	}
	
	//Functions
	
	protected Double totalPrice () {
		return price + customsFee;
	}
	
	//Override functions
	
	@Override
	protected  String priceTag() {
		return name + " $" + totalPrice() +"(Customs fee: $" + customsFee+")";
	}
	
	
	
}

	
	

