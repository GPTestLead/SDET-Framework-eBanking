package com.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AddCustomerPage {

	
	WebDriver ldriver;
	
	 public AddCustomerPage(WebDriver rdriver) {
		 ldriver = rdriver;
		 PageFactory.initElements(rdriver, this);
	}
	
	 
	 @FindBy(how=How.XPATH,using="//a[normalize-space()='New Customer']")
	 @CacheLookup
	 WebElement lnkAddNewCustomer;
	 
	 @FindBy(how=How.NAME,using="name")
	 @CacheLookup
	 WebElement txtCutomerName;
	 
	 @FindBy(how=How.NAME,using="rad1")
	 @CacheLookup
	 WebElement rdGender;
	 
	 @FindBy(how=How.NAME,using="dob")
	 @CacheLookup
	 WebElement txtdob;
	 
	 @FindBy(how=How.NAME,using="addr")
	 @CacheLookup
	 WebElement txtaddress;
	 
	 @FindBy(how=How.NAME,using="city")
	 @CacheLookup
	 WebElement txtcity;
	 
	 @FindBy(how=How.NAME,using="state")
	 @CacheLookup
	 WebElement txtstate;
	 
	 @FindBy(how=How.NAME,using="pinno")
	 @CacheLookup
	 WebElement txtpin;
	 
	 @FindBy(how=How.NAME,using="telephoneno")
	 @CacheLookup
	 WebElement txttelephone;
	 
	 @FindBy(how=How.NAME,using="emailid")
	 @CacheLookup
	 WebElement txtemailid;
	 
	 @FindBy(how=How.NAME,using="password")
	 @CacheLookup
	 WebElement txtpassword;
	 
	 @FindBy(how=How.NAME,using="sub")
	 @CacheLookup
	 WebElement btnSubmit;
	 
	 
	 //actions method
	 public void clickAddNewCustomer(String uname) 
	 {
		 lnkAddNewCustomer.click();
	}
	 
	 public void custName(String uname) 
	 {
		 
		 txtCutomerName.click();
	}
	 
	 public void gender(String uname) 
	 {
		 
		 rdGender.click();
	}
	 
	 public void custDOB(String uname) 
	 {
		 
		 txtdob.click();
	}
}


