package com.chainsys.dao.implementation;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.chainsys.airlines.MyConnectionUtil;
import com.chainsys.dao.AdminDAO;
import com.chainsys.exception.DbException;
import com.chainsys.exception.InfoMessages;
public class AdminLoginDAOImplementation implements AdminDAO {
	
	

	
	public boolean adminlogin(String emailid,String password) throws Exception {
		// TODO Auto-generated method stub
		try(Connection con = MyConnectionUtil.Testconnections();){
		String sql="select emailid,password from adminregistration where emailid=? and password=?";
		try(PreparedStatement pst=con.prepareStatement(sql);){
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
		}}catch( SQLException e) {
			e.printStackTrace();
			throw new DbException(InfoMessages.GETAIRLINEINFO);
		}
		return false;
		
	}

	public int adminLogin(String email,String password) throws Exception {
		AdminLoginDAOImplementation com=new AdminLoginDAOImplementation();
		try(Connection con =  MyConnectionUtil.Testconnections();){
		String sql = "select emailid,password from adminregistration where emailid=?";
		try(PreparedStatement ps = con.prepareStatement(sql);){
		ps.setString(1, email);
		ResultSet rs = ps.executeQuery();
		if(rs.next()) {
			if(rs.getString("password").equals(password))
				return 1;
			else
				return 0;
		}
		else
			return 0;
		}}catch( SQLException e) {
			e.printStackTrace();
			throw new DbException(InfoMessages.INVALIDLOGIN);
		}
}
	
}
	
	
