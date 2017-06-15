/**
 * Implementiert einen Customer.
 * @author Nicolas Bopp
 */

package ch.uek326.nicolas.bopp.logic;

public class CustomerInit implements Customer{

	private String lastname;
	private String firstname;
	
	public CustomerInit(String lastname, String firstname) {
		super();
		this.lastname = lastname;
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
}
