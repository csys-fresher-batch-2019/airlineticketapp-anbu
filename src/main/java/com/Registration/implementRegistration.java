package com.Registration;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;

import com.Airlines.MyConnectionUtil;
public class implementRegistration implements interfaceRegistration {
	public void addRegistration(Registration pr) throws Exception{
		Connection con = MyConnectionUtil.Testconnections();
		String sql="INSERT INTO REGISTRATION(NAME,EMAILID,PASSWORD,CONTACT)values(?,?,?,?)";
		PreparedStatement pst=con.prepareStatement(sql);
		pst.setString(1, pr.name);
		pst.setString(2, pr.emailId);
		pst.setString(3, pr.password);
		pst.setLong(4, pr.contact);

		System.out.println(sql);
		int rows = pst.executeUpdate();
		System.out.println("No of rows inserted:" + rows);		
		
		
		
		
		
		
	}

}
