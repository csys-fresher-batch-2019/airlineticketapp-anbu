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
		System.out.println("Enter the choice \n 1.ADMINLOGIN 2.PASSENGER_REGISTRATION  3.add passenger 4.delete passenger 5.Add Ticket 6.Delete Ticket 7.Add Airlineinfo 8.Delete Airlineinfo 9.AddRegistration 10.Login 11.adminregistration 12.adminlogin");
		int choice = a.nextInt();
switch(choice) 
{
		case 1:
			implementadminlogin com1=new implementadminlogin();
			//interfaceadminlogin com1=new interfaceadminlogin();

					com1.admin();
					
	
					//view order details
					System.out.println("ENTER 1 TO ADD_AIRLINE");
					System.out.println("ENTER 2 TO DELETE_AIRLINE");
					//Scanner a=new Scanner(System.in);
				//	adminlogin air=new adminlogin();
				//	alog.adminlogin();

					int num=a.nextInt();
					
					switch(num)
					{
					
					
				case 1:
					implementairlineinfo arl=new implementairlineinfo();
					airlineinfo arl1=new airlineinfo();
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
					
				case 2:
					implementairlineinfo ar3=new implementairlineinfo();

					airlineinfo ar2=new airlineinfo();
					System.out.println("Enter the airlineid :");
					ar2.airlineid=a.next();
					ar3.deleteairlineinfo(ar2);
					break;
					}
					
					
					
					
					

			
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
	


			
			
			
		case 12 : 
			airport b1=new airport();

				b1.apName=a.next();
				b1.state=a.next();
				b1.country=a.next();
				b1.cName=a.next();
				ar.addairport(b1);
				break;
		case 9 :
			airport b2=new airport();

			System.out.println("Enter the airport name:");
			b2.apName =a.next();
			ar.deleteairport(b2.apName);
			break;
		
		
			
			
			
		case 3:
			passenger p=new passenger();
			System.out.println("Enter airlineid");
			p.airlineid=a.next();
			System.out.println("Enter the mailid");
			p.mailid=a.next();
			System.out.println("Enter the noofbookings \n");
			//p.noofbookings=a.nextInt();
			int b=a.nextInt();
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
			
		case 4:
		passenger pr=new passenger();
		System.out.println("Enter the passportno :");
		pr.passportno=a.next();
		ps.deletepassenger(pr);
		break;

		
		
		case 5:
			ticket t=new ticket();
			t.mailid=a.next();
			t.airlineid=a.next();
			t.airlinename=a.next();
			//t.totalseats=a.nextInt();
			t.dateofbooking = LocalDate.now();
			String date2 = a.next();
			t.traveldate=LocalDate.parse(date2);
			t.noofbookings=a.nextInt();
		    tk.addticket(t);
			
			
		case 6:
			ticket tick=new ticket();
			System.out.println("Enter the passportno :");
			tick.passportno=a.next();
			tk.deleteticket(tick);

		
			
	
		
	}

}

}
}