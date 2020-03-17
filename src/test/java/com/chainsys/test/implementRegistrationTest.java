package com.chainsys.test;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

import com.chainsys.dao.implementation.RegistrationDAOImplementation;
import com.chainsys.model.Registration;

public class implementRegistrationTest {

	@Test  @Ignore
	public void testAddRegistration() throws Exception {
boolean expected=true;
boolean actual;
Registration reg=new Registration();
reg.setEmailId("VIJAY123");
reg.setName("VIJAY");
reg.setPassword("VIJAY");
long cont=9788723425l;
reg.setContact(cont);	
RegistrationDAOImplementation obj=new 	RegistrationDAOImplementation();
actual=obj.userRegistration(reg);
assertEquals(expected,actual);
	
	}

}
