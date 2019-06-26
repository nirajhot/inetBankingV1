package com.inetBanking.testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetBanking.pageObjects.LoginPage;


public class TC_LoginTest_001 extends BaseClass {

	@Test
	public void loginTest(){
		driver.get(URL);
		//logger.info("Opening the URL :"+ URL);
		LoginPage lp=new LoginPage(driver);
		lp.setUserName(userName);
		//logger.info("Entering the test :"+ userName);
		lp.setPassword(password);
		//logger.info("Entering the test :"+ password);
		lp.clickSubmit();
		//logger.info("Clicking on Submit button");
	}

}
