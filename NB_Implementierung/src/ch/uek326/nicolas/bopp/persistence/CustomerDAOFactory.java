/**
 * Klasse implementiert factory f�r CustomerDAO.
 * @author Nicolas Bopp
**/

package ch.uek326.nicolas.bopp.persistence;

public class CustomerDAOFactory  {

	private static CustomerDAOFactory theInstance = null;

	private CustomerDAOFactory() {
	}
	
	public static CustomerDAOFactory getInstance(){
		if(theInstance == null){
			theInstance = new CustomerDAOFactory();
		}
		return theInstance;
	}
	
	public CustomerDAOMock CustomerDAOMock(){
		return CustomerDAOMock();
	}
	
}
