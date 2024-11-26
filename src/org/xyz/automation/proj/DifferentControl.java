package org.xyz.automation.proj;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class DifferentControl 
{
	WebDriver driver;
	
	
	@Test
	public void differentwebcontrol() throws Exception
	{
		
		int a = 20;
		
		String name = "Java";
		
		driver= new ChromeDriver();
		driver.get("https://thetestingworld.com/testings/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
		WebElement b = driver.findElement(By.name("fld_username"));
		b.sendKeys("selenium");
		
		driver.findElement(By.id("datepicker")).sendKeys("07/18/1981");
		
		driver.findElement(By.xpath("//a[text()='18']")).click();
		
		driver.findElement(By.cssSelector("[value='home']")).click();
		
		
		
		Select gen = new Select(driver.findElement(By.name("sex")));
		gen.selectByVisibleText("Male");
		
		Select con = new Select(driver.findElement(By.name("country")));
		con.selectByVisibleText("United States");
		
		Select st = new Select(driver.findElement(By.name("state")));
		
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		//wait.until(ExpectedConditions.textToBePresentInElement(driver.findElement(By.id("stateId")), "Arizona"));
		st.selectByVisibleText("Florida");
		
		/*
		boolean x = driver.findElement(By.name("terms")).isSelected();
		System.out.println(x);  //false
		driver.findElement(By.name("terms")).click();
		boolean y = driver.findElement(By.name("terms")).isSelected();
		System.out.println(y);  //true
		
		//driver.findElement(By.className("displayPopup")).click();
		
		//driver.findElement(By.className("close")).click();
		
		//boolean z = driver.findElement(By.xpath("//input[@value='Sign up']")).isEnabled();
		//System.out.println(z);
		 * */
		 
		CaptureScreenshot.screenresults(driver,"differentwebcontrol");
		
	}
}
