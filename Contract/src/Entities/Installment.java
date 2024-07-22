package Entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Installment {
	
	private LocalDate date;
	private Double amount;
	
	DateTimeFormatter dtm = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	//Constructors
	public Installment(LocalDate date, Double amount) {
		super();
		this.date = date;
		this.amount = amount;
	}

	//Getters and Setters
	public LocalDate getDate() {
		return date;
	}


	public void setDate(LocalDate date) {
		this.date = date;
	}


	public Double getAmount() {
		return amount;
	}


	public void setAmount(Double amount) {
		this.amount = amount;
	}
	
	@Override
	public String toString() {
		return date.format(dtm) + " - " + String.format("%.2f", amount);
 	}
}
