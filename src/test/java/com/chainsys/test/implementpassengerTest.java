package com.chainsys.test;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

import com.chainsys.dao.implementation.PassengerDAOImplementation;
import com.chainsys.model.Passenger;

public class implementpassengerTest {

	@Test  @Ignore
	public void testAddpassenger() throws Exception {
		boolean expected=true;
		boolean actual;
		Passenger pass=new Passenger();
		pass.setFname("RAJ");
		pass.setLname("KUMAR");
		pass.setGender("M");
		pass.setAddress("ujuj");
		pass.setAge(21);
		pass.setAirlineid("RED2356");
		pass.setClassing("BUSINESS");
		pass.setMailid("ANBU123");
		pass.setNoofbookings(1);
		long ph=9876543234l;
		pass.setPhone(ph);
		PassengerDAOImplementation passen=new PassengerDAOImplementation();
		actual=passen.savePassenger(pass);
		assertEquals(expected,actual);
	}

	@Test  @Ignore
	public void testDeletepassenger() throws Exception {
boolean expected=true;
boolean actual;
Passenger pass=new Passenger();
long contact=9876543234l;
pass.setPhone(contact);
PassengerDAOImplementation passen1=new PassengerDAOImplementation();
actual=passen1.deletePassenger(pass);
assertEquals(expected,actual);
}

}
