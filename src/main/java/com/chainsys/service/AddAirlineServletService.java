package com.chainsys.service;

import java.util.ArrayList;

import com.chainsys.dao.implementation.AirlineInfoDAOImplementation;
import com.chainsys.model.AirlineInfo;

public class AddAirlineServletService {
	AirlineInfoDAOImplementation obj = new AirlineInfoDAOImplementation();
	public boolean saveAirline(AirlineInfo al) throws Exception{
		return obj.saveAirline(al);
	}
	public void deleteAirline(AirlineInfo al1) throws Exception{
		obj.deleteAirline(al1);
	}
    public ArrayList<AirlineInfo> viewAirline()throws Exception{
		return obj.getAirline();
    	
    }
}
