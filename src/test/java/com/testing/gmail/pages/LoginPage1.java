package com.testing.gmail.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage1 {

	WebDriver driver;
	
	public LoginPage1(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.XPATH, using = "//input[@type='email']")
	public WebElement emailID;

	@FindBy(how = How.XPATH, using = "//div[@class=\"VfPpkd-RLmnJb\"]")
	public WebElement nextButton;

	// Set user name in textbox
	public void setUserName(String strUserName) {
		emailID.sendKeys(strUserName);
	}

	public void clickNext() {
		nextButton.click();
	}
}
