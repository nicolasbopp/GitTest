/**
 * Klasse implementiert Customer für Customer.
 * @author Nicolas Bopp
 */

package ch.uek326.nicolas.bopp.logic;

import javax.print.attribute.standard.Media;

import ch.uek326.nicolas.bopp.persistence.CustomerDAO;
import ch.uek326.nicolas.bopp.persistence.CustomerDAOFactory;

public class CustomerFactory{
	
	private static final int FIRSTNAME_INDEX = 0;
	private static final int LASTNAME_INDEX = 0;
	
	private static CustomerFactory theInstance = null;
	private CustomerDAO theDAO = null;
	
	private CustomerFactory() {
		theDAO = CustomerDAOFactory.getInstance().CustomerDAOMock();
	}
	
	public static CustomerFactory getInstance(){
		if(theInstance == null){
			theInstance = new CustomerFactory();
		}
		return theInstance;
	}
	
	public Customer createCustomer(){
		return new CustomerInit("Fehler", "Fehler");	
	}
	
	public Customer createCustomer(String lastname, String firstname){
		return new CustomerInit(lastname, firstname);
	}	
	
	public void saveCustomer(Customer customer){		
		theDAO.insertCustomer(customerToArray(customer));
	}
	
	public Customer findMedia(int customerID){
		String[] customerData = theDAO.selectCustomerAsArray(customerID);
		if(customerData == null){
			return null;
		}
		return arrayToCustomer(customerData);
	}

	private String[] customerToArray(Customer customer){		
		String[] customerData = new String[2];
		
		customerData[LASTNAME_INDEX] = customer.getLastname();
		customerData[FIRSTNAME_INDEX] = customer.getFirstname();
		return customerData;
	}
	
	private Customer arrayToCustomer(String[] customerData){		
		Customer customer = createCustomer(customerData[LASTNAME_INDEX], customerData[FIRSTNAME_INDEX]);		
	
		return arrayToCustomer(null);
	}
}
