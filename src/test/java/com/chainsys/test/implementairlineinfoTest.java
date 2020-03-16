package com.chainsys.test;

import static org.junit.Assert.*;

import java.time.LocalDate;
import java.util.ArrayList;

import org.junit.Ignore;
import org.junit.Test;

import com.chainsys.dao.implementation.AirlineInfoDAOImplementation;
import com.chainsys.model.AirlineInfo;

public class implementairlineinfoTest {

	@Test @Ignore
	public void testAddairlineinfo() throws Exception {
		boolean expected = true;
		boolean actual;
		AirlineInfo info=new AirlineInfo();
		info.setAirlineId("AIMSS");
		info.setAirlineName("INDOAIR");
		info.setFromTo("BLR-DEL");
		info.setNoofseatsavailable(300);
		info.setTotalSeats(300);
		info.setPrice(2500);
		String date = "2020-11-11";
		LocalDate jrdate=LocalDate.parse(date);
		info.setJourneyDate(jrdate);
		AirlineInfoDAOImplementation airinfo=new AirlineInfoDAOImplementation();
		actual = airinfo.addairlineinfo(info);
		assertEquals(expected,actual);
		
	}

	@Test @Ignore
	public void testDeleteairlineinfo() throws Exception {
		boolean expected = true;
		boolean actual;
		AirlineInfo info=new AirlineInfo();
		info.setAirlineId("AIMSS");
		AirlineInfoDAOImplementation airinfo=new AirlineInfoDAOImplementation();
		actual = airinfo.deleteairlineinfo(info);
		assertEquals(expected,actual);
	}

	@Test  @Ignore
	public void testViewairlineinfo() throws Exception {
		ArrayList<AirlineInfo> expected= new ArrayList<AirlineInfo>();	
		ArrayList<AirlineInfo> actual= new ArrayList<AirlineInfo>();	
        AirlineInfo list=new AirlineInfo();
        list.setAirlineId("AA");
        list.setAirlineName("AIRINDIA");
        list.setFromTo("CHENNAI-BANGLORE");
        list.setNoofseatsavailable(300);
        list.setTotalSeats(300);
        list.setPrice(3000);
        String date1="2020-02-24";
        LocalDate jrdate=LocalDate.parse(date1);
		list.setJourneyDate(jrdate);
		expected.add(list);
		AirlineInfoDAOImplementation airinfo=new AirlineInfoDAOImplementation();
		actual = airinfo.viewairlineinfo();
		assertEquals(expected,actual);
	}

}
