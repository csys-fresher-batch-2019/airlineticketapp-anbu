package com.Registration;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;

import com.Airlines.MyConnectionUtil;
import com.logger.Logger;
public class implementRegistration implements interfaceRegistration {
	public void addRegistration(Registration pr) throws Exception{
		Connection con = MyConnectionUtil.Testconnections();
		String sql="INSERT INTO REGISTRATION(NAME,EMAILID,PASSWORD,CONTACT)values(?,?,?,?)";
		PreparedStatement pst=con.prepareStatement(sql);
		pst.setString(1, pr.getName());
		pst.setString(2, pr.getEmailId());
		pst.setString(3, pr.getPassword());
		pst.setLong  (4, pr.getContact());
		Logger logger= Logger.getInstance();
	logger.info(sql);
		int rows = pst.executeUpdate();
logger.info("No of rows inserted:" + rows);		
		
		
		
		
		
		
	}

	
}
