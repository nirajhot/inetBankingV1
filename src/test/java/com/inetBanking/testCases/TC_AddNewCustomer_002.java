package com.inetBanking.testCases;

import org.testng.annotations.Test;

import com.inetBanking.pageObjects.AddCustomer;
import com.inetBanking.pageObjects.LoginPage;

public class TC_AddNewCustomer_002 extends BaseClass{

	@Test
	public void addNewCust(){
		driver.get(URL);
		//logger.info("Opening the URL :"+ URL);
		LoginPage lp=new LoginPage(driver);
		lp.setUserName(userName);
		//logger.info("Entering the test :"+ userName);
		lp.setPassword(password);
		//logger.info("Entering the test :"+ password);
		lp.clickSubmit();
		//logger.info("Clicking on Submit button");
		AddCustomer addCust=new AddCustomer(driver);
		addCust.clickNewCustomerLink();
		addCust.AddNewCustomer(customerName);
		addCust.DOBcustomer(customerDOBmm,customerDOBdd,customerDOByy);
		addCust.AddressNewCustomer(customerAddress);
		addCust.CityNewCustomer(customerCity);
		addCust.StateNewCustomer(customerState);
		addCust.PinNewCustomer(customerPin);
		addCust.NumberNewCustomer(customerMobile);
		addCust.EmailNewCustomer(customerEmail);
		addCust.PasswordNewCustomer(customerPassword);
		addCust.addnewCustomerSubmit();
		try {
			Thread.sleep(20000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}

