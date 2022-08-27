package com.saucedemo.utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserFactory {
	
	
	@SuppressWarnings("deprecation")
	
	public static WebDriver Startapplication(String browsername, WebDriver driver, String appurl) {
		
		if(browsername.equalsIgnoreCase("Chrome")) {
			
			WebDriverManager.chromedriver().setup();
			 driver = new ChromeDriver();

		}
		else if (browsername.equalsIgnoreCase("Firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
			
		else {
			System.out.println("Driver not supported");
		}
		
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(appurl);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		return driver;
		
	}
	
	
	public static void Driver_Quit(WebDriver driver) {
		driver.quit();
	}
	
	

}
