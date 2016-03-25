package base;

import static org.junit.Assert.*;

import org.junit.Test;

import exc.PersonException;

public class testPerson {

	@Test
	public void TestGoodPerson() throws PersonException
	{
		Person p = new Person();
		p.setFirstName("Bert");
		p.setMiddleName("Randall");
		p.setLastName("Gibbons");
		p.setPhoneNbr("(302)-555-1212");
		
		assertNotNull(p);
		
	}
	
	
	@Test
	public void TestBadPerson() 
	{
		Person p = new Person();
		p.setFirstName("Bert");
		p.setMiddleName("Randall");
		p.setLastName("Gibbons");
		try {
			p.setPhoneNbr("302-555-1212");
		} catch (PersonException e) {
			System.out.println("This phone was bad: " + e.getP().getPhoneNbr());
		}
		
		assertNotNull(p);
		
	}

	@Test(expected=PersonException.class)
	public void TestPersonException() throws PersonException 
	{
		Person p = new Person();
		p.setFirstName("Bert");
		p.setMiddleName("Randall");
		p.setLastName("Gibbons");
			p.setPhoneNbr("302-555-1212");
		
		assertNotNull(p);
		
	}
	
	
	@Test(expected=PersonException.class)
	public void TestBadPersonAndThrow() throws PersonException 
	{
		Person p = new Person();
		p.setFirstName("Bert");
		p.setMiddleName("Randall");
		p.setLastName("Gibbons");
		try {
			p.setPhoneNbr("302-555-1212");
		} 
		
		catch (PersonException e) {
			System.out.println("This phone was bad: " + e.getP().getPhoneNbr());
			//e.printStackTrace();
			System.out.println(e.getMessage());
			throw e;
		}

		
		

		
		assertNotNull(p);
		
	}
	
}
