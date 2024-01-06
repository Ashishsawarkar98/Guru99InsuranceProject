package com.Guru99Insurance_Utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Helper {

	WebDriver driver;
	//---Screenshot,Frames,alert,Windows,JavascriptExecutor

		public static void captureScreenshot(WebDriver driver) throws IOException {
			File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			String path = "C:\\Eclipse IDE java programm files\\Guru99InsuranceProject\\TestCases_Screenshots\\TestCase.png";
			File des = new File(path);
			FileHandler.copy(src, des);
		}
	
	   public static void HandleIframe(WebDriver driver)
	   {
		   driver.switchTo().frame("google_ads_iframe_/24132379/INTERSTITIAL_DemoGuru99_0");
		   driver.findElement(By.xpath("//div[@id='dismiss-button']")).click();
		   driver.switchTo().defaultContent();
	   }
	
	
	
	
	
	
	
	
	
	
	
}
