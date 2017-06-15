/**
 * Schnittstelle für persistence.
 * @author Nicolas Bopp
**/

package ch.uek326.nicolas.bopp.persistence;

public interface CustomerDAO {

	public void insertCustomer(String[] customerData);
	public String[] selectCustomerAsArray(int customerID);
}
