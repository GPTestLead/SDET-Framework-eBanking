package com.testCases;

import org.openqa.selenium.NoAlertPresentException;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.pageObjects.BaseClass;
import com.pageObjects.LoginPage;

import freemarker.core.ReturnInstruction.Return;


public class TC_LoginDDT_002 extends BaseClass{

	
	@Test(dataProvider="LoginData")
	public void loginDDT()
	{
		LoginPage lp = new LoginPage(driver);
		lp.setUserName(userName);
		lp.setPassword(password);
		lp.clickSubmit();
		
		if(isAlertPresent()==true)
				{
			driver.switchTo().alert().accept();
			driver.switchTo().defaultContent();
			Assert.assertTrue(false);
				}
		else {
			Assert.assertTrue(true);
			lp.clickLogout();
			driver.switchTo().alert().accept();
			driver.switchTo().defaultContent();
		     }
	}
	
	//user defined method - to check alert present  or not
	public boolean isAlertPresent()
	{
		try {
			driver.switchTo().alert();
			return true;
		} 
		catch (NoAlertPresentException e) {
		return false;
		}
		
	}
	
	@DataProvider(name="LoginData")
	getData()
	{
		
	}
	return logindata;
}
