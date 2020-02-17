package com.login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

import com.logger.Logger;
import com.passenger.implementpassenger;
import com.passenger.passenger;

public class implementationLogin implements interfaceLogin {
	implementpassenger ps=new implementpassenger();


public void userLogin() throws Exception {
	Logger logger= Logger.getInstance();
logger.info("Enter EMAILID:");
Scanner sc=new Scanner(System.in);
String emailId=sc.next();
logger.info("Enter Password:");
String password=sc.next();
implementationLogin com=new implementationLogin();
if(com.userLogin(emailId,password)) {
logger.info(">>>>LOGIN SUCESSFULL<<<<");
System.out.println();

logger.info(">*>*>BOOK YOUR TICKETS<*<*<");


}
else
{
logger.info(">>>>LOGIN FAILED<<<<");
}

}
public boolean userLogin(String emailId, String password) throws Exception
{
Class.forName("oracle.jdbc.driver.OracleDriver");
Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "oracle");
Statement stmt = con.createStatement();
if (stmt.executeUpdate("select emailid from registration where emailid='"  + emailId + "'") != 0)
{
ResultSet rs = stmt.executeQuery("select password from registration where password='" + password + "'");
rs.next();
if (password.equals(rs.getString("password")))
{
return true;
}

return false;
}
return false;
}
}
