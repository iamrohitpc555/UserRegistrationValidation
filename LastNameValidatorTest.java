package com.userregistration;
import org.junit.Assert;
import org.junit.Test;
public class LastNameValidatorTest
{
	@Test
	public void givenLastName_WhenProper_ShouldReturnTrue()
	{
		UserRegistration ur = new UserRegistration();
		boolean result = ur.validateLastName("Muthyala");
		Assert.assertTrue(result);
	}
	@Test
	public void givenLastName_WhenShort_ShouldReturnFalse()
	{
		UserRegistration ur = new UserRegistration();
		boolean result = ur.validateLastName("Mu");
		Assert.assertFalse(result);
	}
	@Test
	public void givenLastName_WhenWithSplChars_ShouldReturnFalse()
	{
		UserRegistration ur = new UserRegistration();
		boolean result = ur.validateLastName("Mut#yala");
		Assert.assertFalse(result);
	}
}
