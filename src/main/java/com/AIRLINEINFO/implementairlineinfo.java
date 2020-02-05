package com.AIRLINEINFO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;

import com.Airlines.MyConnectionUtil;
import com.passenger.passenger;
public class implementairlineinfo implements interfaceairlineinfo {
	public void addairlineinfo(airlineinfo al) throws Exception
	{
		Connection con = MyConnectionUtil.Testconnections();
String sql="INSERT INTO AIRLINEINFO(AIRLINEID,AIRLINE_NAME,TOTAL_SEATS,NO_OF_SEATS_AVAILABLE,FROM_TO,JOURNEY_DATE,PRICE)values(?,?,?,?,?,?,?)";
PreparedStatement pst=con.prepareStatement(sql);
pst.setString(1, al.airlineid);
pst.setString(2, al.airlinename);
pst.setInt(3, al.totalseats);
pst.setInt(4,al.noofseatsavailable);
pst.setString(5, al.fromto);
java.sql.Date journeydate= java.sql.Date.valueOf(al.journeydate);
pst.setDate(6,journeydate);
pst.setInt(7, al.price);
System.out.println(sql);
int rows = pst.executeUpdate();
System.out.println("No of rows inserted:" + rows);

/*String sql1="\r\n" +
        "UPDATE AIRLINEINFO\r\n" + 
		"SET NO_OF_SEATS_AVAILABLE=TOTAL_SEATS-(SELECT NO_OF_BOOKINGS FROM TICKET WHERE AIRLINEID='AA') \r\n"  + 
        "WHERE AIRLINEID='AA'";
String sql2="\r\n" + 
		"UPDATE AIRLINEINFO\r\n" + 
		"SET NO_OF_SEATS_AVAILABLE=TOTAL_SEATS-(SELECT NO_OF_BOOKINGS FROM TICKETS WHERE AIRLINEID='AI') \r\n" + 
		"WHERE AIRLINEID= 'AI'";
System.out.println(""+sql1 + "\n"+sql2);
Statement stmt = con.createStatement();
int a = stmt.executeUpdate(sql2);
int b = stmt.executeUpdate(sql1);


System.out.println("No of rows inserted:" + rows + " " + a + " " + b);*/	
		
	}		
public void deleteairlineinfo(airlineinfo al1) throws Exception{
	Connection con = MyConnectionUtil.Testconnections();
String sql="delete from airlineinfo where airlineid = ?";
PreparedStatement pst = con.prepareStatement(sql);
pst.setString(1, al1.airlineid);
int rows = pst.executeUpdate();
System.out.println(sql);

System.out.println("No of rows deleted:" + rows);
	}
		
}
