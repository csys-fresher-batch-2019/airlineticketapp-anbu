package com.chainsys.dao.implementation;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import com.chainsys.airlines.MyConnectionUtil;
import com.chainsys.dao.PassengerDAO;
import com.chainsys.exception.DbException;
import com.chainsys.exception.InfoMessages;
import com.chainsys.logger.Logger;
import com.chainsys.model.Passenger;
public class PassengerDAOImplementation implements PassengerDAO {
	public boolean savePassenger(Passenger pass) throws Exception{
		int rows=0;
		try(Connection con = MyConnectionUtil.Testconnections();){
String sql="INSERT INTO PASSENGER(FNAME,LNAME,ADDRESS,PHONE,AGE,GENDER,CLASSING,NO_OF_BOOKINGS,AIRLINEID,MAIL_ID) values(?,?,?,?,?,?,?,?,?,?)";
try(PreparedStatement pst=con.prepareStatement(sql);){

pst.setString(1, pass.getFname());
pst.setString(2, pass.getLname());
pst.setString(3, pass.getAddress());
pst.setLong(4,pass.getPhone());
pst.setInt(5, pass.getAge());
pst.setString(6, pass.getGender());
pst.setString(7, pass.getClassing());
pst.setInt(8,pass.getNoofbookings());
pst.setString(9,pass.getAirlineid());
pst.setString(10,pass.getMailid());
Logger logger= Logger.getInstance();
logger.info(sql);
 rows = pst.executeUpdate();
logger.info("No of rows inserted:" + rows);	
}}catch( SQLException e) {
	e.printStackTrace();
	throw new DbException(InfoMessages.ADDPASSENGER);
}
if(rows==1)
	return true;
else
	return false;


}

	public boolean deletePassenger(Passenger pass1) throws Exception{
		int rows=0;
		try(Connection con = MyConnectionUtil.Testconnections();){
String sql="delete from passenger where Phone = ?";
try(PreparedStatement pst = con.prepareStatement(sql);){
pst.setLong(1, pass1.getPhone());
 rows = pst.executeUpdate();
Logger logger= Logger.getInstance();
logger.info(sql);

logger.info("No of rows deleted:" + rows);
}}catch( SQLException e) {
	e.printStackTrace();
	throw new DbException(InfoMessages.DELETEPASSENGER);
}
		
		if(rows==1)
			return true;
		else
			return false;
		
		
	}

	
	
	
	
	
	
	
}
