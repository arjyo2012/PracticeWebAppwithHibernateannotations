package com.as.vo;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotBlank;

@Entity
@Table(name="bankinfo")
public class BankInfo {
	
	private int bankid;
	@NotBlank(message="Bank name cant be null")
	private String bName;
	@NotBlank(message="Account no cant be null")
	private String accountNo;
	@NotBlank(message="SSN cant be null")
	private String ssn;
	
	private PersonalInfo personaInfo;
	
	@Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="bankid")
	public int getBankid() {
		return bankid;
	}
	public void setBankid(int bankid) {
		this.bankid = bankid;
	}
	@Column(name="bname")
	public String getbName() {
		return bName;
	}
	public void setbName(String bName) {
		this.bName = bName;
	}
	@Column(name="accountno")
	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String l) {
		this.accountNo = l;
	}
	@Column(name="ssn")
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String l) {
		this.ssn = l;
	}
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "userid")
	
	public PersonalInfo getPersonaInfo() {
		return personaInfo;
	}
	public void setPersonaInfo(PersonalInfo personaInfo) {
		this.personaInfo = personaInfo;
	}
	
	
}
