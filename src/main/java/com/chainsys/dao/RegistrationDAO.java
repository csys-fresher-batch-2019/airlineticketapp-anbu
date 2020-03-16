package com.chainsys.dao;

import org.jdbi.v3.sqlobject.statement.SqlUpdate;

import com.chainsys.model.Registration;
import com.chainsys.model.AirlineInfo;

public interface RegistrationDAO {
	@SqlUpdate("INSERT INTO REGISTRATION(NAME,EMAILID,PASSWORD,CONTACT)values(:name,:emailId,:password,:contact)")
	public boolean addRegistration(Registration reg) throws Exception;
}
