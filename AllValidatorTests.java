package com.userregistration;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
@RunWith(Suite.class)
@SuiteClasses({ EmailValidatorTest.class, FirstNameValidatorTest.class, LastNameValidatorTest.class,
		PasswordValidatorTest.class, PhoneNumberValidatorTest.class })
public class AllValidatorTests {
	
}
