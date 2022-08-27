package com.saucedemo.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.saucedemo.pages.Baseclass;
import com.saucedemo.pages.loginpages;



public class logintestsourcedemo  extends Baseclass{
	
	@Test
	public void loginapp() throws Exception {
		
		
		
		loginpages	loginpages =PageFactory.initElements(driver, loginpages.class);

				loginpages.login_sourcedemo(data.getStringData("Test", 0, 0), data.getStringData("Test", 0, 1));
				loginpages.validatetitle();
		
		
		
		
	}

}
