package com.Guru99Insurance_Utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

public class ConfigDataProvider {

	public Properties pro;
	WebDriver driver;

	// To read the data from COnfig.Prperties

	public ConfigDataProvider() throws IOException {
		FileInputStream fis = new FileInputStream(
				"C:\\Eclipse IDE java programm files\\Guru99InsuranceProject\\Config\\Config.properties");
		pro = new Properties();
		pro.load(fis);
	}

	public String getDataFromConfig(String KeyToSearch) {
		return pro.getProperty(KeyToSearch);
	}

	public String getBrowser() {
		return pro.getProperty("Browser");
	}

	public String getApplicationUrl() {
		return pro.getProperty("qaURL");
	}

	public String getUsername() {
		return pro.getProperty("username");
	}

	public String getPassword() {
		return pro.getProperty("password");
	}

}
