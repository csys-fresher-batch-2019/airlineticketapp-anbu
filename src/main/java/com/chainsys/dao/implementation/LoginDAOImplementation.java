package com.chainsys.dao.implementation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.chainsys.airlines.MyConnectionUtil;
import com.chainsys.dao.LoginDAO;
import com.chainsys.exception.DbException;
import com.chainsys.exception.InfoMessages;
import com.chainsys.logger.Logger;
import com.chainsys.model.Passenger;

public class LoginDAOImplementation implements LoginDAO {
	PassengerDAOImplementation ps=new PassengerDAOImplementation();



public boolean userLogin(String emailId, String password) throws Exception
{
	try(Connection con = MyConnectionUtil.Testconnections();){
Statement stmt = con.createStatement();
stmt.executeUpdate("select emailid from registration where emailid='"  + emailId + "'");
ResultSet rs = stmt.executeQuery("select password from registration where password='" + password + "'");
if(rs.next());
{
if (password.equals(rs.getString("password")))
return true;
else
return false;
}
	}catch( SQLException e) {
		e.printStackTrace();
		throw new DbException(InfoMessages.INVALIDLOGIN);
	}

}
}
