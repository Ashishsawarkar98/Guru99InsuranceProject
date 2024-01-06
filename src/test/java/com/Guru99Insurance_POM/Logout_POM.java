package com.Guru99Insurance_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logout_POM {

	// ---Declaration

	@FindBy(xpath = "//input[@value='Log out']")
	private WebElement Logout;

	WebDriver driver;

	// ---Initilization
	public Logout_POM(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	// ---Utilization

	public void ClickLogout() {
		Logout.click();
	}

}
