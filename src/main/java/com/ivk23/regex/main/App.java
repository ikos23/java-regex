package com.ivk23.regex.main;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 
 * @author ivk23 [May 2016]
 *
 */
public class App {

	public static void main(String[] args) {

		String text = "A regular expression, specified as a string, must first be compiled into an instance of Pattern class. " 
				+ " The resulting pattern can then be used to create a Matcher object that can match arbitrary character sequences" 
					+ " against the regular expression. All of the state involved in performing a match resides in the matcher," 
						+ " so many matchers can share the same pattern.";
		
		// [any symbol][ss][any symbol] OR [t][any symbol][t]
		Pattern simpleText = Pattern.compile(".s{2}.|t.t");
		Matcher stMatcher = simpleText.matcher(text);
		 
		// Attempts to find the next subsequence of the input sequence that matches the pattern. 
		boolean found = stMatcher.find();  
		System.out.println(found + " -> " 
				+ text.substring(0, stMatcher.end()));
		
		// replace everything what matches the pattern with ****
		text = stMatcher.replaceAll("****");
		System.out.println(text);
		
	}

}
