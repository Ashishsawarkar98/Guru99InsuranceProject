package com.Guru99Insurance_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_POM {

	// ---Declaration

	@FindBy(xpath = "//input[@id='email']")
	private WebElement Email;

	@FindBy(xpath = "//input[@id='password']")
	private WebElement Password;

	@FindBy(xpath = "//input[@name='submit']")
	private WebElement Login;

	WebDriver driver;

	// ---Initilization

	public Login_POM(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	// ---Utilization

	// ---Step 1 : Enter E-mail ID
	public void EnterEmail_ID(String email) {
		Email.sendKeys(email);
	}

	// ---Step 2 : Enter Password
	public void EnterPassword(String password) {
		Password.sendKeys(password);
	}

	// ---Step 3 : Click Login Button
	public void ClickLogin() {
		Login.click();
	}

}
