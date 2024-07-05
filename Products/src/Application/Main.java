package Application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Entities.ImportedProduct;
import Entities.Product;
import Entities.UsedProduct;

public class Main {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		char answer = ' ';
		List <Product> list = new ArrayList<>();
		System.out.println("Enter the products");
		do {
			System.out.println("Comom, Used or Imported (C/U/I)");
			char choose = scr.next().charAt(0);
			System.out.print("Name");
			String name = scr.next();
			System.out.println("Price:");
			double price = scr.nextDouble();
			if(choose == 'C') {
				list.add(new Product(name,price));
			}else if(choose == 'U') {
				System.out.println("Manufacture date:");
				LocalDate date = LocalDate.parse(scr.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
				list.add(new UsedProduct(name, price, date));
			}else {
				System.out.println("Custom fee price");
				double customFee = scr.nextDouble();
				list.add(new ImportedProduct(name, price, customFee));
			}
			System.out.println("You want add more products? (S/N)");
			answer = scr.next().charAt(0);
		}while(answer != 'N');
		
		for(Product prod : list) {
			System.out.println(prod.priceTag());
		}
	}
}
