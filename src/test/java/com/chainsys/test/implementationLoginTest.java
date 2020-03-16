package com.chainsys.test;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

import com.chainsys.dao.implementation.LoginDAOImplementation;

public class implementationLoginTest {

	@Test  @Ignore
	public void testUserLogin() throws Exception {
		String email = "VIJAY123";
		String pass="VIJAY";
		boolean expected = true;
		boolean actual;
		LoginDAOImplementation log=new LoginDAOImplementation();
		actual = log.userLogin(email, pass);
		assertEquals(expected,actual);
	}

}
