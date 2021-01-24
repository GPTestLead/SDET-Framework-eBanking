package com.testCases;

import java.io.IOException;

import org.apache.commons.lang3.RandomStringUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.pageObjects.AddCustomerPage;
import com.pageObjects.BaseClass;
import com.pageObjects.LoginPage;

@Test
public class TC_AddCustomerTest_003 extends BaseClass{

	public  void addNewCustomer() throws InterruptedException, IOException
	{
		LoginPage lp = new LoginPage(driver);
		lp.setUserName(userName);
		lp.setPassword(password);
		lp.clickSubmit();
		
		Thread.sleep(3000);
		
		
		AddCustomerPage addcust = new AddCustomerPage (driver);
		addcust.clickAddNewCustomer();
		addcust.custName("Garvita");
		addcust.gender("Female");
		addcust.custDOB("30", "03", "1984");
		addcust.custaddress("India");
		addcust.custcity("Ahd");
		addcust.custstate("GJ");
		addcust.custpin("380061");
		addcust.custtelephoneno("3432434");
		String email =randomstring()+"@gmail.com";
		addcust.custemailid(email);
		addcust.custepassword("sdsadsa");
		addcust.btnSubmit();
		
		Thread.sleep(3000);
		
		boolean res=driver.getPageSource().contains("Customer Registered successfully!!");
		if (res==true) {
			Assert.assertTrue(true);
		}
		else {
			captureScreen(driver, "addNewCustomer");
			Assert.assertTrue(false);
		}
	}
	
	
	//to create random email 
	public String randomstring() {
		String generatedstring=RandomStringUtils.randomAlphabetic(8);
		return(generatedstring);
		
	}
}
