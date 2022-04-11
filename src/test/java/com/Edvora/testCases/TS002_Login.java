package com.Edvora.testCases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Edvora.pageObjects.LoginPage;

public class TS002_Login extends BaseClass {
	
	@Test
	public void loginTest() throws InterruptedException {
		
		driver.get(baseURL);
	
		 
		 LoginPage lp= new LoginPage(driver);
		 lp.setTxtUserName(username);
		 
		 lp.setTxtPassword(password);
		 lp.clickLogin();
		 
		 Thread.sleep(10000);

		/* if (driver.getTitle().equals("https://testing-assessment-foh15kew9-edvora.vercel.app/s")) {
			 Assert.assertTrue(true);
		}
		 
		 else {
			Assert.assertTrue(false);
		}*/
		
		}


}
