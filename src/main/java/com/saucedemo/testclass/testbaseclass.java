package com.saucedemo.testclass;

import java.io.IOException;
import java.time.Duration;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.saucedemo.pomclass.homepomclass;
import com.saucedemo.utilityclasses.screenshotclass;

public class testbaseclass 
{
	 public WebDriver driver;
	 Logger log=Logger.getLogger("saucedemo1999");
	 @Parameters("browserName1")
	 @BeforeMethod
	 public void setUp(String browserName1) throws IOException 
	 {
        if(browserName1.equals("chrome"))
        {
		 System.setProperty("webdriver.chrome.driver",
		   			"./driverfiles\\chromedriver.exe");
		     driver= new ChromeDriver();
		     
		     PropertyConfigurator.configure("log4j.properties");
		     log.info("browser is opened");
        }
        else
        {
        	 System.setProperty("webdriver.edge.driver",
 		   			"./driverfiles\\msedgedriver.exe");
 		     driver= new EdgeDriver();
        }
          
            System.out.println("browser is opened..");
		   	driver.manage().window().maximize();
		   	log.info("browser is maximized");
		   	
		   	driver.get("https://www.saucedemo.com/");
		   	log.info("SauceDemo URL is opened");
			   	screenshotclass.screenshot7(driver);
	
		   	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		   	
		   	homepomclass x=new homepomclass(driver);
		   	x.sendusername();
		   	x.sendpass();
		   	x.clicklogin();
		   	screenshotclass.screenshot7(driver);
	 }
		   	
	        @AfterMethod
		   	public void teardown() 
		   	{
		   	  driver.close();
		   	  System.out.println("browser is closed");
		   	
	        }  
}
