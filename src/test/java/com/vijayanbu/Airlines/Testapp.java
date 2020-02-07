package com.vijayanbu.Airlines;

import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

import com.AIRLINEINFO.airlineinfo;
import com.AIRLINEINFO.implementairlineinfo;
import com.Airlines.Implementcity;
import com.Airlines.airport;
import com.Registration.Registration;
import com.Registration.implementRegistration;
import com.adminlogin.adminlogin;
import com.adminlogin.implementadminlogin;
import com.adminlogin.interfaceadminlogin;
import com.adminregistration.adminregistration;
import com.adminregistration.implementadminregistration;
import com.login.Login;
import com.login.implementationLogin;
import com.login.interfaceLogin;
//import com.airlines1.airlinename;
import com.passenger.implementpassenger;
import com.passenger.passenger;
import com.ticket.implementticket;
import com.ticket.ticket;
//import com.airlines1.Implementairlinename;
//import com.airlines1.airlinename;
public class Testapp {
public static int c;
public static int b;
	
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Scanner a = new Scanner(System.in);
	
		Implementcity ar=new Implementcity();
		
		implementairlineinfo air=new implementairlineinfo();
		
		implementpassenger ps=new implementpassenger();
		
		implementticket tk=new implementticket();
		
		implementationLogin lg=new implementationLogin();
		
		implementRegistration r=new implementRegistration();
		
		implementadminregistration areg=new implementadminregistration();
		
