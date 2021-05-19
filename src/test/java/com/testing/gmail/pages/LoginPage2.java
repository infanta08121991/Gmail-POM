package com.testing.gmail.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage2 {

	WebDriver driver;

	public LoginPage2(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.XPATH, using = "//input[@type=\"password\"]")
	public WebElement passWord;

	@FindBy(how = How.XPATH, using = "//div[@class=\"VfPpkd-RLmnJb\"]")
	public WebElement nextButton;

	// Set password in textbox
	public void setPassWord(String userPassWord) {
		passWord.sendKeys("");
	}

	public void clickNext() {
		nextButton.click();
	}

}
