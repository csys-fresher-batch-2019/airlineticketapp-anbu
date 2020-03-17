package com.chainsys.dao;

import org.jdbi.v3.sqlobject.statement.SqlUpdate;

import com.chainsys.model.Registration;
import com.chainsys.model.AdminRegistration;

public interface AdminRegistrationDAO {
	@SqlUpdate("INSERT INTO ADMINREGISTRATION(NAME,EMAILID,PASSWORD,CONTACT)VALUES(:name,:emailid,:password,:contact)")
	public boolean saveAdmin(AdminRegistration adreg) throws Exception;
}
