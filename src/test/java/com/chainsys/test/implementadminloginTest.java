package com.chainsys.test;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

import com.chainsys.dao.implementation.AdminLoginDAOImplementation;

public class implementadminloginTest {

	@Test @Ignore
	public void testAdminLogin() throws Exception {
		String email = "ANBUU123";
		String pass="123";
		boolean expected = true;
		boolean actual;
		AdminLoginDAOImplementation met = new AdminLoginDAOImplementation();
		actual = met.adminlogin(email, pass);
		assertEquals(expected,actual);
	}

}
