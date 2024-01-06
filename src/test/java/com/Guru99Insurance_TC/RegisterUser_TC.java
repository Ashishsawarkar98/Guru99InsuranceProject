package com.Guru99Insurance_TC;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Guru99Insurance_POM.Login_POM;
import com.Guru99Insurance_POM.Logout_POM;
import com.Guru99Insurance_POM.RegisterUser_POM;
import com.Guru99Insurance_Utility.BaseClass;
import com.Guru99Insurance_Utility.Helper;

public class RegisterUser_TC extends BaseClass {

	// TC_001 : Verify Sign Up Page.

	@Test(priority =1)
	public void VerifySignup_Page() throws IOException {
		logger = report.createTest("Signup Page TestCase");
		RegisterUser_POM ru = PageFactory.initElements(driver, RegisterUser_POM.class);
		ru.ClickRegister();
		ru.SelectTitle();
		ru.EnterFirstName(excel.getStringValue("TestData", 0, 1));
		ru.EnterSurName(excel.getStringValue("TestData", 1, 1));
		ru.EnterPhoneNumber(excel.getNumericValue("TestData", 2, 1));
		ru.SelectYear();
		ru.SelectMonth();
		ru.SelectDay();
		ru.SelectFull();
		ru.SelectLisencePeriod();
		ru.SelectOccupation();
		ru.EnterStreetAdress(excel.getStringValue("TestData", 3, 1));
		ru.EnterCity(excel.getStringValue("TestData", 4, 1));
		ru.EnterCountry(excel.getStringValue("TestData", 5, 1));
		ru.EnterPostCode(excel.getNumericValue("TestData", 6, 1));
		ru.EnterEmail(excel.getStringValue("TestData", 7, 1));
		ru.EnterPassword(excel.getStringValue("TestData", 8, 1));
		ru.EnterConfirmPassword(excel.getStringValue("TestData", 9, 1));
		ru.ClickCreateButton();
		Helper.captureScreenshot(driver);
		report.attachReporter();

	}
	
	//  TC_002 : Verify Login Functionality
	
	@Test(priority =2 )
	public void Verify_Login() throws IOException
	{
		logger = report.createTest("Verify Login Functionality");
		Login_POM l = PageFactory.initElements(driver,Login_POM.class);
		l.EnterEmail_ID(excel.getStringValue("TestData", 7, 1));
		l.EnterPassword(excel.getStringValue("TestData", 8, 1));
		l.ClickLogin();
		WebElement result = driver.findElement(By.xpath("(//h2)[1]"));
		String act = result.getText();
		String exp ="Broker Insurance WebPage";
		Assert.assertEquals(act, exp);
		Helper.captureScreenshot(driver);
		report.attachReporter();
	}
	
	// TC_003 : Verify Logout Functionality

		@Test(priority=3)
		public void Verify_Logout() throws IOException {
			logger = report.createTest("Logout Test Case");
			Logout_POM l = PageFactory.initElements(driver, Logout_POM.class);
			l.ClickLogout();
			WebElement result = driver.findElement(By.xpath("//h3[normalize-space()='Login']"));
			String act = result.getText();
			String exp = "Login";
			Assert.assertEquals(act, exp);
			Helper.captureScreenshot(driver);
			report.attachReporter();
		}
	

}
