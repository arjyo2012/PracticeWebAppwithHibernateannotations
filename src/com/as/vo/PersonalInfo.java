package com.as.vo;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;
@Entity
@Table(name="prtsonalinfo")
public class PersonalInfo {

	private int userid;
	@NotBlank(message="Firstname cant be null")
	@Size(min=2,message="FirstName Length should be more than 2")  
	//@Pattern(regexp = "^[a-zA-Z]([a-z][s0-9A-Z_-]+)",message="Invalid firstname")
	private String firstName;
	@NotBlank(message="Lastname cant be null")
	@Size(min=2,message="LastName Length should be more than 2")  
	//@Pattern(regexp = "^[a-zA-Z]([a-z][s0-9A-Z_-]+)",message=" Invalid Lastname")
	private String lastName;
	@NotBlank(message="Middlename cant be null")
	private String middleName;
	@NotBlank(message="Gender cant be null")
	private String gender;

	@Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="userid")
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	@Column(name="firstname")
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	@Column(name="lastname")
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	@Column(name="middlename")
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	@Column(name="gender")
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	
	
	
	

}
