package com.as.validation;

public class BankInfoValidation {
	private static final String BANK_NAME_CANT_BE_NULL_BR = "Bank name cant be null<br>";
	private static final String SSN_SHOULD_CONTAIN_NUMBERS_ONLY_BR = "SSN should contain numbers only<br>";
	private static final String SSN_CANT_BE_NULL_BR = "ssn cant be null<br>";
	private static final String ACCOUNT_NO_SHOULD_CONTAIN_NUMBERS_ONLY_BR = "account no should contain numbers only<br>";
	private static final String ACCOUNT_NO_CANT_BE_NULL_BR = "Account no cant be null<br>";
	private boolean isFieldBlank(String name) {
		return name == null || name.trim().length() == 0;
	}
	public String isBankNameValid(String bName) {
		if(isFieldBlank(bName)) {
			return BANK_NAME_CANT_BE_NULL_BR ;
		}
		return "";
	}
	public String isAccountNoValid(String accountNo) {
		if(isFieldBlank(accountNo)) {
			return ACCOUNT_NO_CANT_BE_NULL_BR ;
		}else if (!accountNo.matches("[0-9]+")) {
			return ACCOUNT_NO_SHOULD_CONTAIN_NUMBERS_ONLY_BR;}
		return "";
	}
	public String isSNValid(String ssn) {
		if(isFieldBlank(ssn)) {
			return SSN_CANT_BE_NULL_BR ;
		}else if (!ssn.matches("[0-9]+")) {
			return SSN_SHOULD_CONTAIN_NUMBERS_ONLY_BR;}
		return "";
	}

	
	
}