		implementadminlogin alog= new implementadminlogin();
		System.out.println("Enter the choice \n 1.ADMINLOGIN  2.PASSENGER REGISTRATION 3.ADD AIRPORT 4.DELETE AIRPORT 5.ADD PASSENGER 6.DELETE PASSENGER 7.ADD_TICKET 8.DELETE_TICKET");
		int choice = a.nextInt();
switch(choice) 
{
		case 1:
			implementadminlogin com1=new implementadminlogin();
			System.out.println("Enter Email");
			String email = a.next();
			System.out.println("Enter password");
			String password = a.next();
			implementadminlogin met = new implementadminlogin();
			int returned = 0;
			returned = met.admin(email, password);
			System.out.println(returned);
			
	   if(returned!=0) {
					//view order details
					System.out.println("LOG-IN SUCCESSFUL");
					implementairlineinfo arl=new implementairlineinfo();
					airlineinfo arl1=new airlineinfo();
					System.out.println("ENTER 1 TO ADD_AIRLINES");
					System.out.println("ENTER 2 TO DELETE_AIRLINES");

					int num=a.nextInt();
					if(num==1)
					{
					System.out.println("Enter No.of.Airlines to be added:");
				
					int c=a.nextInt();
					while(c>0)
					{
					
					
					System.out.println("Enter airlineid");
					arl1.airlineid=a.next();
					
					System.out.println("Enter airlinename");
					arl1.airlinename=a.next();
					
					System.out.println("Enter totalseats");
					arl1.totalseats=a.nextInt();
					
					System.out.println("Enter availableseats");
					arl1.noofseatsavailable=a.nextInt();
					
					System.out.println("Enter from-to");
					arl1.fromto=a.next();
					
					System.out.println("departure date");
					arl1.journeydate = a.next();
					
					System.out.println("Cost per person");
			        arl1.price=a.nextInt();
			        
			         arl.addairlineinfo(arl1);
			         
			         c--;
					}
					break;
					}
					else if (num==2) {
					implementairlineinfo ar3=new implementairlineinfo();

					airlineinfo ar2=new airlineinfo();
					System.out.println("Enter the airlineid :");
					ar2.airlineid=a.next();
					ar3.deleteairlineinfo(ar2);


					break;
					}
	   }
	   else  {
		   System.out.println("invalid login");
		   break;
		   }

					//Scanner a=new Scanner(System.in);
				//	adminlogin air=new adminlogin();
				//	alog.adminlogin();

					//int num=a.nextInt();
					
					//switch(num)
					//{
					
					
				/*case 2:
					implementairlineinfo arl=new implementairlineinfo();
					airlineinfo arl1=new airlineinfo();
					System.out.println("ENTER 1 TO ADD_AIRLINES");
					System.out.println("ENTER 2 TO DELETE_AIRLINES");

					int num=a.nextInt();
					if(num==1)
					{
					System.out.println("Enter No.of.Airlines to be added:");
				
					int c=a.nextInt();
					while(c>0)
					{
					
					
					System.out.println("Enter airlineid");
					arl1.airlineid=a.next();
					
					System.out.println("Enter airlinename");
					arl1.airlinename=a.next();
					
					System.out.println("Enter totalseats");
					arl1.totalseats=a.nextInt();
					
					System.out.println("Enter availableseats");
					arl1.noofseatsavailable=a.nextInt();
					
					System.out.println("Enter from-to");
					arl1.fromto=a.next();
					
					System.out.println("departure date");
					arl1.journeydate = a.next();
					
					System.out.println("Cost per person");
			        arl1.price=a.nextInt();
			        
			         arl.addairlineinfo(arl1);
			         
			         c--;
					}
					break;
					}
					else if (num==2) {
					implementairlineinfo ar3=new implementairlineinfo();

					airlineinfo ar2=new airlineinfo();
					System.out.println("Enter the airlineid :");
					ar2.airlineid=a.next();
					ar3.deleteairlineinfo(ar2);
					break;
					//}
					}*/
					
					
					
					

			
		case 2:
			Registration rs=new Registration();
			System.out.println("Enter the name:");
			rs.name=a.next();
			System.out.println("Enter password :");
			rs.password=a.next();
			System.out.println("Enter emailId :");
			rs.emailId=a.next();
			System.out.println("Enter contact :");
			rs.contact=a.nextLong();
			r.addRegistration(rs);
			System.out.println("Enter 1 to login");
			int num1=a.nextInt();
switch(num1) {

case 1:
	
	Login l1=new Login();
	
	lg.userLogin();
	

}
			
			
			
		case 3: 
			airport b1=new airport();
                System.out.println();
				b1.apName=a.next();
				b1.state=a.next();
				b1.country=a.next();
				b1.cName=a.next();
				ar.addairport(b1);
				break;
		case 4 :
			airport b2=new airport();

			System.out.println("Enter the airport name:");
			b2.apName =a.next();
			ar.deleteairport(b2.apName);
			break;
		
		
			
			
			
		case 5:
			passenger p=new passenger();
			System.out.println("Enter airlineid");
			p.airlineid=a.next();
			System.out.println("Enter the mailid");
			p.mailid=a.next();
			System.out.println("Enter the noofbookings \n");
			p.noofbookings=a.nextInt();
			int b=p.noofbookings;
			while(b>0) {
				System.out.println("Enter passport number \n");
			p.passportno=a.next();
			System.out.println("Enter the Firstname \n");
			p.fname=a.next();
			System.out.println("Enter the Lastname \n");
			p.lname=a.next();
			System.out.println("Enter the address \n");
			p.address=a.next();
			System.out.println("Enter the mobile number \n");
			p.phone=a.nextLong();
			System.out.println("Age \n");
			p.age=a.nextInt();
			System.out.println("Gender \n");
			p.gender=a.next();
			System.out.println("classing \n");
			p.classing=a.next();
			ps.addpassenger(p);
			b--;
			}
			break;
			
		case 6:
		passenger pr=new passenger();
		System.out.println("Enter the passportno :");
		pr.passportno=a.next();
		ps.deletepassenger(pr);
		break;

		
		
		case 7:
			ticket t=new ticket();
			System.out.println("ENTER MAIL_ID");
			t.mailid=a.next();
			System.out.println("ENTER AIRLINE_ID");
			t.airlineid=a.next();
			System.out.println("ENTER AIRLINE_NAME");
			t.airlinename=a.next();
			System.out.println("ENTER DATE OF BOOKING");
			t.dateofbooking = LocalDate.now();
			System.out.println("ENTER TRAVEL_DATE");
			String date2 = a.next();
			t.traveldate=LocalDate.parse(date2);
			System.out.println("NO_OF_BOOKINGS");
			t.noofbookings=a.nextInt();
		    tk.addticket(t);
			
			
		case 8:
			ticket tick=new ticket();
			System.out.println("Enter the mailid :");
			tick.mailid=a.next();
			System.out.println("Enter AirLine Id:");
			tick.airlineid = a.next();
			tk.deleteticket(tick);

		
			
	
		
	

}

}
}