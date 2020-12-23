package com.as.controller;

import java.io.IOException;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import com.as.bo.RegistrationBO;
import com.as.bo.RegistrationBOimpl;
import com.as.vo.BankInfo;
import com.as.vo.ContactInfo;
import com.as.vo.PersonalInfo;

@Controller
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Autowired
	RegistrationBO registrationBO;

	@RequestMapping("/register.do")
	public String registerData(@SessionAttribute("personalInfo") PersonalInfo pinfo,
			@SessionAttribute("contactInfo") ContactInfo cinfo, @SessionAttribute("bankInfo") BankInfo binfo) {
		System.out.println("in registerdata.do pinfo--" + pinfo.getFirstName());
		System.out.println("in registerdata.do cinfo--" + cinfo.getAddress());
		System.out.println("in registerdata.do binfo--" + binfo.getbName());

		registrationBO.registerData1(pinfo, cinfo, binfo);
		return "personaldatadisplay";

	}
}
