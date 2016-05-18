package com.ivk23.regex.validators;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Can be used to check if phone number matches
 * the pattern +38(0AA)-AAA-AA-AA (UA number format)
 * 
 * @author ivk23 [May 2016]
 *
 */
public class PhoneNumberValidator {
	
	// regex represents
	private static final String PHONE_PATTERN = "(\\+)(38)((\\()0(\\d{2})(\\)))(\\d{3})-(\\d{2})-(\\d{2})";
	
	private static final Pattern pnPattern = Pattern.compile(PHONE_PATTERN);
	
	/**
	 * Returns <tt>true</tt> if an input string
	 * represents well-formatted phone number.
	 * 
	 * @param phoneNumber
	 * @return
	 */
	public static boolean validate(String phoneNumber) {
		Matcher matcher = pnPattern.matcher(phoneNumber);
		return matcher.matches();
	}

}
