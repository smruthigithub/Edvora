package com.Edvora.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver ldriver;
	
	 public LoginPage(WebDriver rdriver) {
		 
		 ldriver= rdriver;
		 PageFactory.initElements(rdriver, this);
		
	 }
		 @FindBy(xpath = "//input[@autocomplete='username']")
		 @CacheLookup
		 WebElement txtUserName;
		 
		 @FindBy(xpath = "//input[@autocomplete='current-password']")
		 @CacheLookup
		 WebElement txtPassword;
		 
		 @FindBy(xpath = "//button[@class='chakra-button css-8h0nsd']")
		 @CacheLookup
		 WebElement btnLogin;


		public void setTxtUserName(String uname) {
			txtUserName.sendKeys(uname);
		}

		public void setTxtPassword(String pwd) {
			txtPassword.sendKeys(pwd);
		}

		public void clickLogin() {
			btnLogin.click();
		}

}
