package com.chainsys.service;

import com.chainsys.dao.PassengerDAO;
import com.chainsys.dao.implementation.PassengerDAOImplementation;
import com.chainsys.model.Passenger;

public class PassengerService {
	PassengerDAO obj = new PassengerDAOImplementation();
	public int savePassenger(Passenger pass) throws Exception{
		obj.savePassenger(pass);
		return 0;
	}
	public void deletePassenger(Passenger pass1) throws Exception{
		
	}
}
