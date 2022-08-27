package com.saucedemo.pages;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import com.saucedemo.utility.BrowserFactory;
import com.saucedemo.utility.ConfigDataProvider;
import com.saucedemo.utility.Dataprovider;
import com.saucedemo.utility.Helper;

public class Baseclass {
	
	public WebDriver driver;
public Dataprovider data;

public ConfigDataProvider config;

	@BeforeSuite
	public void setupsuite() {
		data = new Dataprovider();
		config= new ConfigDataProvider();
		


	}
	
	@BeforeClass
	public void setupbrowser() {
		driver=BrowserFactory.Startapplication(config.Browsername(), driver, config.URL());
  
	}
	
	@AfterClass
	public void teardown() {
		BrowserFactory.Driver_Quit(driver);

	}
	
	@AfterMethod
	public void teardownmethod(ITestResult result) {
		
		if (result.getStatus()==ITestResult.FAILURE) {
			Helper.capturescreenhot(driver);
		}
	}


}
