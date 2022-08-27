package com.saucedemo.utility;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Helper {
	
	
	//screenshots, handleframes, windows handle etc
	
	
	public static void capturescreenhot(WebDriver driver) {
		
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		try {
			FileHandler.copy(src, new File("./Screenshots/"+getcurrentDateTime() +".png"));
		} catch (IOException e) {

	    System.out.println("Unable to capture screenshot" + e.getMessage());	
		}
		
	}
	
	
	public static String getcurrentDateTime() {
		
		
		DateFormat customdateformat = new SimpleDateFormat("MM__dd__yyyy__HH__mm__ss");
		
		Date currentdate = new Date();
		
		return customdateformat.format(currentdate);
	}
	

}
