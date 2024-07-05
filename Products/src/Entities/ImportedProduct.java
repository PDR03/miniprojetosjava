package Entities;

public class ImportedProduct extends Product {
	private double customFee;
	
	//Constructors
	public ImportedProduct(String name, Double price, Double customFee) {
		super(name, price);
		this.customFee = customFee;
	}
	
	//Getters and Setters 
	public double getCustomFee() {
		return customFee;
	}
	public void setCustomFee(double customFee) {
		this.customFee = customFee;
	}
	
	//Methods
	private double totalPrice() {
		return customFee + getPrice();
	}
	@Override
	public final String priceTag(){
		return getName() + " Total price: " + totalPrice() + "(Custom fee $" + getCustomFee() + ")";
		
	}
}
