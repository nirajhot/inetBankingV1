package com.inetBanking.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadConfig {

	Properties pro;
	FileInputStream fis;
	public ReadConfig(){
		File src=new File("./Configruation/config.properties");

		try {
			fis	=new FileInputStream(src);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}

		pro=new Properties();
		try {
			pro.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public String getURL(){
		String applicationURL=pro.getProperty("URL");
		return applicationURL;
	}
	
	public String getuserName(){
		String applicationuserName=pro.getProperty("userName");
		return applicationuserName;
	}
	
	public String getPassword(){
		String applicationPassword=pro.getProperty("password");
		return applicationPassword;
	}
	
	public String loadBrowser(){
		String applicationBrowser=pro.getProperty("browser");
		return applicationBrowser;
	}
	
	public String getdriver(){
		String applicationdriver=pro.getProperty("chromeDriverPath");
		return applicationdriver;
	}
	
	public String getCustomerName(){
		String applicationCustomerName=pro.getProperty("customerName");
		return applicationCustomerName;
	}
	
	public String getCustomerDOBmm(){
		String applicationCustomerDOBmm=pro.getProperty("customerDOBmm");
		return applicationCustomerDOBmm;
	}
	
	public String getCustomerDOBdd(){
		String applicationCustomerDOBdd=pro.getProperty("customerDOBdd");
		return applicationCustomerDOBdd;
	}
	
	public String getCustomerDOByy(){
		String applicationCustomerDOByy=pro.getProperty("customerDOByy");
		return applicationCustomerDOByy;
	}
	
	public String getCustomerAddress(){
		String applicationCustomerAddress=pro.getProperty("customerAddress");
		return applicationCustomerAddress;
	}
	
	public String getCustomerCity(){
		String applicationCustomerCity=pro.getProperty("customerCity");
		return applicationCustomerCity;
	}
	
	public String getCustomerState(){
		String applicationCustomerState=pro.getProperty("customerState");
		return applicationCustomerState;
	}
	
	public String getCustomerPin(){
		String applicationCustomerPin=pro.getProperty("customerPin");
		return applicationCustomerPin;
	}
	
	public String getCustomerMobile(){
		String applicationCustomerMobile=pro.getProperty("customerMobile");
		return applicationCustomerMobile;
	}
	
	public String getCustomerEmail(){
		String applicationCustomerEmail=pro.getProperty("customerEmail");
		return applicationCustomerEmail;
	}
	
	public String getCustomerPassword(){
		String applicationCustomerPassword=pro.getProperty("customerPassword");
		return applicationCustomerPassword;
	}
	
}
