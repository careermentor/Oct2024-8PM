package org.xyz.automation.proj;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class FetchDataRuntime 
{
	WebDriver driver;
	
	
	@Test
	public void validateactualvalexpval() throws Exception
	{
		
		driver= new ChromeDriver();
		
		String expURL = "https://www.facebook.com";
		
		driver.get(expURL);
		
		String actURL = driver.getCurrentUrl();
		System.out.println(actURL);
		
		//Assert.assertEquals(actURL, expURL); //hard assertion
		SoftAssert sa = new SoftAssert();  //Soft Assertion
		sa.assertEquals(actURL, expURL);
		
		System.out.println("this is print statement");
		
		CaptureScreenshot.screenresults(driver,"validateactualvalexpval1");
		
		
		String expTitleLoginPage = "Facebook – log in or sign up";
		
		String actTitleLoginPage = driver.getTitle();
		System.out.println(actTitleLoginPage);
		
		sa.assertEquals(actTitleLoginPage, expTitleLoginPage, "This title is not match");
		
		String Expusername_placeholder = "Email address or phone number";
		String actusername_placeholder = driver.findElement(By.id("email")).getAttribute("placeholder");
		System.out.println(actusername_placeholder);
		
		sa.assertEquals(actusername_placeholder, Expusername_placeholder);
		
		String Exp_login_Bttn = "Log in";
		String Act_login_Bttn = driver.findElement(By.name("login")).getText();
		System.out.println(Act_login_Bttn);
		sa.assertEquals(Act_login_Bttn, Exp_login_Bttn);
		
		Point login_loc = driver.findElement(By.name("login")).getLocation();
		System.out.println(login_loc);
		
		//System.out.println(driver.getPageSource());
		
		driver.close();
		
		sa.assertAll();
		
		CaptureScreenshot.screenresults(driver,"validateactualvalexpval2");
		
	}
	
	@Test
	public void testmeth()
	{
		System.out.println("this is test method");
	}
			
}
