package com.as.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import com.as.util.Hibernateutil;
import com.as.vo.BankInfo;
import com.as.vo.ContactInfo;
import com.as.vo.PersonalInfo;

@Repository
public class RegisterDAOimpl implements RegisterDAO {
	
	  public void addData(PersonalInfo pi, ContactInfo ci, BankInfo bi) {
		System.out.println("Registerdaoimpl:add data using hibernate" + pi.getFirstName() + ":" + ci.getAddress());
		Session session = Hibernateutil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		ci.setPersonalinfo(pi);
		bi.setPersonaInfo(pi);
		session.save(ci);
		session.save(bi);
		transaction.commit();
	}
}
