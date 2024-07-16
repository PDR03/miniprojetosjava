package Application;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import Services.BrasilTaxService;
import Services.RentalService;
import entities.CarRental;
import entities.Vehicle;

public class Main{
public static void main(String[]args) {
		Scanner scr = new Scanner(System.in);
		System.out.println("Entre com os dados do aluguel");
		
		DateTimeFormatter dtm = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		System.out.print("Modelo do carro:");
		String model = scr.nextLine();
		
		System.out.print("Retirada:");
		LocalDateTime start = LocalDateTime.parse(scr.nextLine(), dtm);
		
		
		System.out.println("Retorno:");
		LocalDateTime finish = LocalDateTime.parse(scr.nextLine(), dtm);
		
		System.out.println("Preco por hora");
		double pricePerHour = scr.nextDouble();
		System.out.println("Preço por dia");
		double pricePerDay = scr.nextDouble();
		
		CarRental carRental = new CarRental(start, finish, new Vehicle(model));
		
		RentalService rentalServicee = new RentalService(pricePerDay, pricePerHour, new BrasilTaxService());
		
		rentalServicee.processInvoice(carRental);
		
		System.out.println("Fatura");
		System.out.print("Basic payment:" + carRental.getInvoice().getBasicPayment());
		System.out.print("Tax:" + carRental.getInvoice().getTax());
		System.out.print("Impostos" + carRental.getInvoice().getTotalPayment());
			
	}
}