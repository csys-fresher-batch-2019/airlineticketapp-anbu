package com.adminlogin;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import com.Airlines.MyConnectionUtil;
public class implementadminlogin implements interfaceadminlogin {
	
	

	
	public boolean adminlogin(String emailid,String password) throws Exception {
		// TODO Auto-generated method stub
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "oracle");
		Statement stmt = con.createStatement();
		if (stmt.executeUpdate("select emailid from adminregistration where emailid='"  + emailid + "'") != 0)
		{
		ResultSet rs = stmt.executeQuery("select password from adminregistration where password='" + password + "'");
		rs.next();
	
		if (password.equals(rs.getString("password")))
		{
		return true;
		}

		return false;
		}
	
		return false;
	}

	public int admin(String email,String password) throws Exception {
		// TODO Auto-generated method stub
		implementadminlogin com=new implementadminlogin();
		/*Scanner sc=new Scanner(System.in);
		System.out.println("Enter emailId:");
		String emailid=sc.next();
		System.out.println("Enter password:");
		String password=sc.next();*/
		Connection con =  MyConnectionUtil.Testconnections();
		String sql = "select emailid,password from adminregistration where emailid=?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, email);
		ResultSet rs=null;
		rs = ps.executeQuery();
		if(rs.next()) {
//			implementadminlogin alog= new implementadminlogin();
			if(rs.getString("password").equals(password))
				return 1;
			else
				return 0;
		}
		else
			return 0;
		
	
/*	else if(email.equals(email))
	{
		System.out.println(">>>>>invalid emailid<<<<<");
	}
	else if(password.equals(password))
	{
	System.out.println(">>>>invalid password<<<<");
		
	}
	else
	{
		System.out.println("login failed");
	}*/
}
	
}
	
	
