package com.passenger;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;

import com.Airlines.MyConnectionUtil;
import com.logger.Logger;
public class implementpassenger implements interfacepassenger {
	public void addpassenger(passenger pass) throws Exception{
		Connection con = MyConnectionUtil.Testconnections();
String sql="INSERT INTO PASSENGER(PASSPORTNO,FNAME,LNAME,ADDRESS,PHONE,AGE,GENDER,CLASSING,NO_OF_BOOKINGS,AIRLINEID) values(?,?,?,?,?,?,?,?,?,?)";
PreparedStatement pst=con.prepareStatement(sql);
//pst.setInt(1,pass.noofbookings);
pst.setString(1, pass.getPassportno());
pst.setString(2, pass.getFname());
pst.setString(3, pass.getLname());
pst.setString(4, pass.getAddress());
pst.setLong(5,pass.getPhone());
pst.setInt(6, pass.getAge());
pst.setString(7, pass.getGender());
pst.setString(8, pass.getClassing());
pst.setInt(9,pass.getNoofbookings());
//pst.setString(10, pass.mailid);
pst.setString(10,pass.getAirlineid());
Logger logger= Logger.getInstance();
logger.info(sql);
int rows = pst.executeUpdate();
logger.info("No of rows inserted:" + rows);	
}

	public void deletepassenger(passenger pass1) throws Exception{
		Connection con = MyConnectionUtil.Testconnections();
String sql="delete from passenger where passportno = ?";
PreparedStatement pst = con.prepareStatement(sql);
pst.setString(1, pass1.getPassportno());
int rows = pst.executeUpdate();
Logger logger= Logger.getInstance();
logger.info(sql);

logger.info("No of rows deleted:" + rows);

		
		
		
	}

	
	
	
	
	
	
	
}
