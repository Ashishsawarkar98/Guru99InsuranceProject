package com.Guru99Insurance_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RegisterUser_POM {

	@FindBy(xpath = "//a[@class='btn btn-default']")
	private WebElement Register;

	@FindBy(xpath = "//select[@id='user_title']")
	private WebElement Title;

	@FindBy(xpath = "//input[@id='user_firstname']")
	private WebElement FirstName;

	@FindBy(xpath = "//input[@id='user_surname']")
	private WebElement LastName;

	@FindBy(xpath = "//input[@id='user_phone']")
	private WebElement Phone;

	@FindBy(xpath = "//select[@id='user_dateofbirth_1i']")
	private WebElement Year;

	@FindBy(xpath = "//select[@id='user_dateofbirth_2i']")
	private WebElement Month;

	@FindBy(xpath = "//select[@id='user_dateofbirth_3i']")
	private WebElement Day;

	@FindBy(xpath = "//input[@id='licencetype_t']")
	private WebElement Full;

	@FindBy(xpath = "//select[@id='user_licenceperiod']")
	private WebElement LicencePeriod;

	@FindBy(xpath = "//select[@id='user_occupation_id']")
	private WebElement Occupation;

	@FindBy(xpath = "//input[@id='user_address_attributes_street']")
	private WebElement StreetAdress;

	@FindBy(xpath = "//input[@id='user_address_attributes_city']")
	private WebElement City;

	@FindBy(xpath = "//input[@id='user_address_attributes_county']")
	private WebElement Country;

	@FindBy(xpath = "//input[@id='user_address_attributes_postcode']")
	private WebElement PostCode;

	@FindBy(xpath = "//input[@id='user_user_detail_attributes_email']")
	private WebElement Email;

	@FindBy(xpath = "//input[@id='user_user_detail_attributes_password']")
	private WebElement Password;

	@FindBy(xpath = "//input[@id='user_user_detail_attributes_password_confirmation']")
	private WebElement ConfirmPassword;

	@FindBy(xpath = "//input[@name='submit']")
	private WebElement Create;

	WebDriver driver;

	// ---Initilization

	public RegisterUser_POM(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	// ---Utilization

	// ---Step 1 : Click on Register Button from Homepage
	public void ClickRegister() {
		Register.click();
	}

	// ---Step 2 : Select Title
	public void SelectTitle() {
		Select s1 = new Select(Title);
		s1.selectByVisibleText("Mr");
	}

	// ---Step 3 : Enter First Name
	public void EnterFirstName(String firstname) {
		FirstName.sendKeys(firstname);
	}

	// ---Step 4 : Enter SurName
	public void EnterSurName(String surname) {
		LastName.sendKeys(surname);
	}

	// ---Step 5 : Enter Phone Number
	public void EnterPhoneNumber(long phonenumber) {
		Phone.sendKeys(String.valueOf(phonenumber));
	}

	// ---Step 6 : Select Year
	public void SelectYear() {
		Select s2 = new Select(Year);
		s2.selectByVisibleText("1993");
	}

	// ---Step 7 : Select Month
	public void SelectMonth() {
		Select s3 = new Select(Month);
		s3.selectByVisibleText("February");
	}

	// ---Step 8 : Select Day
	public void SelectDay() {
		Select s4 = new Select(Day);
		s4.selectByVisibleText("21");
	}

	// ---Step 9 : Select Full or Provisional
	public void SelectFull() {
		Full.click();
	}

	// Step 10 : Select Lisence Period
	public void SelectLisencePeriod() {
		Select s5 = new Select(LicencePeriod);
		s5.selectByVisibleText("5");
	}

	// ---Step 11 : Select Occupation
	public void SelectOccupation() {
		Select s6 = new Select(Occupation);
		s6.selectByVisibleText("Engineer");
	}

	// ---Step 12 : Enter Street Adress
	public void EnterStreetAdress(String streetadress) {
		StreetAdress.sendKeys(streetadress);
	}

	// ---Step 13 : Enter City
	public void EnterCity(String city) {
		City.sendKeys(city);
	}

	// ---Step 14 : Enter Country
	public void EnterCountry(String country) {
		Country.sendKeys(country);
	}

	// ---Step 15 : Enter Post Code
	public void EnterPostCode(long postcode) {
		PostCode.sendKeys(String.valueOf(postcode));
	}

	// ---Step 16 : Enter Email
	public void EnterEmail(String email) {
		Email.sendKeys(email);
	}

	// ---Step 17 : Enter Password
	public void EnterPassword(String password) {
		Password.sendKeys(password);
	}

	// ---Step 18 : Enter Confirm Password
	public void EnterConfirmPassword(String confirmpassword) {
		ConfirmPassword.sendKeys(confirmpassword);
	}

	// ---Step 19 : Enter Create Button
	public void ClickCreateButton() {
		Create.click();
	}

}
