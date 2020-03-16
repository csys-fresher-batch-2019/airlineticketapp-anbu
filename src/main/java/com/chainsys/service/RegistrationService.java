package com.chainsys.service;

import com.chainsys.dao.implementation.RegistrationDAOImplementation;
import com.chainsys.model.Registration;

public class RegistrationService {
	RegistrationDAOImplementation obj = new RegistrationDAOImplementation();

	public boolean addRegistration(Registration reg) throws Exception {
		return obj.addRegistration(reg);
	}

}
