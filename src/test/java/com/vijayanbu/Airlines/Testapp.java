package com.vijayanbu.Airlines;

import java.time.LocalDate;
import java.util.Scanner;

import com.chainsys.dao.implementation.AdminLoginDAOImplementation;
import com.chainsys.dao.implementation.AirlineInfoDAOImplementation;
import com.chainsys.dao.implementation.LoginDAOImplementation;
import com.chainsys.dao.implementation.PassengerDAOImplementation;
import com.chainsys.dao.implementation.RegistrationDAOImplementation;
import com.chainsys.dao.implementation.TicketDAOImplementation;
import com.chainsys.logger.Logger;
import com.chainsys.model.AirlineInfo;
import com.chainsys.model.Passenger;
import com.chainsys.model.Registration;
import com.chainsys.model.Ticket;

public class Testapp {
public static int c;
public static int b;
	
	public static void main(String[] args) throws Exception{
		
		PassengerDAOImplementation ps=new PassengerDAOImplementation();
		
		TicketDAOImplementation tk=new TicketDAOImplementation();
		
		LoginDAOImplementation lg=new LoginDAOImplementation();
		
		RegistrationDAOImplementation r=new RegistrationDAOImplementation();
		
		Scanner a = new Scanner(System.in);	
		Logger logger= Logger.getInstance();
		logger.info("Enter the choice \n 1.ADMINLOGIN  2.PASSENGER REGISTRATION  3.ADD PASSENGER 4.DELETE PASSENGER 5.ADD_TICKET 6.DELETE_TICKET");
		int choice = a.nextInt();
switch(choice) 
{
		case 1:
			logger.info("Enter Email");
			String email = a.next();
			logger.info("Enter password");
			String password = a.next();
			AdminLoginDAOImplementation met = new AdminLoginDAOImplementation();
			int returned = 0;
			returned = met.adminLogin(email, password);
			logger.info(returned);
			
	   if(returned!=0) {
					
					logger.info("LOG-IN SUCCESSFUL");
					AirlineInfoDAOImplementation arl=new AirlineInfoDAOImplementation();
					AirlineInfo arl1=new AirlineInfo();
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
					arl1.setAirlineId(a.next());
					
					logger.info("Enter airlinename");
					arl1.setAirlineName(a.next());
					
					logger.info("Enter totalseats");
					arl1.setTotalSeats(a.nextInt());
					
					logger.info("Enter availableseats");
					arl1.setNoofseatsavailable(a.nextInt());
					
					logger.info("Enter from-to");
					arl1.setFromTo(a.next());
					
					
					logger.info("departure date");
					String  date1 = a.next();
					arl1.setJourneyDate(LocalDate.parse(date1));
					
					logger.info("Cost per person");
			        arl1.setPrice(a.nextInt());
			        
			         arl.saveAirline(arl1);
			         
			         c--;
					}
					break;
					}
					else if (num==2) {
					AirlineInfoDAOImplementation ar3=new AirlineInfoDAOImplementation();

					AirlineInfo ar2=new AirlineInfo();
					logger.info("Enter the airlineid :");
					ar2.setAirlineId(a.next());
					ar3.deleteAirline(ar2);


					break;
					}
	   }
	   else  {
		   logger.info("invalid login");
		   break;
		   }
a.close();
					
					
					
					
					

			
		case 2:
			Registration rs=new Registration();
			logger.info("Enter the name:");
			rs.setName(a.next());
			logger.info("Enter password :");
			String password1=rs.setPassword(a.next());
			logger.info("Enter emailId :");
			String emailId=rs.setEmailId(a.next());
			logger.info("Enter contact :");
			rs.setContact(a.nextLong());
			r.userRegistration(rs);
			logger.info("Enter 1 to login");
			int num1=a.nextInt();
switch(num1) {

case 1:
	
	lg.userLogin(emailId, password1);
	

}
			
			
	
		
		
			
			
			
		case 3:
			Passenger p=new Passenger();
			logger.info("Enter airlineid");
			p.setAirlineid(a.next());
			logger.info("Enter the mailid");
			p.setMailid(a.next());
			logger.info("Enter the noofbookings \n");
			p.setNoofbookings(a.nextInt());
			int b=p.getNoofbookings();
			while(b>0) {
			
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
			ps.savePassenger(p);
			b--;
			}
			break;
			
		case 4:
		Passenger pr=new Passenger();
		logger.info("Enter the passportno :");
		pr.setPhone(a.nextLong());
		ps.deletePassenger(pr);
		break;

		
		
		case 5:
			Ticket t=new Ticket();
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
		    tk.saveTicket(t);
			
			
		case 6:
			Ticket tick=new Ticket();
			logger.info("Enter the mailid :");
			tick.setMailid(a.next());
		
			logger.info("Enter AirLine Id:");
			tick.setAirlineid(a.next());
			tk.deleteTicket(tick);

	

}     

}
}