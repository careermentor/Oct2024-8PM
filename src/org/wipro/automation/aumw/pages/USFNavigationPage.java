package org.wipro.automation.aumw.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.wipro.automation.aumw.utilitiesPkg.ReadPropFiles;

public class USFNavigationPage 
{
	WebDriver driver;  //global

	public USFNavigationPage(WebDriver driver)  //local variable
	{
		this.driver=driver;
		
	}

	public void click_exploreparks() throws Exception
	{
		driver.findElement(By.xpath(ReadPropFiles.readelement("home_exploreparks_xpath"))).click();
	}
	
	public void click_usflink() throws Exception
	{
		driver.findElement(By.xpath(ReadPropFiles.readelement("home_submenu_usf_xpath"))).click();
	}
	
}
