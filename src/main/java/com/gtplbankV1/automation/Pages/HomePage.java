package com.gtplbankV1.automation.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	WebDriver ldriver;

	public HomePage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);

	}

	@FindBy(xpath = "//a[contains(text(),'New Customer')]")
	WebElement newCustomerLink;

	@FindBy(xpath = "//a[contains(text(),'Edit Customer')]")
	WebElement editCustomerLink;

	@FindBy(xpath = "//a[contains(text(),'Delete Customer')]")
	WebElement deleteCustomerLink;

	@FindBy(xpath = "//a[contains(text(),'New Account')]")
	WebElement newAccountLink;

	@FindBy(xpath = "//a[contains(text(),'Mini Statement')]")
	WebElement miniStatementLink;

	@FindBy(xpath = "//a[contains(text(),'Customised Statement')]")
	WebElement customisedStatement;

	@FindBy(xpath = "//a[contains(text(),'Log out')]")
	WebElement logoutLink;

	public void clickNewCustomer() {
		newCustomerLink.click();
	}

	public void clickEditCustomer() {
		editCustomerLink.click();
	}

	public void clickDeleteCustomer() {
		deleteCustomerLink.click();
	}

	public void clickNewAccount() {
		newAccountLink.click();
	}

	public void clickMiniStatement() {
		miniStatementLink.click();
	}

	public void clickCustomisedStatement() {
		customisedStatement.click();
	}

	public void clickLogout() {
		logoutLink.click();
	}
}
