package org.wipro.automation.aumw.testcases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.wipro.automation.aumw.basePkg.InitiateBrowser;
import org.wipro.automation.aumw.dataGenerators.TestDataGenerator;
import org.wipro.automation.aumw.pages.LoginPage;
import org.wipro.automation.aumw.pages.USFNavigationPage;

public class USFScenario extends InitiateBrowser
{

	@Test
	public void tc0002_Validate_USF_Navigation() throws Exception
	{
		USFNavigationPage usf = new USFNavigationPage(driver);
		usf.click_exploreparks();
		usf.click_usflink();
		
		
	}
	
	
	
	
}
