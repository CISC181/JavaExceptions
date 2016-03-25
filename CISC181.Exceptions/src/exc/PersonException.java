
package exc;

import base.Person;

public class PersonException extends Exception {

	private Person p;

	public PersonException(Person p, String Message) {
		super(Message);
		this.p = p;
		
	}

	public Person getP() {
		return p;
	}
	
	
	
}
