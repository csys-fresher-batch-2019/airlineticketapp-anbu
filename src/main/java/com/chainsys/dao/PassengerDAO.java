package com.chainsys.dao;

import org.jdbi.v3.sqlobject.statement.SqlUpdate;

import com.chainsys.model.Passenger;

public interface PassengerDAO {

@SqlUpdate("INSERT INTO PASSENGER(FNAME,LNAME,ADDRESS,PHONE,AGE,GENDER,CLASSING,NO_OF_BOOKINGS,AIRLINEID) values(:passportno,:fname,:lname,:address,:phone,:age,:gender,:classing,:noofbookings,:airlineid)")
	public boolean addpassenger(Passenger pass) throws Exception;
	public boolean deletepassenger(Passenger pass1) throws Exception;
	
}
