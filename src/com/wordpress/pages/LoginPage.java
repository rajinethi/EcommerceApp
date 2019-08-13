/**
 * 
 */
package com.wordpress.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * @author Ravikumar
 *
 */
public class LoginPage {
	WebDriver driver;
	
	By siginbutton = By.id("comp-jx8pl0hylin");
	By eid = By.name("email");
	By ein = By.name("emailConfirm");
	By pwd = By.name("password");
	By pwdin = By.name("passwordConfirm");
	By sb = By.name("passwordConfirm");
	
	
public LoginPage(WebDriver driver) 
{
	this.driver = driver;
}
	public void signin() 
	{
		driver.findElement(siginbutton).click();
		
	}
	
	public void emailid() 
	{
		driver.findElement(eid).sendKeys("raji.nethi@gmail.com");
	}
	
	public void emailagain()
	{
		driver.findElement(ein).sendKeys("raji.nethi@gmail.com");
	}
	
	public void password() {
		driver.findElement(pwd).sendKeys("Siri1234");
	}
	
	public void passwordagain()
	{
		driver.findElement(pwdin).sendKeys("Siri1234");
	}
	
	
	public void signup()
	{
		driver.findElement(sb).click();
	}
	
}
