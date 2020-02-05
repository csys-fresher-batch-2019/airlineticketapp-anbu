package com.login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class implementationLogin implements interfaceLogin {


public void userLogin() throws Exception {

System.out.println("Enter EMAILID:");
Scanner sc=new Scanner(System.in);
String emailId=sc.next();
System.out.println("Enter Password:");
String password=sc.next();
implementationLogin com=new implementationLogin();
if(com.userLogin(emailId,password)) {
System.out.println(">>>>LOGIN SUCESSFULL<<<<");
//view order details

}
else
{
System.out.println(">>>>LOGIN FAILED<<<<");
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
