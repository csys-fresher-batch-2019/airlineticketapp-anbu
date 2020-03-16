package com.chainsys.service;

import java.util.ArrayList;

import com.chainsys.dao.implementation.AirlineInfoDAOImplementation;
import com.chainsys.model.AirlineInfo;

public class AddAirlineServletService {
	AirlineInfoDAOImplementation obj = new AirlineInfoDAOImplementation();
	public boolean addairlineinfo(AirlineInfo al) throws Exception{
		return obj.addairlineinfo(al);
	}
	public void deleteairlineinfo(AirlineInfo al1) throws Exception{
		obj.deleteairlineinfo(al1);
	}
    public ArrayList<AirlineInfo> viewairlineinfo()throws Exception{
		return obj.viewairlineinfo();
    	
    }
}
