package demoTestNG;

import java.util.Calendar;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestScenario 
{

	@Test
	public void first_testcase()
	{
		System.out.println("this is first test case");
		Assert.assertEquals("Hello world", "Hello");
	}
	
	@Test
	public void second_testcase()
	{
		System.out.println("this is second test case");
		Assert.assertEquals(false, true);
		
	}
	
	@Test(groups="Smoke")
	public void third_testcase()
	{
		System.out.println("this is third test case");
		
	}
	
	@Test(groups="Sanity")
	public void forth_testcase()
	{
		System.out.println("this is forth test case");
		
	}
	
	@Test
	public void fifth_testcase()
	{
		System.out.println("this is fifth test case");
		
	}
	
	@Test(groups="Regression")
	public void sixth_testcase()
	{
		System.out.println("this is sixth test case");
		
	}
	
	@Test
	public void seventh_testcase()
	{
		System.out.println("this is seventh test case");
		
		Calendar cal = Calendar.getInstance();
		cal.getTime();
		String cal1 = cal.getTime().toString().replace(" ", "");
		System.out.println(cal1);
	}
	
}
