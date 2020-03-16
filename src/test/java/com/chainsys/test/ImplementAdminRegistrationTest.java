package com.chainsys.test;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

import com.chainsys.dao.implementation.AdminLoginDAOImplementation;
import com.chainsys.dao.implementation.AdminRegistrationDAOImplementation;
import com.chainsys.model.AdminRegistration;

public class ImplementAdminRegistrationTest {

	@Test @Ignore
	public void testadminregistration() throws Exception {
		boolean expected = true;
		boolean actual;
		AdminRegistration obj = new AdminRegistration();
		long contact = 12334556677l;
		obj.setContact(contact);
		obj.setEmailid("anbu123");
		obj.setName("anbu");
		obj.setPassword("12345");
		AdminRegistrationDAOImplementation met = new AdminRegistrationDAOImplementation();
		actual = met.addadminregistration(obj);
		assertEquals(expected,actual);
	}

}
