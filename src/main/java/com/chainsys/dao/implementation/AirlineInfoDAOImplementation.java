package com.chainsys.dao.implementation;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;

import com.chainsys.airlines.MyConnectionUtil;
import com.chainsys.dao.AirlineInfoDAO;
import com.chainsys.exception.DbException;
import com.chainsys.exception.InfoMessages;
import com.chainsys.logger.Logger;
import com.chainsys.model.AirlineInfo;
import com.chainsys.model.Passenger;
public class AirlineInfoDAOImplementation implements AirlineInfoDAO {
	public boolean saveAirline(AirlineInfo al) throws Exception
	{
		int rows=0;
		try(Connection con = MyConnectionUtil.Testconnections();){
String sql="INSERT INTO AIRLINEINFO(AIRLINEID,AIRLINE_NAME,TOTAL_SEATS,NO_OF_SEATS_AVAILABLE,FROM_TO,JOURNEY_DATE,PRICE)values(?,?,?,?,?,?,?)";
try(PreparedStatement pst=con.prepareStatement(sql);){
pst.setString(1, al.getAirlineid());
pst.setString(2, al.getAirlineName());
pst.setInt(3, al.getTotalSeats());
pst.setInt(4,al.getNoOfSeatsAvailable());
pst.setString(5, al.getFromTo());
pst.setDate(6,Date.valueOf(al.getJourneydate()));
pst.setInt(7, al.getPrice());
Logger logger= Logger.getInstance();
logger.info(sql);
 rows = pst.executeUpdate();
logger.info("No of rows inserted:" + rows);
}}catch( SQLException e) {
	e.printStackTrace();
	throw new DbException(InfoMessages.ADDAIRLINE);
}
if(rows == 1)
		return true;
else 
	return false;
	}		
	
	
	
	
public boolean deleteAirline(AirlineInfo al1) throws Exception{
	int rows=0;
	try(Connection con = MyConnectionUtil.Testconnections();){
String sql="delete from airlineinfo where airlineid = ?";
try(PreparedStatement pst = con.prepareStatement(sql);){
pst.setString(1, al1.getAirlineid());
 rows = pst.executeUpdate();
Logger logger= Logger.getInstance();
logger.info(sql);

logger.info("No of rows deleted:" + rows);
}}
	catch( SQLException e) {
		e.printStackTrace();
		throw new DbException(InfoMessages.DELETEAIRLINE);
	}
	
if(rows==1)
	return true;
else
	return false;
	}
		
public ArrayList<AirlineInfo> getAirline()throws Exception{
ArrayList<AirlineInfo> flights = new ArrayList<AirlineInfo>();	
Connection con = MyConnectionUtil.Testconnections();
String sql1="SELECT *FROM AIRLINEINFO";
PreparedStatement pst = con.prepareStatement(sql1);
ResultSet rows = pst.executeQuery();
	while(rows.next()) {
		AirlineInfo a=new AirlineInfo();
		
		a.setAirlineId(rows.getString("AIRLINEID"));
	a.setAirlineName(rows.getString("AIRLINE_NAME"));
    a.setTotalSeats(rows.getInt("TOTAL_SEATS"));
    a.setNoofseatsavailable(rows.getInt("NO_OF_SEATS_AVAILABLE"));
    a.setFromTo(rows.getString("FROM_TO"));
    a.setJourneyDate(rows.getDate("JOURNEY_DATE").toLocalDate());
    a.setPrice(rows.getInt("PRICE"));
    flights.add(a);
	}
	return flights;
	


}

}
