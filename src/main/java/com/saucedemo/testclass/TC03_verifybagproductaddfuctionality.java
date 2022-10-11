package com.saucedemo.testclass;


import java.io.IOException;

import org.testng.annotations.Test;

import com.saucedemo.pomclass.homepomclass;
import com.saucedemo.utilityclasses.screenshotclass;

public class TC03_verifybagproductaddfuctionality extends testbaseclass 
{ 
	
	@Test
	public void verifybagproductaddfuctionality() throws IOException   
	   {
		homepomclass y=new homepomclass(driver);
		y.clickonbag();
	   	screenshotclass.screenshot7(driver);

	    		String expectedproduct="1";
	    		String actualproduct=y.gettextfromaddtocart();
	    		log.info(actualproduct);
	    		if(expectedproduct.equals(actualproduct))
	    		{
	    			System.out.println("pass");
	    		}
	    		else
	    		{
	    			System.out.println("fail");
	    		}
      }	
}