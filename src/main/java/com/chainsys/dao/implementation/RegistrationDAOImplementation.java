package com.chainsys.dao.implementation;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import com.chainsys.airlines.MyConnectionUtil;
import com.chainsys.dao.RegistrationDAO;
import com.chainsys.exception.DbException;
import com.chainsys.exception.InfoMessages;
import com.chainsys.logger.Logger;
import com.chainsys.model.Registration;
public class RegistrationDAOImplementation implements RegistrationDAO {
	public boolean addRegistration(Registration pr) throws Exception{
		int rows=0;
		try(Connection con = MyConnectionUtil.Testconnections();){
		String sql="INSERT INTO REGISTRATION(NAME,EMAILID,PASSWORD,CONTACT)values(?,?,?,?)";
		try(PreparedStatement pst=con.prepareStatement(sql);){
		pst.setString(1, pr.getName());
		pst.setString(2, pr.getEmailId());
		pst.setString(3, pr.getPassword());
		pst.setLong  (4, pr.getContact());
		Logger logger= Logger.getInstance();
	logger.info(sql);
		
		 rows = pst.executeUpdate();
logger.info("No of rows inserted:" + rows);		}}catch( SQLException e) {
	e.printStackTrace();
	throw new DbException(InfoMessages.PASSENGERREGISTRATION);
}
		
		if(rows==1)
			return true;
		else
			return false;
		
		
		
		
	}

	
}
