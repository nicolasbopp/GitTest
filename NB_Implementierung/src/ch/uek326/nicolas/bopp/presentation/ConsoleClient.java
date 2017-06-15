/**
 * Startklasse für das Programm und gibt Werte an Logic weiter.
 */

package ch.uek326.nicolas.bopp.presentation;

import java.util.Scanner;


import ch.uek326.nicolas.bopp.logic.Customer;
import ch.uek326.nicolas.bopp.logic.CustomerFactory;

public class ConsoleClient {
	
	Scanner scan = new Scanner(System.in);
	private static CustomerFactory theCustomerFactory = null;
	
	public ConsoleClient() {
		theCustomerFactory = CustomerFactory.getInstance();
	}
	
	public static void main(String[] args) {
		start();
	}
	
	public static void start() {
		int selection;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Wilkommen bei der Kundenverwaltung");
		System.out.println("----------------------------------");
		System.out.println("Geben Sie '1' ein um einen neuen Kunden zu erstellen.");
		System.out.println("Geben Sie '2' ein um alle Kunden anzuschauen.");
		System.out.print("Ihre Wahl: ");
		selection = scan.nextInt();
	
		switch(selection){
			case '1':
				//createCustomer(lastname, firstname);
				break;
				
			case '2':
				//displayCustomer(ID);
				break;
			default:
				System.out.println("Keine gültige Auswahl.");
		}
	}
	
	public void createCustomer(String lastname, String firstname){
		Customer customer = theCustomerFactory.createCustomer(lastname, firstname);
		theCustomerFactory.saveCustomer(customer);
	}
	
	public void displayCustomer(int customerID){
		Customer customer = theCustomerFactory.findMedia(customerID);
		System.out.println("Nachname: " + customer.getLastname());
		System.out.println("Vorname: " + customer.getFirstname());
	}
}
