package com.saucedemo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class loginpages {
	
	WebDriver driver;
	
	
	public loginpages(WebDriver driver) {
		
		this.driver=driver;  
	}
	
	
	@FindBy(name = "user-name")
	WebElement username;
	
	@FindBy(name = "password")
	WebElement password;
	
	@FindBy(name = "login-button")
	WebElement login_button;
	
	
	@FindBy(xpath ="//span[contains(text(),'Products')]")
	WebElement prodtitile;
	
	
	public void login_sourcedemo(String Username, String Password) {
		
		try {
			Thread.sleep(5000);
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		username.sendKeys(Username);
		password.sendKeys(Password);
		login_button.click();
	}

	
	public void validatetitle() {
		
		try {
			Thread.sleep(5000);
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		
		if (prodtitile.getText().equalsIgnoreCase("Products")) {
			Assert.assertTrue(true);
		}
	}
}
