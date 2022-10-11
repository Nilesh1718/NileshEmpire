package com.saucedemo.testclass;


import org.testng.annotations.Test;

import com.saucedemo.pomclass.homepomclass;

public class TC05_Verifyfilterdropdown extends testbaseclass
{
		
	@Test
	public  void  Verifyfilterdropdown()
	   {
		  //validation
		homepomclass x=new homepomclass(driver);
		   x.clickdropdownfilter();

		   log.info("Applying validation");
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
