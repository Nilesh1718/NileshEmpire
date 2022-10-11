package com.saucedemo.testclass;

import java.io.IOException;

import org.testng.annotations.Test;

import com.saucedemo.pomclass.homepomclass;
import com.saucedemo.utilityclasses.screenshotclass;

public class TC04_verifymultipleelement extends testbaseclass
{	
	@Test
	public  void verifymultipleelement() throws InterruptedException, IOException 
	   {
	    	
	    	
	   	homepomclass x=new homepomclass(driver);
	   	x.clickonmultiple();
	   	screenshotclass.screenshot7(driver);

	    		String expected="6";
				String actual=x.gettextfromaddtocart();
				log.info(actual);
	    		if(expected.equals(actual))
	    		{
	    			System.out.println("TEST CASE IS PASS..");
	    		}
	    		else
	    		{
	    			System.out.println("TEST CASE IS FAIL..");
	    		}
	   } 
	
}
