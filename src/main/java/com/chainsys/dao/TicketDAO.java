package com.chainsys.dao;

import org.jdbi.v3.sqlobject.statement.SqlUpdate;

import com.chainsys.model.Passenger;
import com.chainsys.model.Ticket;

public interface TicketDAO {
	@SqlUpdate("INSERT INTO TICKET(MAIL_ID,AIRLINEID,AIRLINE_NAME,DATE_OF_BOOKING,TRAVEL_DATE,NO_OF_BOOKINGS)values(:mailid,:airlineid,:airlinename,SYSDATE,:traveldate,noofbookings)")
	public boolean saveTicket(Ticket tik) throws Exception;
	public boolean deleteTicket(Ticket tik1) throws Exception;

}
