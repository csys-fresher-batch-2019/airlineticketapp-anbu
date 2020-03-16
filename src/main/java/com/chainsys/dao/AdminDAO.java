package com.chainsys.dao;

public interface AdminDAO {
	//public boolean adminlogin(String emailid,String password)throws Exception;
 public int admin(String email, String password) throws Exception;
}
