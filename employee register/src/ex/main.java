package ex;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {
	public static void main(String[]args) {
		
		Scanner scr = new Scanner(System.in);
		List <employee> list = new ArrayList<>();
		
		
		char answer;
		do {
			System.out.println("Employee data:");
			
			System.out.print("OutSourced? (Y/N):");
			char ch = scr.next() .charAt(0);
			
			System.out.print("Name:");
			String name = scr.next();
			
			System.out.print("Hours:");
			int hour = scr.nextInt();
			
			System.out.print("Value per hours:");
			double valuePerHour = scr.nextDouble();
			
			if(ch == 'Y') {
				System.out.println("Additional Charge:");
				double additionalCharger = scr.nextDouble();
				employee emp = new OutSourcedemployee(name, hour, valuePerHour, additionalCharger);
				list.add(emp);
			}else {
				employee emp = new employee(name, hour, valuePerHour);
				list.add(emp);
			}
			
			System.out.println("Do you want to add more employees?(y/n):");
			answer = scr.next().charAt(0);
			
		}while(answer != 'n');
		
		for(employee emp : list) {
			System.out.println(emp.getName() + "- $" + emp.payment());
		}
	}

}
