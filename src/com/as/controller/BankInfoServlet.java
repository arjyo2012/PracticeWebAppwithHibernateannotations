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
import com.as.vo.BankInfo;
import com.as.vo.ContactInfo;
import com.as.vo.PersonalInfo;

@Controller
@SessionAttributes("bankInfo")
public class BankInfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public BankInfoServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Autowired
	RegistrationBO registrationBO;

	@ModelAttribute("bankInfo")
	public BankInfo getBank() {
		return new BankInfo();
	}

	@RequestMapping("/entrybankinfo.do")
	public String entrybankinfo(@ModelAttribute("bankInfo") BankInfo bankInfo) {
		System.out.println("in entry.do--" + bankInfo.getbName());
		return "BankInfo";

	}

	@RequestMapping("/bankinfo.do")

	public String bankinfomethod(@Valid @ModelAttribute("bankInfo") BankInfo bankInfo, BindingResult result) {
		System.out.println("in pcontactinfo do--:" + bankInfo.getbName());

		if (result.hasErrors()) {
			return "BankInfo";

		} else {

			return "redirect:register.do";

		}
	}

}
