package entities;

import java.util.Date;

public class MonthlyEmployee extends Employee {
	private Double foodVoucher;
	private Double transportatioVouchers;
	
	//Constructor
	public MonthlyEmployee(String name, Integer age, Date hiringDate, Double foodVoucher,Double transportatioVouchers) {
		super(name, age, hiringDate);
		this.foodVoucher = foodVoucher;
		this.transportatioVouchers = transportatioVouchers;
		super.setSalary(foodVoucher + transportatioVouchers + super.getSalary());
	}

	
	//Getters and Setters
	
	public Double getFoodVoucher() {
		return foodVoucher;
	}


	public void setFoodVoucher(Double foodVoucher) {
		this.foodVoucher = foodVoucher;
	}


	public Double getTransportatioVouchers() {
		return transportatioVouchers;
	}


	public void setTransportatioVouchers(Double transportatioVouchers) {
		this.transportatioVouchers = transportatioVouchers;
	}
	
	//Methods
}
