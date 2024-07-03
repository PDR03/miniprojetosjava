package main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entities.Clients;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class Main {

	public static void main(String[] args) throws ParseException {
		Scanner scr = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Enter client data");
		
		System.out.print("Name:");
		String name = scr.next();
		
		System.out.println("Email:");
		String email = scr.next();
		
		System.out.println("Birth Date (dd/MM/yyyy):");
		Date birthDate = sdf.parse(scr.next());
		
		Clients client = new Clients(name, email, birthDate);
		
		System.out.println("what is the status of the order(PENDING_PAYMENT, PROCESSING, SHIPPED, DELIVERED");
		
		OrderStatus status = OrderStatus.valueOf(scr.next());
		
		
		Order order = new Order(new Date(), status, client);
		int response = 0;
		
		do {
		System.out.print("Product name:");
		String productName = scr.next();
		
		System.out.print( productName + " price:");
		double priceProduct = scr.nextDouble();
		
		System.out.print("How many " + productName + " are you using?: ");
		int quantity = scr.nextInt();
		
		Product product = new Product(productName, priceProduct);
		
		OrderItem orderitem = new OrderItem(quantity, priceProduct , product);
		order.addItem(orderitem);
		System.out.println("Do you want to add more items? (Enter 1 for yes, 0 for no)");
		response = scr.nextInt();
		}while(response != 0);
		
		System.out.println(order.toString());
	}

}
