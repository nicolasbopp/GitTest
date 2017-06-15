/**
 * Testklasse für persistence
 * @author Nicolas Bopp
 */

package ch.uek326.nicolas.bopp.test.persistence;

import ch.uek326.nicolas.bopp.persistence.CustomerDAO;
import ch.uek326.nicolas.bopp.persistence.CustomerDAOFactory;

public class CustomerDAOTest {

	private CustomerDAOFactory theDAOFactory = null;
	private CustomerDAO theCustomerDAO = null;	
	
	
	protected void setUp() throws Exception {
		theDAOFactory = CustomerDAOFactory.getInstance();

	}

}
