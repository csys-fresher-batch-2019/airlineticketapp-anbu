package com.chainsys.test;

import static org.junit.Assert.*;

import java.time.LocalDate;

import org.junit.Ignore;
import org.junit.Test;

import com.chainsys.dao.implementation.TicketDAOImplementation;
import com.chainsys.model.Ticket;

public class implementticketTest {

	@Test  @Ignore
	public void testAddticket() throws Exception {
		boolean expected=true;
		boolean actual;
		Ticket tik=new Ticket();
		tik.setAirlineid("AA");
		tik.setAirlinename("MIR AIRLINES");
		tik.setMailid("ANBU1234");
		tik.setNoofbookings(1);
		String date = "2020-11-11";
		LocalDate trvldate=LocalDate.parse(date);
		tik.setTraveldate(trvldate);
		TicketDAOImplementation ticket=new TicketDAOImplementation();
		actual=ticket.saveTicket(tik);
		assertEquals(expected,actual);
		
	}

	@Test @Ignore
	public void testDeleteticket() throws Exception {
		boolean expected=true;
		boolean actual;
		Ticket tick1=new Ticket();
		tick1.setMailid("ANBU1234");
		tick1.setAirlineid("AA");
		TicketDAOImplementation ticket1=new TicketDAOImplementation();
		actual=ticket1.deleteTicket(tick1);
		assertEquals(expected,actual);
	}

}
