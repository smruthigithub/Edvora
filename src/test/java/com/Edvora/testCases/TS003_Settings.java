package com.Edvora.testCases;

import javax.security.auth.login.LoginContext;

import org.testng.annotations.Test;

import com.Edvora.pageObjects.LoginPage;
import com.Edvora.pageObjects.SettingsPage;

public class TS003_Settings extends  BaseClass {
	
	@Test
	public void settingsTest() {
		
		driver.get(baseURL);
		
		LoginPage lp = new LoginPage(driver);
		lp.setTxtUserName(username);
		lp.setTxtPassword(password);
		lp.clickLogin();
		
		SettingsPage sp= new SettingsPage(driver);
		sp.clickEdit();
		sp.custFullName("Smruthi");
		sp.custDob("01011992");
		sp.custGender();
		sp.custMobile("123456790");
		sp.custAddress("Kurnool");
		sp.custSettings();
		sp.changePassword("grace1");
		sp.custPassword();
		
	}

}
