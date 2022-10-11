package com.saucedemo.pomclass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpomclass 
{
	
	    //1
		public WebDriver driver;
		
		//2
		@FindBy(xpath ="//button[@id='react-burger-menu-btn']")
		public WebElement menubutton;
		//3
		public void clickMenuButton()
		{
			menubutton.click();
		}
		
		
		@FindBy(xpath = "//a[@id='logout_sidebar_link']")
		public WebElement logOutButton;
		
		 
		public void clickLogOutButton()
		{
			logOutButton.click();
		}
		
		
			
		
		
	    //4
		public loginpomclass(WebDriver driver)
		{
			this.driver=driver;
			PageFactory.initElements(driver, this);
			
		}
		
}
