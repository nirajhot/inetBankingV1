package com.inetBanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddCustomer {

		WebDriver ldriver;

		public AddCustomer(WebDriver rdriver){
			ldriver=rdriver;
			PageFactory.initElements(rdriver,this);
		}
		
		@FindBy(xpath="/html/body/div[3]/div/ul/li[2]/a")
		WebElement lnkAddNewCustomer;
		
		@FindBy(name="name")
		WebElement txtCustomerName;
		
		@FindBy(name="rad1")
		WebElement radioGender;
		
		@FindBy(name="dob")
		WebElement customerDOB;
				
		@FindBy(name="addr")
		WebElement txtCustomerAddress;
		
		@FindBy(name="city")
		WebElement txtCustomerCity;
		
		@FindBy(name="state")
		WebElement txtCustomerState;
		
		@FindBy(name="pinno")
		WebElement txtCustomerpinno;
		
		@FindBy(name="telephoneno")
		WebElement txtCustomerNumber;
		
		@FindBy(name="emailid")
		WebElement txtCustomerEmailID;
		
		@FindBy(name="password")
		WebElement txtCustomerPassword;
		
		@FindBy(name="sub")
		WebElement btnAddNewCustomerSubmit;
		
		public void clickNewCustomerLink(){
			lnkAddNewCustomer.click();
		}
		
		public void AddNewCustomer(String cName){
			txtCustomerName.sendKeys(cName);
		}
			
		public void Gendercustomer(){
			radioGender.click();
		}
		
		public void DOBcustomer(String mm, String dd, String yy){
			customerDOB.sendKeys(mm);
			customerDOB.sendKeys(dd);
			customerDOB.sendKeys(yy);
		}
		
		public void AddressNewCustomer(String cAddress){
			txtCustomerAddress.sendKeys(cAddress);
		}
		
		public void CityNewCustomer(String cCity){
			txtCustomerCity.sendKeys(cCity);
		}
		
		public void StateNewCustomer(String cState){
			txtCustomerState.sendKeys(cState);
		}
		
		public void PinNewCustomer(String cPin){
			txtCustomerpinno.sendKeys(cPin);
		}
		
		public void NumberNewCustomer(String cMobileNumber){
			txtCustomerNumber.sendKeys(cMobileNumber);
		}
		
		public void EmailNewCustomer(String cEmail){
			txtCustomerEmailID.sendKeys(cEmail);
		}
		
		public void PasswordNewCustomer(String cPassword){
			txtCustomerPassword.sendKeys(cPassword);
		}
		
		public void addnewCustomerSubmit(){
			btnAddNewCustomerSubmit.click();
		}
}
