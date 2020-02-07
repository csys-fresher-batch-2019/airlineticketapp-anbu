package com.passenger;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;

import com.Airlines.MyConnectionUtil;
public class implementpassenger implements interfacepassenger {
	public void addpassenger(passenger pass) throws Exception{
		Connection con = MyConnectionUtil.Testconnections();
String sql="INSERT INTO PASSENGER(PASSPORTNO,FNAME,LNAME,ADDRESS,PHONE,AGE,GENDER,CLASSING,NO_OF_BOOKINGS,MAIL_ID,AIRLINEID) values(?,?,?,?,?,?,?,?,?,?,?)";
PreparedStatement pst=con.prepareStatement(sql);
//pst.setInt(1,pass.noofbookings);
pst.setString(1, pass.passportno);
pst.setString(2, pass.fname);
pst.setString(3, pass.lname);
pst.setString(4, pass.address);
pst.setLong(5,pass.phone);
pst.setInt(6, pass.age);
pst.setString(7, pass.gender);
pst.setString(8, pass.classing);
pst.setInt(9,pass.noofbookings);
pst.setString(10, pass.mailid);
pst.setString(11,pass.airlineid);
System.out.println(sql);
int rows = pst.executeUpdate();
System.out.println("No of rows inserted:" + rows);	
}

	public void deletepassenger(passenger pass1) throws Exception{
		Connection con = MyConnectionUtil.Testconnections();
String sql="delete from passenger where passportno = ?";
PreparedStatement pst = con.prepareStatement(sql);
pst.setString(1, pass1.passportno);
int rows = pst.executeUpdate();
System.out.println(sql);

System.out.println("No of rows deleted:" + rows);

		
		
		
	}

	
	
	
	
	
	
	
}
