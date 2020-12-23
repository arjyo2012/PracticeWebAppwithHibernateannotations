package com.as.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.as.bo.RegistrationBO;
import com.as.bo.RegistrationBOimpl;
import com.as.validation.RegisterValidationException;
import com.as.vo.ContactInfo;
import com.as.vo.PersonalInfo;

/**
 * Servlet implementation class PersonalInfoServlet
 */

@Controller
@SessionAttributes("contactInfo")
public class ContactInfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ContactInfoServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Autowired
	RegistrationBO registrationBO;

	@ModelAttribute("contactInfo")
	public ContactInfo getcontact() {
		return new ContactInfo();
	}

	@RequestMapping("/entrycontactinfo.do")
	public String entrycontactinfo(@ModelAttribute("contactInfo") ContactInfo contactInfo) {
		System.out.println("in entry.do--" + contactInfo.getAddress());
		return "ContactInfo";

	}

	@RequestMapping("/contactinfo.do")
	// @RequestAttribute("error")
	public String contactinfomethod(@Valid @ModelAttribute("contactInfo") ContactInfo contactInfo,
			BindingResult result) {
		System.out.println("in pcontactinfo do--:" + contactInfo.getAddress());

		if (result.hasErrors()) {
			System.out.println("errors in if :" + result.toString());
			return "ContactInfo";

		} else {

			return "redirect:entrybankinfo.do";

		}
	}

}
