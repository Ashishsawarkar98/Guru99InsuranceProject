package com.Guru99Insurance_Utility;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory {

	// List of Various Browsers which is used in Framework

	public static WebDriver StartAppliction(WebDriver driver, String BrowserName, String ApplicationURL) {
		if (BrowserName.equals("Chrome")) {
			driver = new ChromeDriver();
		} else if (BrowserName.equals("FireFox")) {
			driver = new FirefoxDriver();
		} else if (BrowserName.equals("Edge")) {
			driver = new EdgeDriver();
		} else {
			System.out.println("Sorry..this browser does not support");
		}

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(ApplicationURL);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		return driver;

	}

	public static void quitBrowser(WebDriver driver) {
		driver.quit();
	}

}
