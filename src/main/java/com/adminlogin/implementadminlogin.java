package com.adminlogin;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

import com.AIRLINEINFO.airlineinfo;
import com.AIRLINEINFO.implementairlineinfo;
import com.login.implementationLogin;
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

	public void admin() throws Exception {
		// TODO Auto-generated method stub
		implementadminlogin com=new implementadminlogin();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter emailId:");
		String emailid=sc.next();
		System.out.println("Enter password:");
		String password=sc.next();
		if(com.adminlogin (emailid,password)) {
//			implementadminlogin alog= new implementadminlogin();

				System.out.println(">>>>LOGIN SUCESSFULL<<<<");
		
		}
		
	
	else if(emailid.equals(emailid))
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
	}
}
	
}
	
	
