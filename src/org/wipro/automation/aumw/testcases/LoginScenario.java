package org.wipro.automation.aumw.testcases;

import org.testng.annotations.Test;
import org.wipro.automation.aumw.basePkg.InitiateBrowser;
import org.wipro.automation.aumw.pages.LoginPage;

public class LoginScenario extends InitiateBrowser
{

	@Test
	public void tc01_validatvalidcrednt_loginfunct() throws Exception
	{
		LoginPage login = new LoginPage(driver);
		
		login.enter_username("user1");
		login.enter_password("pass1");
		login.click_loginbttn();
		
		//because "this.driver" is null
		
	}
	
}
