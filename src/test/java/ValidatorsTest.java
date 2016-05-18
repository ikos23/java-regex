import org.junit.Assert;
import org.junit.Test;

import com.ivk23.regex.validators.EmailValidator;
import com.ivk23.regex.validators.IpAddressVlidator;
import com.ivk23.regex.validators.PhoneNumberValidator;

/**
 * A couple of unit tests to check some regex
 * validators.
 * 
 * @author ivk23 [May 2016]
 *
 */
public class ValidatorsTest {
	
	@Test
	public void phoneNumberValidatorSuccessTest() {
		final String validPhone = "+38(093)555-12-34";
		Assert.assertTrue(PhoneNumberValidator.validate(validPhone));
	}
	
	@Test
	public void phoneNumberValidatorFailTest() {
		final String invalidPhone = "+38 093 555 1234";
		final String invalidPhone2 = "+38(093)5556677";
		
		Assert.assertFalse(PhoneNumberValidator.validate(invalidPhone));
		Assert.assertFalse(PhoneNumberValidator.validate(invalidPhone2));
	}
	
	@Test
	public void ipAddressValidatorSuccessTest() {
		String validIp1 = "192.168.1.1";
		String validIp2 = "255.255.255.1";
		
		Assert.assertTrue(IpAddressVlidator.validate(validIp1));
		Assert.assertTrue(IpAddressVlidator.validate(validIp2));
	}
	
	@Test
	public void ipAddressValidatorFailTest() {
		String invalidIp1 = "256.1.1.1";
		String invalidIp2 = "1234.1.1.1";
		
		Assert.assertFalse(IpAddressVlidator.validate(invalidIp1));
		Assert.assertFalse(IpAddressVlidator.validate(invalidIp2));
	}
	
	@Test
	public void emailValidatorSuccessTest() {
		String valid = "xxx.yyy.123@ccc.vvv";
		
		Assert.assertTrue(EmailValidator.validate(valid));
	}
	
	@Test
	public void emailValidatorFailTest() {
		String invalid = "xxx_123@cccc";
		
		Assert.assertFalse(EmailValidator.validate(invalid));
	}

}
