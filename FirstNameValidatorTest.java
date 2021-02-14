package com.userregistration;
import org.junit.Assert;
import org.junit.Test;
public class FirstNameValidatorTest
{
	@Test
	public void givenFirstName_WhenProper_ShouldReturnTrue()
	{
		UserRegistration ur = new UserRegistration();
		boolean result = ur.validateFirstName("Muthyala");
		Assert.assertTrue(result);
	}
	@Test
	public void givenFirstName_WhenShort_ShouldReturnFalse()
	{
		UserRegistration ur = new UserRegistration();
		boolean result = ur.validateFirstName("Mu");
		Assert.assertFalse(result);
	}
	@Test
	public void givenFirstName_WhenWithSplChars_ShouldReturnFalse()
	{
		UserRegistration ur = new UserRegistration();
		boolean result = ur.validateFirstName("Mut#yala");
		Assert.assertFalse(result);
	}
}
