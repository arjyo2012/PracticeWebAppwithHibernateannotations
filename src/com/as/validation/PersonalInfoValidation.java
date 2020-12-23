package com.as.validation;

import com.as.vo.PersonalInfo;

public class PersonalInfoValidation {
	private static final String PLEASE_SPECIFY_MIDDLE_NAME_BR = " Please specify Middle Name<br>";
	private static final String PLEASE_SPECIFY_GENDER_BR = " Please specify Gender<br>";
	private static final String LAST_NAME_MUST_START_WITH_A_LETTER_IT_CAN_CONTAIN_ONLY_LETTERS_NUMBERS_AND_SPACES_HYPHENS_UNDERSCORES_PLEASE_ENTER_A_VALID_LAST_NAME = " Last Name must start with a letter. It can contain only letters, numbers, and Spaces, Hyphens (-),Underscores (_). Please enter a valid Last Name.<br>";
	private static final String THE_LASST_NAME_IS_LESS_THAN_2_CHARACTERS_PLEASE_CHECK_AND_ENTER_A_VALID_LAST_NAME = " The Lasst Name is less than 2 characters.Please Check and enter a valid Last Name.<br>";
	private static final String PLEASE_SPECIFY_LAST_NAME = " Please specify Last Name.<br>";
	private static final String FIRST_NAME_MUST_START_WITH_A_LETTER_IT_CAN_CONTAIN_ONLY_LETTERS_NUMBERS_AND_SPACES_HYPHENS_UNDERSCORES_PLEASE_ENTER_A_VALID_FIRST_NAME = " First Name must start with a letter. It can contain only letters, numbers, and Spaces, Hyphens (-),Underscores (_). Please enter a valid First Name.<br>";
	private static final String THE_FIRST_NAME_IS_LESS_THAN_2_CHARACTERS_PLEASE_CHECK_AND_ENTER_A_VALID_FIRST_NAME = "The First Name is less than 2 characters.Please Check and enter a valid First Name.<br>";
	private static final String PLEASE_SPECIFY_FIRST_NAME = " Please specify First Name.<br>";
	StringBuffer sb = new StringBuffer();

	public String isValidFirstName(String fname) {

		if (isFieldBlank(fname)) {
			return PLEASE_SPECIFY_FIRST_NAME;
		} else if (fname.length() <= 2) {
			return THE_FIRST_NAME_IS_LESS_THAN_2_CHARACTERS_PLEASE_CHECK_AND_ENTER_A_VALID_FIRST_NAME;
		} else if (!fname.matches("^[a-zA-Z]([a-z\s0-9A-Z_-]+)")) {
			return FIRST_NAME_MUST_START_WITH_A_LETTER_IT_CAN_CONTAIN_ONLY_LETTERS_NUMBERS_AND_SPACES_HYPHENS_UNDERSCORES_PLEASE_ENTER_A_VALID_FIRST_NAME;
		}
		return "";
	}

	public String isValidLastName(String lname) {

		if (isFieldBlank(lname)) {
			return PLEASE_SPECIFY_LAST_NAME;
		} else if (lname.length() <= 2) {
			return THE_LASST_NAME_IS_LESS_THAN_2_CHARACTERS_PLEASE_CHECK_AND_ENTER_A_VALID_LAST_NAME;
		} else if (!lname.matches("^[a-zA-Z]([a-z\s0-9A-Z_-]+)")) {
			return LAST_NAME_MUST_START_WITH_A_LETTER_IT_CAN_CONTAIN_ONLY_LETTERS_NUMBERS_AND_SPACES_HYPHENS_UNDERSCORES_PLEASE_ENTER_A_VALID_LAST_NAME;
		}
		return "";
	}

	private boolean isFieldBlank(String name) {
		return name == null || name.trim().length() == 0;
	}

	public String isGenderValid(String gender) {
		if (isFieldBlank(gender)) {
			return PLEASE_SPECIFY_GENDER_BR;
		}
		return "";
	}

	public String isValidMiddleName(String mName) {
		if (isFieldBlank(mName)) {
			return PLEASE_SPECIFY_MIDDLE_NAME_BR;
		}
		return "";
	}
	/*
	 * public StringBuffer validatedata(PersonalInfo pi) { // TODO Auto-generated
	 * method stub isValidName(pi.getfName()); isValidName(pi.getlName());
	 * isGenderValid(pi.getlName()); sb.append(sb1); //sb.append(sb2); //
	 * sb.append(sb3); return sb; }
	 */

	public String validate(PersonalInfo pi) {
		
		return null;
	}
}
