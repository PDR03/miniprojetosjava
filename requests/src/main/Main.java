package main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entities.Clients;

public class Main {

	public static void main(String[] args) throws ParseException {
		Scanner scr = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
		
		System.out.println("Enter client data");
		
		System.out.println("Name:");
		String name = scr.next();
		
		System.out.println("Email:");
		String email = scr.next();
		
		System.out.println("Birth Date (dd/mm/yyyy");
		Date birthDate = sdf.parse(scr.next());
		
		Clients client = new Clients(name, email, birthDate);
		
		
		
	}

}
