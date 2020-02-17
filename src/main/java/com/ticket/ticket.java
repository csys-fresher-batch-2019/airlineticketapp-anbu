package com.ticket;

import java.sql.Date;
import java.time.LocalDate;

public class ticket {
private String mailid;
public String getMailid() {
	return mailid;
}
public void setMailid(String mailid) {
	this.mailid = mailid;
}
public String getPassportno() {
	return passportno;
}
public void setPassportno(String passportno) {
	this.passportno = passportno;
}
public String getAirlineid() {
	return airlineid;
}
public void setAirlineid(String airlineid) {
	this.airlineid = airlineid;
}
public String getAirlinename() {
	return airlinename;
}
public void setAirlinename(String airlinename) {
	this.airlinename = airlinename;
}
public LocalDate getDateofbooking() {
	return dateofbooking;
}
public void setDateofbooking(LocalDate dateofbooking) {
	this.dateofbooking = dateofbooking;
}
public LocalDate getTraveldate() {
	return traveldate;
}
public void setTraveldate(LocalDate traveldate) {
	this.traveldate = traveldate;
}
public int getNoofbookings() {
	return noofbookings;
}
public void setNoofbookings(int noofbookings) {
	this.noofbookings = noofbookings;
}
public static int getDiscountfornoofbookings() {
	return discountfornoofbookings;
}
public static void setDiscountfornoofbookings(int discountfornoofbookings) {
	ticket.discountfornoofbookings = discountfornoofbookings;
}
public static int getDiscountforprebookings() {
	return discountforprebookings;
}
public static void setDiscountforprebookings(int discountforprebookings) {
	ticket.discountforprebookings = discountforprebookings;
}
public static int getOriginalprice() {
	return originalprice;
}
public static void setOriginalprice(int originalprice) {
	ticket.originalprice = originalprice;
}
public static int getDiscprice() {
	return discprice;
}
public static void setDiscprice(int discprice) {
	ticket.discprice = discprice;
}
private String passportno;
private String airlineid;
private String airlinename;
private LocalDate dateofbooking;
private LocalDate traveldate;
private int noofbookings;
private static int discountfornoofbookings ;
private static int discountforprebookings;
private static int originalprice;
private static int discprice;


}
