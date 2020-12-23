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
@Table(name = "contactinfo")
public class ContactInfo {
	private int cid;
	@NotBlank(message="Address cant be null")
	private String address;

	@NotBlank(message="city cant be null")
	private String city;
	@NotBlank(message="state cant be null")
	private String state;
	@NotBlank(message="counntry cant be null")
	private String country;
	// private String phone;
	@NotBlank(message="phone cant be null")
	private String phone;
	private PersonalInfo personalinfo;



	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "contactid")
	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	

	@Column(name = "address")
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Column(name = "city")
	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Column(name = "state")
	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Column(name = "country")
	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	
	@Column(name = "phone")
	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "userid")
	public PersonalInfo getPersonalinfo() {
		return personalinfo;
	}

	public void setPersonalinfo(PersonalInfo personalinfo) {
		this.personalinfo = personalinfo;
	}

}
