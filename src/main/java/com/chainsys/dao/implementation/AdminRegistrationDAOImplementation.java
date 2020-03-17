package com.chainsys.dao.implementation;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import com.chainsys.airlines.MyConnectionUtil;
import com.chainsys.dao.AdminRegistrationDAO;
import com.chainsys.exception.DbException;
import com.chainsys.exception.InfoMessages;
import com.chainsys.logger.Logger;
import com.chainsys.model.AdminRegistration;

public class AdminRegistrationDAOImplementation implements AdminRegistrationDAO{
	public boolean saveAdmin(AdminRegistration adreg) throws Exception{
		int rows = 0;
		try(Connection con = MyConnectionUtil.Testconnections();){
	String sql="INSERT INTO ADMINREGISTRATION(NAME,EMAILID,PASSWORD,CONTACT)VALUES(?,?,?,?)";
	try(PreparedStatement pst=con.prepareStatement(sql);){

	pst.setString(1, adreg.getName());
	pst.setString(2, adreg.getEmailid());
	pst.setString(3, adreg.getPassword());
	pst.setLong(4, adreg.getContact());
	Logger logger= Logger.getInstance();
	logger.info(sql);
	rows = pst.executeUpdate();
	logger.info("No of rows inserted:" + rows);
	}}catch( SQLException e) {
		e.printStackTrace();
		throw new DbException(InfoMessages.ADMINREGISTRATION);
	}
	if(rows == 1)
		return true;
	else 
		return false;
	}

	
	
	
	
}
