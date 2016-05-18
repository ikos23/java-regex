package com.ivk23.regex.validators;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Can be used to check if a string represents valid IPv4 address.
 * 
 * @author ivk23 [May 2016]
 *
 */
public class IpAddressVlidator {

	// accurate IP adress regex
	private static final String IP_ADDR__PATTERN = "\\b((25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)(\\.(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)){3})\\b";

	private static final Pattern ipPattern = Pattern.compile(IP_ADDR__PATTERN);

	/**
	 * Returns <tt>true</tt> if an input string is a valid
	 * IPv4 address.
	 * 
	 * @param ipAddr input string.
	 * @return
	 */
	public static boolean validate(String ipAddr) {
		Matcher matcher = ipPattern.matcher(ipAddr);
		return matcher.matches();
	}
}
