package com.as.controller;

import javax.servlet.http.HttpServlet;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.as.bo.RegistrationBO;
import com.as.vo.PersonalInfo;

@Controller
@SessionAttributes("personalInfo")

public class PersonalInfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public PersonalInfoServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Autowired
	RegistrationBO registrationBO;

	 @ModelAttribute("personalInfo")
	public PersonalInfo getPersonal() {
		return new PersonalInfo();
	}

	@RequestMapping("/entrypersonalinfo.do")
	public String entrypersonalinfo(@ModelAttribute("personalInfo") PersonalInfo personalInfo) {
		System.out.println("in entry.do--" + personalInfo.getFirstName());
		return "PersonalInfo";

	}

	@RequestMapping(value ="/personalinfo.do")

	public String personalinfomethod(@Valid @ModelAttribute("personalInfo") PersonalInfo personalInfo, BindingResult result) {
		
		System.out.println("in personalinfo do--:" + personalInfo.getFirstName());
	
 
		if (result.hasErrors()) {
			
			System.out.println("errors in if :"+result.toString());
			return "PersonalInfo";
		} else {
		
			System.out.println(result.toString());
		 //  return "ContactInfo";
				return "redirect:entrycontactinfo.do";
			
		}
	}

}
