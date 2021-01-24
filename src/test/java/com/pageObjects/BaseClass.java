package com.pageObjects;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.utilities.ReadConfig;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	
	ReadConfig readconfig = new ReadConfig();
	
	public String baseURL = readconfig.getApplicationURL();
	public String userName = readconfig.getPassword();
	public	String password = readconfig.getPassword();
	
	
	public static WebDriver driver;
	public static Logger logger;
	
	@Parameters("browser")
	@BeforeClass
	public void setup(String br) 
	{
		
		 if(br.equalsIgnoreCase("chrome"))
		 {
			 WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		 }
		  
		 else if (br.equalsIgnoreCase("edge")) 
		 {
			 WebDriverManager.edgedriver().setup();
			 driver = new EdgeDriver();
		}
		 //for logs
		  //logger = Logger.getLogger("ebanking");
		 // PropertyConfigurator.configure("Log4j.properties");
		 driver.get(baseURL);
	}
	
	
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	
	
	public void captureScreen(WebDriver driver,String tname) throws IOException
	{
		TakesScreenshot ts = (TakesScreenshot )driver;
		
		File source =ts.getScreenshotAs(OutputType.FILE);
		File target = new File("C:\\Users\\Garvita\\Selenium\\Projects\\SDET-Framework-eBanking\\Screenshots"+tname+".png");
		FileUtils.copyFile(source, target);
		System.out.println("Screenshot taken");
	}
}
