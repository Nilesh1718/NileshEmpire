package com.saucedemo.utilityclasses;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class screenshotclass 
{
     public static void screenshot7(WebDriver driver) throws IOException
     {
    	 Date d =new Date();
 		DateFormat d1= new SimpleDateFormat("DD-MM-YY&HH-MM-SS");
 		String date=d1.format(d);
 		
 		
 		TakesScreenshot ss=(TakesScreenshot)driver;
 		File selefile=ss.getScreenshotAs(OutputType.FILE);
 		File myfile =new File("./screenshotfolder/saucedemoS"+date+ ".jpg");
 		FileHandler.copy(selefile, myfile);
 	
     }
}
