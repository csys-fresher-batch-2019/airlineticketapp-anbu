package com.chainsys.dao;

import java.util.ArrayList;

import org.jdbi.v3.sqlobject.statement.SqlUpdate;

import com.chainsys.model.AirlineInfo;
import com.chainsys.model.Passenger;

public interface AirlineInfoDAO {
@SqlUpdate("INSERT INTO AIRLINEINFO(AIRLINEID,AIRLINE_NAME,TOTAL_SEATS,NO_OF_SEATS_AVAILABLE,FROM_TO,JOURNEY_DATE,PRICE)values(:airlineid,:airlinename,:totalseats,:noofseatsavailable,fromto,journeydate,price)")
	public boolean saveAirline(AirlineInfo al) throws Exception;
	public boolean deleteAirline(AirlineInfo al1) throws Exception;
    public ArrayList<AirlineInfo> getAirline()throws Exception;
}
