package com.as.bo;

import org.springframework.validation.BindingResult;

import com.as.vo.BankInfo;
import com.as.vo.ContactInfo;
import com.as.vo.PersonalInfo;

public interface RegistrationBO {

	void registerData1(PersonalInfo pi, ContactInfo ci, BankInfo bi);

}