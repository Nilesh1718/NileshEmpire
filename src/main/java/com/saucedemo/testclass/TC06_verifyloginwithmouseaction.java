package com.saucedemo.testclass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.saucedemo.pomclass.homepomclass;

public class TC06_verifyloginwithmouseaction 
{
	@Test
	public void verifyloginwithmouseaction ()
	   {
		   System.setProperty("webdriver.chrome.driver",
	   			"C:\\Selenium Lib\\Chrome Driver\\chromedriver.exe");
	   	WebDriver driver= new ChromeDriver();
	   	System.out.println("browser is opened");
	   	
	   	driver.manage().window().maximize();
	   	System.out.println("browser is maximized");
	   	
	   	driver.get("https://www.saucedemo.com/");
	   	System.out.println("SauceDemo URL is opened");
			
	   	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	   	
	   	homepomclass x=new homepomclass(driver);
	   	x.sendusername();
	   	x.sendpass();
	   	x.clicklogin();
      }
}