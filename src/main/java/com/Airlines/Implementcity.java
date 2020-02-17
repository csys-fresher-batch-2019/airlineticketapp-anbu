package com.Airlines;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;

import com.logger.Logger;

public class Implementcity implements interfaceairport{
public void addairport(airport b) throws Exception{
	
	Connection con = MyConnectionUtil.Testconnections();
	String sql="insert into airport(ap_Name,state,country,cName) values(?,?,?,?)";
	PreparedStatement pst=con.prepareStatement(sql);
	pst.setString(1, b.getApName());
	pst.setString(2, b.getState());
	pst.setString(3, b.getCountry());
	pst.setString(4, b.getcName());
	Logger logger= Logger.getInstance();
logger.info(sql);
	
	int rows = pst.executeUpdate();
	logger.info("No of rows inserted:" + rows);
	
	
	
}
public void deleteairport(String apName) throws Exception{
	
	Connection con = MyConnectionUtil.Testconnections();
	//Statement stmt=con.createStatement();
	String sql="delete from airport where ap_Name = ?";
	PreparedStatement pst=con.prepareStatement(sql);
	pst.setString(1, apName);
	Logger logger= Logger.getInstance();
logger.info(sql);

	int rows = pst.executeUpdate();

	logger.info("No of rows deleted:" + rows);
	
	
	
}
public void deleteairport(airport b1) throws Exception {
	// TODO Auto-generated method stub
	
}

	
}
	
	

