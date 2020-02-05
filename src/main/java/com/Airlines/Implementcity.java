package com.Airlines;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class Implementcity implements interfaceairport{
public void addairport(airport b) throws Exception{
	
	Connection con = MyConnectionUtil.Testconnections();
	String sql="insert into airport(ap_Name,state,country,cName) values(?,?,?,?)";
	PreparedStatement pst=con.prepareStatement(sql);
	pst.setString(1, b.apName);
	pst.setString(2, b.state);
	pst.setString(3, b.country);
	pst.setString(4, b.cName);

	System.out.println(sql);
	
	int rows = pst.executeUpdate();
	System.out.println("No of rows inserted:" + rows);
	
	
	
}
public void deleteairport(String apName) throws Exception{
	
	Connection con = MyConnectionUtil.Testconnections();
	//Statement stmt=con.createStatement();
	String sql="delete from airport where ap_Name = ?";
	PreparedStatement pst=con.prepareStatement(sql);
	pst.setString(1, apName);
	System.out.println(sql);

	int rows = pst.executeUpdate();
	System.out.println("No of rows deleted:" + rows);
	
	
	
}
public void deleteairport(airport b1) throws Exception {
	// TODO Auto-generated method stub
	
}

	
}
	
	

