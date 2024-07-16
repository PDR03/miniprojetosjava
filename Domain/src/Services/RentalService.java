package Services;

import java.time.Duration;

import entities.CarRental;
import entities.Invoice;

public class RentalService {
	private Double pricePerHour;
	private Double pricePerDay;
	
	private TaxService taxService;
	
	public RentalService(Double pricePerHour, Double pricePerDay, TaxService taxService) {
		super();
		this.pricePerHour = pricePerHour;
		this.pricePerDay = pricePerDay;
		this.taxService = taxService;
	}

	public void processInvoice(CarRental carRental) {
			
		double min = Duration.between(carRental.getStart(), carRental.getFinish()).toMinutes();
		double hours = min/60;
		double basicPayment;
		
		if(hours <= 12.0) {
			
			basicPayment = pricePerHour * Math.ceil(hours);
			
		}else {
			basicPayment = pricePerDay * Math.ceil(hours / 24);
		}
		
		double tax = taxService.tax(basicPayment);
		
		carRental.setInvoice(new Invoice(basicPayment, tax));
	}
	
}
