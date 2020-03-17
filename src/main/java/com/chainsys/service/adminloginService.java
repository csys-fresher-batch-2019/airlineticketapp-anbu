package com.chainsys.service;

import com.chainsys.dao.implementation.AdminLoginDAOImplementation;

public class adminloginService {
	AdminLoginDAOImplementation obj=new AdminLoginDAOImplementation();
	 public int adminLogin(String email, String password) throws Exception{
		return obj.adminLogin(email, password);
	 }

}
