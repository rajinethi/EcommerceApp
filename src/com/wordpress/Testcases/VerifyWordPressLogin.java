package com.wordpress.Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.wordpress.pages.LoginPage;


public class VerifyWordPressLogin {
	@Test
	public void VerifyValidLogin()
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.wix.com/");
		LoginPage lp = new LoginPage(driver);
		lp.signin();
		lp.emailid();
		lp.emailagain();
		lp.password();
		lp.passwordagain();
		lp.signup();
		
		
		
		
		
		
	}
	

}
