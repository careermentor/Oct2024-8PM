package org.wipro.automation.aumw.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage_PF 
{
	WebDriver driver;  //global

	public LoginPage_PF(WebDriver driver)  //local variable
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	//@FindBy(how=How.ID, using="email")
	//WebElement enter_username();
	
}
