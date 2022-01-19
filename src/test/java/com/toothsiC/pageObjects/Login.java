package com.toothsiC.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	//create constructor, In order to get the driver instance from the Main class and Initialize the webElement
	public Login(WebDriver driver) {
		PageFactory.initElements(driver, this);
		}
	@FindBy(name = "mobile")
	 WebElement untxtfield;
	
	@FindBy(name = "password")
	 WebElement passwordtxt;
	
	@FindBy(xpath = "//span[contains(.,'continue')]")
	 WebElement continuebutton;

	@FindBy(name = "otp")
	 WebElement otpfield;

	public void setusername(String uname) {
		untxtfield.sendKeys(uname);
	}
	public void setpassword(String password) {
		passwordtxt.sendKeys(password);
	}
	public void clickContinue() {
		continuebutton.click();
	}
	public void setotp(String otp) {
		otpfield.sendKeys(otp);
	}
	
}
