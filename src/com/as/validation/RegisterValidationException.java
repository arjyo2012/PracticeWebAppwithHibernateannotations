package com.as.validation;

 
/**
 * 
 * EMailValidationException
 *
 */

public class RegisterValidationException extends Exception{

	private String errorMessage;
 
	/**
	 * No Argument Constructor
	 */
	public RegisterValidationException(String inErrorMessage){
		errorMessage = inErrorMessage;
	}
	public void setErrorMessage(String inErrorMessage){
		errorMessage = inErrorMessage;
	}

	public String getErrorMessage(){
		return errorMessage;
	}
}
 
