package com.testing.gmail.tests;

import org.openqa.selenium.WebDriver;

import com.testing.gmail.pages.LoginPage1;
import com.testing.gmail.utils.Helper;

public class TestCase1 {
	
	public static WebDriver driver;
	public static LoginPage1 lp1;
	
	public static void main(String[] args) {
		Helper helper = new Helper();
		driver = helper.driver("chrome");
		userNameCheck();
	}
	
	public static void login() {
		lp1 = new LoginPage1(driver);
		lp1.setUserName("pariinfanta1");
		lp1.clickNext();
	}
	
	public static void userNameCheck() {
		lp1= new LoginPage1(driver);
		lp1.setUserName("pariinfanta1");
		lp1.clickNext();
	}

}
