package com.gtplbankV1.automation.Tests;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.gtplbankV1.automatio.Base.TestBase;
import com.gtplbankV1.automation.Pages.AddNewCustomer;
import com.gtplbankV1.automation.Pages.HomePage;
import com.gtplbankV1.automation.Pages.LoginPage;
import com.gtplbankV1.automation.utilities.XLUtils;

public class AddNewCustomerTest extends TestBase {

	int rowNum;
	int colNum;
	String sheetName = "sheet1";

	@Test(dataProvider = "getNewCustomerData")
	public void TC_002_addNewCustomerFunctionTest(String CustomerName, String Gender, String DD, String MM, String YYYY,
			String Address, String City, String State, String Pin, String TelephoneNumber, String Email)
			throws InterruptedException {

		LoginPage lp = new LoginPage(driver);
		HomePage hp = new HomePage(driver);
		AddNewCustomer addCustomer = new AddNewCustomer(driver);

		log.info("Test Case to check login function");
		lp.SetUserName(username);
		log.info("Username has been entered");
		lp.SetPassword(password);
		log.info("Passwword has been entered");
		lp.ClickLoginBtn();
		log.info("Clicked on Login");

		hp.clickNewCustomer();
		addCustomer.setCustomerName(CustomerName);

		if (Gender.equalsIgnoreCase("Male")) {
			addCustomer.clickMale();
		} else if (Gender.equalsIgnoreCase("Female")) {
			addCustomer.clickFemale();
		} else {
			System.out.println("Invalid Gender");
		}

		addCustomer.setDate(String.valueOf(DD));
		addCustomer.setDate(MM);
		addCustomer.setDate(YYYY);
		addCustomer.setAddress(Address);
		addCustomer.setCity(City);
		addCustomer.setState(State);
		addCustomer.setPin(Pin);
		addCustomer.setPhoneNumber(TelephoneNumber);

		String email = randomestring() + "@gmail.com";

		addCustomer.setEmailAddress(email);
		addCustomer.setPassword();
		addCustomer.clickOnSubmit();

		Thread.sleep(2000);

		String vMsg = driver.findElement(By.xpath("//p[@class='heading3']")).getText();

		if (vMsg.equalsIgnoreCase("Customer Registered Successfully!!!")) {

			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}

		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'Continue')]")).click();

		Thread.sleep(2000);
		hp.clickLogout();
		Thread.sleep(2000);

		driver.switchTo().alert().accept();
	}

	public String randomestring() {
		String generatedstring = RandomStringUtils.randomAlphabetic(8);
		return (generatedstring);
	}

	@DataProvider
	public Object[][] getNewCustomerData() {

		Object data[][] = XLUtils.getTestData(sheetName);

		return data;
	}

}
