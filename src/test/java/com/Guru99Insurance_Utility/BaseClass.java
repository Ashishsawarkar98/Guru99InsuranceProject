package com.Guru99Insurance_Utility;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.Guru99Insurance_POM.Login_POM;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class BaseClass {

	public WebDriver driver;
	public ExcelDataProvider excel;
	public ConfigDataProvider config;
	public ExtentReports report;
	public ExtentTest logger;

	@BeforeSuite
	public void setUpSuite() throws IOException {
		excel = new ExcelDataProvider();
		config = new ConfigDataProvider();

		ExtentHtmlReporter extent = new ExtentHtmlReporter(new File(
				"C:\\Eclipse IDE java programm files\\Guru99InsuranceProject\\Test_Reports\\TestResult.html"));
		report = new ExtentReports();
		report.attachReporter(extent);
	}

	@BeforeClass
	public void setup() {
		driver = BrowserFactory.StartAppliction(driver, config.getBrowser(), config.getApplicationUrl());
		/*Login_POM l = PageFactory.initElements(driver,Login_POM.class);
		l.EnterEmail_ID(excel.getStringValue("TestData", 7, 1));
		l.EnterPassword(excel.getStringValue("TestData", 8, 1));
		l.ClickLogin();*/

	}

	@AfterClass
	public void tearDown() {
		BrowserFactory.quitBrowser(driver);

	} 

	@AfterMethod
	public void tearDownMethod(ITestResult result) throws IOException {
		if (result.getStatus() == ITestResult.FAILURE) {
			Helper.captureScreenshot(driver);
		}
		report.flush();
	}

}
