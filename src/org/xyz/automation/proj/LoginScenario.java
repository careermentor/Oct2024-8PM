package org.xyz.automation.proj;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginScenario 
{
	WebDriver driver;
	
	
	@BeforeMethod
	public void launchBrowser()
	{
		
		driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
	}
	
	@AfterMethod
	public void closeBrowser()
	{
		//driver.close();
	}
	
	
	@Test(enabled=true)
	public void validate_signup_functionality()
	{
		
		
		driver.findElement(By.linkText("Create new account")).click();
		
		driver.findElement(By.name("firstname")).sendKeys("John");
		
		driver.findElement(By.xpath("//label[text()='Male']")).click();
		
		driver.findElement(By.name("websubmit")).click();
		
		
		
	}

	@Test
	public void validate_login_functionality()
	{
		driver.findElement(By.id("email")).sendKeys("modisantosh1@gmail.com");
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys("user1@gmail.com");
		
		//driver.findElement(By.name("pass")).sendKeys("pas12345");
		//driver.findElement(By.cssSelector("[type='submit']")).click();
		
	}	
}
