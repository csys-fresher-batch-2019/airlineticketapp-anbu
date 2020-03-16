package com.chainsys.model;

import java.sql.Date;
import java.time.LocalDate;

public class Ticket {
private String mailid;
public String getMailid() {
	return mailid;
}
public void setMailid(String mailid) {
	this.mailid = mailid;
}
public String getPassportno() {
	return passportNo;
}
public void setPassportno(String passportno) {
	this.passportNo = passportno;
}
public String getAirlineid() {
	return airlineId;
}
public void setAirlineid(String airlineid) {
	this.airlineId = airlineid;
}
public String getAirlinename() {
	return airlineName;
}
public void setAirlinename(String airlinename) {
	this.airlineName = airlinename;
}
public LocalDate getDateofbooking() {
	return dateOfBooking;
}
public void setDateofbooking(LocalDate dateofbooking) {
	this.dateOfBooking = dateofbooking;
}
public LocalDate getTraveldate() {
	return travelDate;
}
public void setTraveldate(LocalDate traveldate) {
	this.travelDate = traveldate;
}
public int getNoofbookings() {
	return noOfBookings;
}
public void setNoofbookings(int noofbookings) {
	this.noOfBookings = noofbookings;
}



private String passportNo;
private String airlineId;
private String airlineName;
private LocalDate dateOfBooking;
private LocalDate travelDate;
private int noOfBookings;



}
