package com.adminregistration;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import com.Airlines.MyConnectionUtil;

public class implementadminregistration implements interfaceadminregistration{
	public void addadminregistration(adminregistration adreg) throws Exception{
		Connection con = MyConnectionUtil.Testconnections();
	String sql="INSERT INTO ADMINREGISTRATION(NAME,EMAILID,PASSWORD,CONTACT)VALUES(?,?,?,?)";
	PreparedStatement pst=con.prepareStatement(sql);

	pst.setString(1, adreg.name);
	pst.setString(2, adreg.emailid);
	pst.setString(3, adreg.password);
	pst.setLong(4, adreg.contact);
		
	System.out.println(sql);
	int rows = pst.executeUpdate();
	System.out.println("No of rows inserted:" + rows);
	}

	
	
	
	
}
