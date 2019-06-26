package com.inetBanking.testCases;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.inetBanking.utilities.ReadConfig;


public class BaseClass {

	ReadConfig readConfig=new ReadConfig();

	public String URL=readConfig.getURL();
	public String userName=readConfig.getuserName();
	public String password=readConfig.getPassword();
	public static WebDriver driver;
	public String pageTitle=" Guru99 Bank Manager HomePage ";
	//public static Logger logger;
	public String customerName=readConfig.getCustomerName();
	public String customerDOBmm=readConfig.getCustomerDOBmm();
	public String customerDOBdd=readConfig.getCustomerDOBdd();
	public String customerDOByy=readConfig.getCustomerDOByy();
	public String customerAddress=readConfig.getCustomerAddress();
	public String customerCity=readConfig.getCustomerCity();
	public String customerState=readConfig.getCustomerState();
	public String customerPin=readConfig.getCustomerPin();
	public String customerMobile=readConfig.getCustomerMobile();
	public String customerEmail=readConfig.getCustomerEmail();
	public String customerPassword=readConfig.getCustomerPassword();
	
	@BeforeClass
	public void setUp(){

		if(readConfig.loadBrowser().equals("chrome")){
			System.setProperty("webdriver.chrome.driver", readConfig.getdriver());
			driver=new ChromeDriver();
		}else{
			/*System.setProperty("webdriver.gecko.driver", readConfig.getdriver());
			driver=new ChromeDriver();*/
		}
		//Logger logger=Logger.getLogger("eBanking");
		//PropertyConfigurator.configure("Log4j.properties");
		//logger.info(driver +" initaited");
		driver.manage().window().maximize();
		//logger.info("Window is getting maximized");


	}

	@AfterClass
	public void tearDown(){
		driver.quit();	
	}
}

