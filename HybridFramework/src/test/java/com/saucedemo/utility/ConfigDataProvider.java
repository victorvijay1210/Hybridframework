package com.saucedemo.utility;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigDataProvider {
	
	Properties pro;
	
	
	public ConfigDataProvider() {
		
		File fis = new File("./Config/config.properties");
		
		try {
			FileInputStream FI = new FileInputStream(fis);
			
			 pro = new Properties();
			 
			 pro.load(FI);
			
		} catch (Exception e) {
			
			System.out.println("Not able to load config properties file" + e.getMessage());
		}
		
	}
	
	
	public String getdatafromconfig(String keytoSearch) {
		return pro.getProperty(keytoSearch);
	}
	
	public String Browsername() {
		
		return pro.getProperty("Browser");
	}
	
	public String URL() {
		return pro.getProperty("UATurl");
	}

}
