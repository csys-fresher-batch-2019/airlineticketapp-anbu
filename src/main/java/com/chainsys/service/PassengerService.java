package com.chainsys.service;

import com.chainsys.dao.PassengerDAO;
import com.chainsys.dao.implementation.PassengerDAOImplementation;
import com.chainsys.model.Passenger;

public class PassengerService {
	PassengerDAO obj = new PassengerDAOImplementation();
	public int addpassenger(Passenger pass) throws Exception{
		obj.addpassenger(pass);
		return 0;
	}
	public void deletepassenger(Passenger pass1) throws Exception{
		
	}
}
