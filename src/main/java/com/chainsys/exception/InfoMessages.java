package com.chainsys.exception;

public class InfoMessages {
	
	private InfoMessages() {
		throw new IllegalStateException("Utility class");
	}

	public static final String GETAIRLINEINFO = "Unable to get Information about Airline";
	public static final String ADMINREGISTRATION = "Unable to do Admin Registration process";
	public static final String ADDAIRLINE="Unable to add airline";
	public static final String DELETEAIRLINE="Unable to add airline";

	public static final String ADDPASSENGER="Unable to do addPassenger";
	public static final String DELETEPASSENGER="Unable to deletePassenger";
	public static final String INVALIDLOGIN = "Invalid Email or Password";

	public static final String PASSENGERREGISTRATION="Unable to do Passenger Registration process";
	public static final String ADDTICKET="Unable to add ticket";
	public static final String DELETETICKET="Unable to delete ticket";


}
