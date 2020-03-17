package com.chainsys.dao.implementation;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.Period;

import com.chainsys.airlines.MyConnectionUtil;
import com.chainsys.dao.TicketDAO;
import com.chainsys.exception.DbException;
import com.chainsys.exception.InfoMessages;
import com.chainsys.logger.Logger;
import com.chainsys.model.Ticket;

public  class TicketDAOImplementation implements TicketDAO {
	public boolean saveTicket(Ticket tik) throws Exception {
		int rows=0;
		try(Connection con = MyConnectionUtil.Testconnections();){
		String sql = "INSERT INTO TICKET(MAIL_ID,AIRLINEID,AIRLINE_NAME,DATE_OF_BOOKING,TRAVEL_DATE,NO_OF_BOOKINGS)values(?,?,?,SYSDATE,?,?)";
		try(PreparedStatement pst = con.prepareStatement(sql);){

		pst.setString(1, tik.getMailid());
		pst.setString(2, tik.getAirlineid());
		pst.setString(3, tik.getAirlinename());
		java.sql.Date date = java.sql.Date.valueOf(tik.getTraveldate());
		pst.setDate(4, date);
		
		int diff = Period.between(LocalDate.now(), tik.getTraveldate()).getDays();
		Logger logger= Logger.getInstance();
		logger.info(diff);
	
			
		 rows = pst.executeUpdate();
		
		
        String sql5=  "UPDATE AIRLINEINFO SET NO_OF_SEATS_AVAILABLE =( NO_OF_SEATS_AVAILABLE -(SELECT NO_OF_BOOKINGS FROM TICKET WHERE MAIL_ID = '"+tik.getMailid()+"'))WHERE AIRLINEID='"+tik.getAirlineid()+"'";



        

		
		
logger.info(  "\n"+sql5 );
		Statement stmt = con.createStatement();
		
		int e = stmt.executeUpdate(sql5);
		

	logger.info("No of rows inserted:" + rows );}}
		catch( SQLException e) {
			e.printStackTrace();
			throw new DbException(InfoMessages.ADDTICKET);
		}
	
	if(rows==1)
		return true;
	else
		return false;
	}
	
	
	
	
	
	
	
	

	public boolean deleteTicket(Ticket tik1) throws Exception {
		int rows=0;
			try(Connection con = MyConnectionUtil.Testconnections();){
		String sql = "delete from ticket where MAIL_ID=?";
		try(PreparedStatement pst = con.prepareStatement(sql);){

		pst.setString(1, tik1.getMailid());
		pst.setString(2, tik1.getAirlineid());

		PreparedStatement pst1 = con.prepareStatement(sql);
		pst1.setString(1, tik1.getMailid());

		 rows = pst.executeUpdate();
		int row = pst1.executeUpdate();

		
		Logger logger= Logger.getInstance();
	logger.info(rows);
		


		logger.info("No of rows deleted:" + row);
		}}
			catch( SQLException e) {
				e.printStackTrace();
				throw new DbException(InfoMessages.DELETETICKET);
			}
if(rows==1)
	return true;
else
	return false;
	}

}
