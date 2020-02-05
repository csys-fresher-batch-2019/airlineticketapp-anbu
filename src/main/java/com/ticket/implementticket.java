package com.ticket;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.Period;

import com.Airlines.MyConnectionUtil;

public  class implementticket implements interfaceticket {
	public void addticket(ticket tik) throws Exception {
		Connection con = MyConnectionUtil.Testconnections();
		String sql = "INSERT INTO TICKET(MAIL_ID,AIRLINEID,AIRLINE_NAME,DATE_OF_BOOKING,TRAVEL_DATE,NO_OF_BOOKINGS)values(?,?,?,SYSDATE,?,?)";
		PreparedStatement pst = con.prepareStatement(sql);

		pst.setString(1, tik.mailid);
		pst.setString(2, tik.airlineid);
		pst.setString(3, tik.airlinename);
		java.sql.Date date = java.sql.Date.valueOf(tik.traveldate);
		pst.setDate(4, date);
		
		int diff = Period.between(LocalDate.now(), tik.traveldate).getDays();
		System.out.println(diff);
		if (diff > 20) {
			ticket.discountforprebookings = 1000;
		}
		
		pst.setInt(5, tik.noofbookings);
		int noofbookings= tik.noofbookings;
		if (noofbookings > 3) {
			ticket.discountfornoofbookings = 1000;
		}
	
			
		int rows = pst.executeUpdate();
		
		String sql1 = "UPDATE TICKET SET DISCOUNT_FOR_NO_OF_BOOKINGS = 1000 WHERE NO_OF_BOOKINGS > 3";
		String sql2 = "UPDATE TICKET SET DISCOUNT_FOR_PREBOOKINGS = 1000 WHERE  TRAVEL_DATE-DATE_OF_BOOKING > 20";
		String sql3=  "UPDATE TICKET SET ORIGINAL_PRICE  = (b=a.nextInt() FROM PASSENGER *( SELECT PRICE FROM AIRLINEINFO WHERE AIRLINEID = '"+tik.airlineid+"' ))WHERE AIRLINEID='"+tik.airlineid+"'";

		//String sql4 = "UPDATE TICKET SET DISC_PRICE  = ORIGINAL_PRICE - (DISCOUNT_FOR_PREBOOKINGS + DISCOUNT_FOR_NO_OF_BOOKINGS)";
        //String sql5=  "UPDATE AIRLINEINFO SET NO_OF_SEATS_AVAILABLE = NO_OF_SEATS_AVAILABLE -(SELECT NO_OF_BOOKINGS FROM PASSENGER WHERE mail_id='"+tik.mailid+"')";



        

		
		
		//System.out.println(""+sql1 + "\n"+sql2 + "\n"+sql3 + "\n"+sql4 + "\n"+sql5 );//String sql4 = "UPDATE TICKET SET DISC_PRICE =ORIGINAL_PRICE - (DISCOUNT_FOR_PREBOOKINGS + DISCOUNT_FOR_NO_OF_BOOKINGS)";
		Statement stmt = con.createStatement();
		int a = stmt.executeUpdate(sql1);
		int b = stmt.executeUpdate(sql2);
		int c = stmt.executeUpdate(sql3);
	    //int d = stmt.executeUpdate(sql4);
		//int e = stmt.executeUpdate(sql5);
		

		//System.out.println("No of rows inserted:" + rows + " " + a + " " + b + " " + c  + " " + d + " " + e  );
		System.out.println("No of rows inserted:" + rows );
	}

	public void deleteticket(ticket tik1) throws Exception {
		Connection con = MyConnectionUtil.Testconnections();
		String sql = "delete from ticket where passportno = ? and airlineid=?";
		PreparedStatement pst = con.prepareStatement(sql);
		pst.setString(1, tik1.passportno);
		pst.setString(2, tik1.airlineid);
		int rows = pst.executeUpdate();
		Statement stmt = con.createStatement();
        String sql8=  "UPDATE AIRLINEINFO SET NO_OF_SEATS_AVAILABLE = NO_OF_SEATS_AVAILABLE +(SELECT NO_OF_BOOKINGS FROM TICKET WHERE AIRLINEID='"+tik1.airlineid+"' and passportno='"+tik1.passportno+"')WHERE AIRLINEID='"+tik1.airlineid+"'";
        int n=stmt.executeUpdate(sql8);
		System.out.println(""+n);



		System.out.println("No of rows deleted:" + rows);

	}

}
