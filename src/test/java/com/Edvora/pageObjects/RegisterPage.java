package com.Edvora.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
	
WebDriver ldriver;
	
	public RegisterPage(WebDriver rdriver) {
		 
		 ldriver= rdriver;
		 
		 PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath = "//button[contains(text(),'SignIn')]")
	WebElement Signin;
	
	@FindBy(xpath = "//input[@autocomplete='username']")
	WebElement Username;
	
	@FindBy(xpath = "//input[@autocomplete='current-password']")
	WebElement Password;
	
	@FindBy(linkText = "Create Account")
	WebElement CreateAccount;
	
	public void signInPage() {
		Signin.click();
	}

	public void setUsername(String uname) {
	 	Username.sendKeys(uname);
	}

	public void setPassword(String pwd) {
		Password.sendKeys(pwd);
	}

	 public void clickSubmit() {
		 CreateAccount.click();
		
	}

}
