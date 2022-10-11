package com.saucedemo.testclass;

import java.io.IOException;

import org.testng.annotations.Test;

import com.saucedemo.utilityclasses.screenshotclass;

public class TC01_verifyloinfunctionality extends testbaseclass
{
	@Test
   public  void verifyloginfunctionality() throws IOException 
   {
	   	screenshotclass.screenshot7(driver);

   	//validation
	   	log.info("apply validation");
   	String expectedtitle="Swag Labs";
   	String actualtitle= driver.getTitle();
   	if(expectedtitle.equals(actualtitle))
   	{
   		System.out.println("Test case is pass..");
   	}
   	else
   	{
   		System.out.println("test case is fail");
   	}
   }
}
