package com.gtplbankV1.automation.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddNewCustomer {

	WebDriver ldriver;

	public AddNewCustomer(WebDriver rdriver) {

		ldriver = rdriver;

		PageFactory.initElements(rdriver, this);

	}

	@FindBy(xpath = "//input[@name='name']")
	WebElement txtCustomerName;

	@FindBy(xpath = "(//input[@type='radio'])[1]")
	WebElement maleRadioBtn;

	@FindBy(xpath = "(//input[@type='radio'])[2]")
	WebElement femaleRadioBtn;

	@FindBy(xpath = "(//input[@type='date'])")
	WebElement txtdate;

	@FindBy(xpath = "//*[@name='addr']")
	WebElement txtAddress;

	@FindBy(xpath = "//input[@name='city']")
	WebElement txtCity;

	@FindBy(xpath = "//input[@name='state']")
	WebElement txtState;

	@FindBy(xpath = "//input[@name='pinno']")
	WebElement txtPinNumber;

	@FindBy(xpath = "//input[@name='telephoneno']")
	WebElement txtPhoneNumber;

	@FindBy(xpath = "//input[@name='emailid']")
	WebElement txtEmail;

	@FindBy(xpath = "//input[@name='password']")
	WebElement txtPassword;

	@FindBy(xpath = "//input[@type='submit']")
	WebElement submitBtn;

	@FindBy(xpath = "//input[@type='reset']")
	WebElement resetBtn;

	public void setCustomerName(String name) {
		txtCustomerName.sendKeys(name);

	}

	public void clickMale() {
		maleRadioBtn.click();

	}

	public void clickFemale() {
		femaleRadioBtn.click();
	}

	public void setDate(String dd) {
		txtdate.sendKeys(dd);
	}

	public void setMonth(String MM) {
		txtdate.sendKeys(MM);
	}

	public void setYear(String YYYY) {
		txtdate.sendKeys(YYYY);
	}

	public void setAddress(String add) {
		txtAddress.sendKeys(add);

	}

	public void setCity(String city) {
		txtCity.sendKeys(city);
	}

	public void setState(String state) {
		txtState.sendKeys(state);
	}

	public void setPin(String pin) {
		txtPinNumber.sendKeys(pin);
	}

	public void setPhoneNumber(String Tnum) {
		txtPhoneNumber.sendKeys(Tnum);
	}

	public void setEmailAddress(String email) {
		txtEmail.sendKeys(email);
	}

	public void setPassword() {
		txtPassword.sendKeys("usedapU");
	}

	public void clickOnSubmit() {
		submitBtn.click();
	}

	public void clickOnReset() {
		resetBtn.click();
	}

}
