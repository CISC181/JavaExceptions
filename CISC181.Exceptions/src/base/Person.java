package base;

import java.util.regex.Pattern;

import exc.PersonException;

public class Person {

	private String FirstName;
	private String MiddleName;
	private String LastName;
	private String PhoneNbr;
	
	public Person()
	{
		
	}
	public Person(String firstName, String middleName, String lastName, String phoneNbr) throws PersonException {
		super();
		FirstName = firstName;
		MiddleName = middleName;
		LastName = lastName;
		setPhoneNbr(phoneNbr);
	}
	public String getFirstName() {
		return FirstName;
	}
	public Person setFirstName(String firstName) {
		FirstName = firstName;
		return this;
	}
	public String getMiddleName() {
		return MiddleName;
	}
	public Person setMiddleName(String middleName) {
		MiddleName = middleName;
		return this;
	}
	public String getLastName() {
		return LastName;
	}
	public Person setLastName(String lastName) {
		LastName = lastName;
		return this;
	}
	public String getPhoneNbr() {
		return PhoneNbr;
	}
	public Person setPhoneNbr(String PhoneNbr) throws PersonException {

		this.PhoneNbr = PhoneNbr;
		String regex = "^\\({1}([0-9]{3})\\){1}-{1}([0-9]{3})-{1}([0-9]{4})$";
		boolean b = Pattern.matches(regex, PhoneNbr);
		
		if (!b) {
			throw new PersonException(this, "Phone Nbr Bad");
		} 
		return this;
	}
	
	
}
