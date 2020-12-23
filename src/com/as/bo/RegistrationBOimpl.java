package com.as.bo;

import java.util.ArrayList;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.as.dao.RegisterDAO;
import com.as.dao.RegisterDAOimpl;
import com.as.validation.BankInfoValidation;
import com.as.validation.ContactInfoValidation;
import com.as.validation.PersonalInfoValidation;
import com.as.vo.BankInfo;
import com.as.vo.ContactInfo;
import com.as.vo.PersonalInfo;
@Service
public class RegistrationBOimpl implements RegistrationBO {
	@Autowired
	RegisterDAO registerDAO;
	public RegistrationBOimpl() {
		super();
	}

public void registerData1(PersonalInfo pi, ContactInfo ci, BankInfo bi) {
		
		System.out.println("registerBOimp:reregisterData1 HIBERNATE");
			registerDAO.addData(pi,ci,bi);
		

	}

}
