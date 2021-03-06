/**
 * Speichert Objekte in Liste und erm�glicht das aufr�fen dieser Objekte.
 * @author Nicolas Bopp
**/

package ch.uek326.nicolas.bopp.persistence;

public abstract class CustomerDAOMock implements CustomerDAO {
	
	private String[][] customerList = null;
	private int insertCount = 0;	
	
	CustomerDAOMock() {		
		customerList = new String[10][10];
		insertCount = 0;		
	}

	public void insertCustomerAsArray(String[] customerData) {
		if(insertCount < 10){
			customerList[insertCount] = customerData;
			insertCount++;			
		}
	}

	public String[] selectCustomerAsArray(int customerID) {
		if(customerID < insertCount){
			return customerList[customerID];	
		}	
		return null;
	}
}
