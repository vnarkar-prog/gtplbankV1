package com.gtplbankV1.automation.Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.gtplbankV1.automatio.Base.TestBase;
import com.gtplbankV1.automation.Pages.LoginPage;

public class LoginPageTest extends TestBase {

	@Test
	public void TC_001_CheckLoginFunction() {

		LoginPage lp = new LoginPage(driver);

		log.info("Test Case to check login function");
		lp.SetUserName(username);
		log.info("Username has been entered");
		lp.SetPassword(password);
		log.info("Passwword has been entered");
		lp.ClickLoginBtn();
		log.info("Clicked on Login");

		String HomeTitle = driver.getTitle();
		System.out.println(HomeTitle);

		if (HomeTitle.equals("GTPL Bank Manager HomePage")) {

			Assert.assertTrue(true, "Test case passed");
			log.info("Login Test case passed");

		} else {

			Assert.assertTrue(false, "Test case failed");
			log.info("Login Test case Failed");
		}

	}

}
