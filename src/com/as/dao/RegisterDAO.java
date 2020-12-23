package com.as.dao;

import com.as.vo.BankInfo;
import com.as.vo.ContactInfo;
import com.as.vo.PersonalInfo;

public interface RegisterDAO {
	/*
	 * int addPersonalInfo(PersonalInfo pi) throws Exception;
	 * 
	 * void addContactInfo(ContactInfo ci, int uid) throws Exception;
	 * 
	 * void addBankInfo(BankInfo bi, int uid) throws Exception;
	 */
	
	void addData(PersonalInfo pi,ContactInfo ci,BankInfo bi);

}