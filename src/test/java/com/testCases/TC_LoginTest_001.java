package com.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.pageObjects.BaseClass;
import com.pageObjects.LoginPage;

public class TC_LoginTest_001 extends BaseClass
   {
     @Test
	public void loginTest() throws InterruptedException, IOException 
     {
    	 
    	 
    	 //logger.info("URL is opened");
    	 LoginPage lp = new LoginPage(driver);
    	 lp.setUserName(userName);
    	 //logger.info("Entered username");
    	 
    	 //logger.info("Entered password");
    	 lp.setPassword(password);
    	 
    	 lp.clickSubmit();
    	 Thread.sleep(4000);
    	 
    	 if(driver.getTitle().equalsIgnoreCase("Guru99 Bank Manager Homepage"))
    	 {
    		 Assert.assertTrue(true);
    		 //logger.info("Login test passed");
    	 }
    	 else 
    		 {
    			captureScreen(driver,"loginTest") ;
    		 Assert.assertTrue(false);
    			 //logger.info("Login test failed");
    		 }
		}
     }
     
   

