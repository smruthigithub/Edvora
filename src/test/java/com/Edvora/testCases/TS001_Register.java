package com.Edvora.testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.testng.annotations.Test;

import com.Edvora.pageObjects.RegisterPage;

public class TS001_Register extends BaseClass{
	
	@Test
	public void signinTest() throws InterruptedException 
	{
	
		driver.get(baseURL);
		
		RegisterPage rp= new RegisterPage(driver);
		rp.signInPage();
		rp.setUsername(username);
		Thread.sleep(3000);
		rp.setPassword(password);
		rp.clickSubmit();
		
	 
	}

}
