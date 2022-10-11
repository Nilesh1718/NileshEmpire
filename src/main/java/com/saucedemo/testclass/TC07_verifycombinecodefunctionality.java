package com.saucedemo.testclass;

import org.testng.annotations.Test;
import com.saucedemo.pomclass.homepomclass;

public class TC07_verifycombinecodefunctionality extends testbaseclass
{
	@Test
	   public  void verifyloginfunctionality() 
	   {
	   	//validation
			System.out.println("apply validation");
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
	@Test
	public  void verifymultipleelement() throws InterruptedException 
	   {
	    	
	    	
	   	homepomclass x=new homepomclass(driver);
	   	x.clickonmultiple();
	    		String expected="6";
				String actual=x.gettextfromaddtocart();
	    		System.out.println(actual);
	    		if(expected.equals(actual))
	    		{
	    			System.out.println("TEST CASE IS PASS..");
	    		}
	    		else
	    		{
	    			System.out.println("TEST CASE IS FAIL..");
	    		}
	   } 
	@Test
	public  void  Verifyfilterdropdown()
	   {
		  //validation
		homepomclass x=new homepomclass(driver);
		   x.clickdropdownfilter();

		System.out.println("Applying validation");
		String expected="https://www.saucedemo.com/";
	   String actual=driver.getCurrentUrl();
	   if(expected.equals(actual))
	   {
		   System.out.println("test case is passed");
	   }
	   else
	   {
		   System.out.println("test case is failed");
	   }
	   }
}
