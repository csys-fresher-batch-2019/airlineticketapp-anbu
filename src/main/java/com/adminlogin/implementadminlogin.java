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
		String sql="select emailid,password from adminregistration where emailid=? and password=?";
		PreparedStatement pst=con.prepareStatement(sql);
		pst.setString(1, emailid);
		pst.setString(2, password);
		ResultSet rs=pst.executeQuery();
		
		
		if(rs.next()) {
			String email=rs.getString("emailid");
			String pwd=rs.getString("password");
			System.out.println(email);
			System.out.println(pwd);
			if(email.equals(emailid)&&pwd.equals(password)) {
				System.out.println("true");
				return true;
			}else {
				System.out.println("HI");
				return false;
			}
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
	
	
