package com.saucedemo.testclass;

import java.io.IOException;

import org.testng.annotations.Test;

import com.saucedemo.pomclass.loginpomclass;
import com.saucedemo.utilityclasses.screenshotclass;

public class TC02_verifylogoutfunctionality extends testbaseclass 
	{
		@Test
	   public  void verifylogoutfunctionality() throws IOException
	   {
			loginpomclass lg= new loginpomclass(driver);
			lg.clickMenuButton();
            lg.clickLogOutButton();	
            screenshotclass.screenshot7(driver);
            log.info("apply the validation");
	    			
	    		   String expectedTitle = "Swag Labs";    //dev/BA
	    			
	    		   String actualTitle = driver.getTitle();
	    		
	    		   if(expectedTitle.equals(actualTitle))
	    		   {
	    			   System.out.println("login functionality test case is passed");
	    		   }
	    		   else
	    		   {
	    			   System.out.println("login functionality test case is failed");
	    		   }
	   }
}