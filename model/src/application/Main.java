package application;

import java.util.Scanner;

import entities.Account;
import entities.exception.DomainExceptions;

public class Main {
	public static void main(String[]args) {
		Scanner scr = new Scanner(System.in);
		
		
		System.out.print("Number account:");
		
		int number = scr.nextInt();
		
		System.out.print("Holder account:");
		String holder = scr.next();
		
		System.out.print("Balance account:");
		double balance = scr.nextDouble();
		
		System.out.print("Withdraw limit:");
		double withdrawLimit = scr.nextDouble();
	
		Account account = new Account(number, holder, balance, withdrawLimit);
		
		System.out.println("Amount to withdraw:");
		double amount = scr.nextDouble();
		
		try{
			account.withdraw(amount);
			System.out.printf("updated balance %.2f", account.getBalance());
		}catch (DomainExceptions e) {
			System.out.println(e.getMessage());
		}
		
	}
}
