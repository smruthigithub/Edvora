package com.Edvora.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SettingsPage {

	WebDriver ldriver;

	public SettingsPage(WebDriver rdriver) {

		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);

	}

	@FindBy(css = "body.chakra-ui-light:nth-child(2) div.css-1ki54i main.css-0 div.css-0 div.css-gmeyij:nth-child(1) div.css-1j42kjs div.css-ftk8zh div.chakra-stack.css-1svu32t > button.chakra-button.css-vb7buc")
	@CacheLookup
	WebElement edit;

	@FindBy(xpath = "//input[@name='fullname']")
	@CacheLookup
	WebElement fullName;

	@FindBy(xpath = "//input[@name='dateOfBirth']")
	@CacheLookup
	WebElement dateofBirth;

	@FindBy(xpath = "(//select[@class='chakra-select css-ibs81u'])[1]")
	@CacheLookup
	WebElement gender;

	@FindBy(name = "mobileNumber")
	@CacheLookup
	WebElement mobileNumber;

	@FindBy(name = "address")
	@CacheLookup
	WebElement address;

	@FindBy(xpath = "(//button[@class='chakra-button css-1746q3r'])[1]")
	@CacheLookup
	WebElement saveSettings;

	@FindBy(name = "Password")
	@CacheLookup
	WebElement changePassword;

	@FindBy(xpath = "(//button[@class='chakra-button css-1746q3r'])[2]")
	@CacheLookup
	WebElement savePassword;

	public void clickEdit() {
		edit.click();
	}

	public void custFullName(String cname) {
		fullName.sendKeys(cname);
	}

	public void custDob(String cdob) {
		dateofBirth.sendKeys(String.valueOf(cdob));
	}

	public void custGender() {
		gender.click();

	}

	public void custMobile(String cphone) {
			mobileNumber.sendKeys(String.valueOf(cphone));
		}

	public void custAddress(String caddress) {
		address.sendKeys(caddress);
	}

	public void custSettings() {
		saveSettings.click();
	}

	public void changePassword(String newpassword) {
		changePassword.sendKeys(newpassword);
	}
	
	public void custPassword() {
		saveSettings.click();
	}

}
