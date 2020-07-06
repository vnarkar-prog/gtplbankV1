package com.gtplbankV1.automation.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver ldriver;

	public LoginPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(name = "uid")
	WebElement Username;

	@FindBy(name = "password")
	WebElement Password;

	@FindBy(xpath = "//input[@type='submit']")
	WebElement LoginBtn;

	@FindBy(xpath = "//input[@type='reset']")
	WebElement ResetBtn;

	public void SetUserName(String un) {
		Username.sendKeys(un);
	}

	public void SetPassword(String pwd) {
		Password.sendKeys(pwd);
	}

	public void ClickLoginBtn() {
		LoginBtn.click();
	}

	public void ClickResetBtn() {
		ResetBtn.click();
	}

}
