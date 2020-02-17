package com.vijayanbu.Airlines;

import java.time.LocalDate;
import java.util.Scanner;

import com.AIRLINEINFO.airlineinfo;
import com.AIRLINEINFO.implementairlineinfo;
import com.Airlines.Implementcity;
import com.Airlines.airport;
import com.Registration.Registration;
import com.Registration.implementRegistration;
import com.adminlogin.implementadminlogin;
import com.logger.Logger;
import com.login.implementationLogin;
import com.passenger.implementpassenger;
import com.passenger.passenger;
import com.ticket.implementticket;
import com.ticket.ticket;

public class Testapp {
public static int c;
public static int b;
	
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
	
	
		Implementcity ar=new Implementcity();
		
		
		
		implementpassenger ps=new implementpassenger();
		
		implementticket tk=new implementticket();
		
		implementationLogin lg=new implementationLogin();
		
		implementRegistration r=new implementRegistration();
		
		Scanner a = new Scanner(System.in);	
		Logger logger= Logger.getInstance();
		logger.info("Enter the choice \n 1.ADMINLOGIN  2.PASSENGER REGISTRATION 3.ADD AIRPORT 4.DELETE AIRPORT 5.ADD PASSENGER 6.DELETE PASSENGER 7.ADD_TICKET 8.DELETE_TICKET");
		int choice = a.nextInt();
switch(choice) 
{
		case 1:
			logger.info("Enter Email");
			String email = a.next();
			logger.info("Enter password");
			String password = a.next();
			implementadminlogin met = new implementadminlogin();
			int returned = 0;
			returned = met.admin(email, password);
			logger.info(returned);
			
	   if(returned!=0) {
					//view order details
					logger.info("LOG-IN SUCCESSFUL");
					implementairlineinfo arl=new implementairlineinfo();
					airlineinfo arl1=new airlineinfo();
					logger.info("ENTER 1 TO ADD_AIRLINES");
					logger.info("ENTER 2 TO DELETE_AIRLINES");

					int num=a.nextInt();
					if(num==1)
					{
					logger.info("Enter No.of.Airlines to be added:");
				
					int c=a.nextInt();
					while(c>0)
					{
					
					
				logger.info("Enter airlineid");
					arl1.setAirlineid(a.next());
					
					logger.info("Enter airlinename");
					arl1.setAirlinename(a.next());
					
					logger.info("Enter totalseats");
					arl1.setTotalseats(a.nextInt());
					
					logger.info("Enter availableseats");
					arl1.setNoofseatsavailable(a.nextInt());
					
					logger.info("Enter from-to");
					arl1.setFromto(a.next());
					
					logger.info("departure date");
					arl1.setJourneydate(a.next());
					
					logger.info("Cost per person");
			        arl1.setPrice(a.nextInt());
			        
			         arl.addairlineinfo(arl1);
			         
			         c--;
					}
					break;
					}
					else if (num==2) {
					implementairlineinfo ar3=new implementairlineinfo();

					airlineinfo ar2=new airlineinfo();
					logger.info("Enter the airlineid :");
					ar2.setAirlineid(a.next());
					ar3.deleteairlineinfo(ar2);


					break;
					}
	   }
	   else  {
		   logger.info("invalid login");
		   break;
		   }
a.close();
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
			logger.info("Enter the name:");
			rs.setName(a.next());
			logger.info("Enter password :");
			rs.setPassword(a.next());
			logger.info("Enter emailId :");
			rs.setEmailId(a.next());
			logger.info("Enter contact :");
			rs.setContact(a.nextLong());
			r.addRegistration(rs);
			logger.info("Enter 1 to login");
			int num1=a.nextInt();
switch(num1) {

case 1:
	
	lg.userLogin();
	

}
			
			
			
		case 3: 
			airport b1=new airport();
                System.out.println();
				b1.setApName(a.next());
				b1.setState(a.next());
				b1.setCountry(a.next());
				b1.setcName(a.next());
				ar.addairport(b1);
				break;
		case 4 :
			airport b2=new airport();

			logger.info("Enter the airport name:");
			b2.setApName(a.next());
			ar.deleteairport(b2.getcName());
			break;
		
		
			
			
			
		case 5:
			passenger p=new passenger();
			logger.info("Enter airlineid");
			p.setAirlineid(a.next());
			logger.info("Enter the mailid");
			p.setMailid(a.next());
			logger.info("Enter the noofbookings \n");
			p.setNoofbookings(a.nextInt());
			int b=p.getNoofbookings();
			while(b>0) {
				logger.info("Enter passport number \n");
			p.setPassportno(a.next());
			logger.info("Enter the Firstname \n");
			p.setFname(a.next());
			logger.info("Enter the Lastname \n");
			p.setLname(a.next());
			logger.info("Enter the address \n");
			p.setAddress(a.next());
			logger.info("Enter the mobile number \n");
			p.setPhone(a.nextLong());
			logger.info("Age \n");
			p.setAge(a.nextInt());
			logger.info("Gender \n");
			p.setGender(a.next());
			logger.info("classing \n");
			p.setClassing(a.next());
			ps.addpassenger(p);
			b--;
			}
			break;
			
		case 6:
		passenger pr=new passenger();
		logger.info("Enter the passportno :");
		pr.setPassportno(a.next());
		ps.deletepassenger(pr);
		break;

		
		
		case 7:
			ticket t=new ticket();
			logger.info("ENTER MAIL_ID");
			t.setMailid(a.next());
			logger.info("ENTER AIRLINE_ID");
			t.setAirlineid(a.next());
			logger.info("ENTER AIRLINE_NAME");
			t.setAirlinename(a.next());
			logger.info("ENTER DATE OF BOOKING");
			t.setDateofbooking(LocalDate.now());
			logger.info("ENTER TRAVEL_DATE");
			String date2 = a.next();
			t.setTraveldate(LocalDate.parse(date2));
			logger.info("NO_OF_BOOKINGS");
			t.setNoofbookings(a.nextInt());
		    tk.addticket(t);
			
			
		case 8:
			ticket tick=new ticket();
			logger.info("Enter the mailid :");
			tick.setMailid(a.next());
		
			logger.info("Enter AirLine Id:");
			tick.setAirlineid(a.next());
			tk.deleteticket(tick);

	

}

}
}