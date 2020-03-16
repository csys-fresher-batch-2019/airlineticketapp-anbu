package com.chainsys.dao;

import java.util.ArrayList;

import org.jdbi.v3.sqlobject.statement.SqlUpdate;

import com.chainsys.model.AirlineInfo;
import com.chainsys.model.Passenger;

public interface AirlineInfoDAO {
@SqlUpdate("INSERT INTO AIRLINEINFO(AIRLINEID,AIRLINE_NAME,TOTAL_SEATS,NO_OF_SEATS_AVAILABLE,FROM_TO,JOURNEY_DATE,PRICE)values(:airlineid,:airlinename,:totalseats,:noofseatsavailable,fromto,journeydate,price)")
	public boolean addairlineinfo(AirlineInfo al) throws Exception;
	public boolean deleteairlineinfo(AirlineInfo al1) throws Exception;
    public ArrayList<AirlineInfo> viewairlineinfo()throws Exception;
}
