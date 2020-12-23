package com.as.validation;

public class ContactInfoValidation {
	private static final String HRMS_R0018_COUNTRY_CAN_CONTAIN_ONLY_LETTERS_NUMBERS_AND_SPACES_HYPHENS_UNDERSCORES_PLEASE_ENTER_A_VALID_COUNTRY_BR = "HRMS_R0018: country can contain only letters, numbers, and Spaces, Hyphens (-), underscores (_). Please enter a valid country.<br>";
	private static final String STATE_IS_REQUIRED_PLEASE_ENTER_STATE_BR = "State is required. Please enter state<br>";
	private static final String HRMS_R0018_CITY_CAN_CONTAIN_ONLY_LETTERS_NUMBERS_AND_SPACES_HYPHENS_UNDERSCORES_PLEASE_ENTER_A_VALID = "HRMS_R0018: City can contain only letters, numbers, and Spaces, Hyphens (-), underscores (_). Please enter a valid City.<br>";
	private static final String PLEASE_SPECIFY_CITY_BR = "Please specify City<br>";
	private static final String ADDRESS_CANT_BE_BLANK_BR = "address cant be blank<br>";
	private static final String HRMS_R0029_PHONE_NUMBER_CONTAINS_10_DIGITS_PLEASE_ENTER_A_VALID_PHONE_NUMBER_BR = "HRMS_R0029: Phone number contains 10 digits. Please enter a valid Phone number<br>";
	private static final String COUNTRY_IS_REQUIRED_PLEASE_ENTER_VALID_COUNTRY_BR = "Country is required. Please enter valid country<br>";
	StringBuffer sb = new StringBuffer();



	
	public String isAddressValid(String address) {
	
	if (isFieldBlank(address)) {
		return ADDRESS_CANT_BE_BLANK_BR ;
	}
	return "";
	}
	public String isCityValid(String city) {
		
		if (isFieldBlank(city)) {
			return PLEASE_SPECIFY_CITY_BR ;
		}else if (!city.matches("^[a-zA-Z]([a-z\s0-9A-Z_-]+)")) {
			return HRMS_R0018_CITY_CAN_CONTAIN_ONLY_LETTERS_NUMBERS_AND_SPACES_HYPHENS_UNDERSCORES_PLEASE_ENTER_A_VALID ;
		}
		return "";
		}
	
	public String isStateValid(String state) {
		
		if (isFieldBlank(state)) {
			return STATE_IS_REQUIRED_PLEASE_ENTER_STATE_BR ;
		}
		return "";
	}
	
public String isCountryValid(String country) {
		
		if (isFieldBlank(country)) {
			return COUNTRY_IS_REQUIRED_PLEASE_ENTER_VALID_COUNTRY_BR ;
		}else if (!country.matches("^[a-zA-Z]([a-z\s0-9A-Z_-]+)")) {
			return HRMS_R0018_COUNTRY_CAN_CONTAIN_ONLY_LETTERS_NUMBERS_AND_SPACES_HYPHENS_UNDERSCORES_PLEASE_ENTER_A_VALID_COUNTRY_BR;
		}
		return "";
		}
	
	
	public String isValidPhoneno(String phone) {
		if (phone.length() != 10 || !phone.matches("[0-9]+")) {
			return HRMS_R0029_PHONE_NUMBER_CONTAINS_10_DIGITS_PLEASE_ENTER_A_VALID_PHONE_NUMBER_BR;
		}
		return "";
	}
	private boolean isFieldBlank(String name) {
		return name == null || name.trim().length() == 0;
	}

}
