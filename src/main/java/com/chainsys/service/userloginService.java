package com.chainsys.service;

import com.chainsys.dao.implementation.LoginDAOImplementation;

public class userloginService {
	LoginDAOImplementation obj=new LoginDAOImplementation();
	public boolean userLogin(String emailId,String password)throws Exception{
		return obj.userLogin(emailId, password);
	}

}
