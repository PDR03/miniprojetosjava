package Application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import entities.Employee;
import entities.HourlyeEmployee;
import entities.MonthlyEmployee;

public class Main {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy");
		Scanner scr = new Scanner(System.in);
		List <Employee> list = new ArrayList<>();
		int response = 0;
		System.out.print("Comapany name:");
		String comapanyName = scr.next();
		
		do{
			System.out.println("name employee");
		
		String name = scr.next();
		scr.nextLine();
		
		System.out.println("How old are you:");
		int age = scr.nextInt();
		
		System.out.println("Start date at the company");
		
			Date date = sdf.parse(scr.next("dd/MM/yyyy"));
		
		System.out.println("Do you work per hour or per month?(1: hour| 2: month");
		 response = scr.nextInt();
		
		if(response == 1) {
			
			System.out.println("How much do you earn per hour");
			double valuePerHour = scr.nextDouble();
			
			System.out.println("how many hours do you work per month");
			int workedhours = scr.nextInt();
			
			list.add(new HourlyeEmployee(name, age, date, valuePerHour, workedhours));
			
		}else if(response == 2) {
			
			System.out.println("How much do you earn per month");
			double salary = scr.nextDouble();
			
			System.out.println("How much do you earn in food stamps");
			double foodVoucher = scr.nextDouble();
			
			System.out.println("How much do your earn in transportation voucher");
			double transportationVoucher = scr.nextDouble();	
			
			list.add(new MonthlyEmployee(name, age, date,foodVoucher,transportationVoucher));
		
		}
		System.out.println("Do you want add more employees?(s:1|n:0");
		response = scr.nextInt();
		}while(response != 0);
		System.out.println("Company:" + comapanyName + "\n");
		for(Employee emp: list) {
			
			System.out.println("Name: " + emp.getName());
			System.out.println("Age: " +  emp.getAge());
			System.out.println("Entry date: " + emp.getHiringDate());
			System.out.println("Total salary: " + emp.getSalary());
			
		}
		
	}

}
