package com.saucedemo.pomclass;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class homepomclass 
{
	//1.driver declaration
  public  WebDriver driver;
  //private Select s;
  public Actions act;
    //2 element find 
    @FindBy(xpath="//input[@id='user-name']")
    public WebElement username;
    
    //3 create method as per action on element 
    public void sendusername()
    {
    	username.sendKeys("standard_user");
    }
    
    @FindBy(xpath="//input[@id='password']")
    public WebElement pass;
    
    public void sendpass()
    {
    	pass.sendKeys("secret_sauce");
    }
    
    @FindBy(xpath="//input[@id='login-button']")
   public WebElement login;
//    public void clicklogin()
//    {
//    	login.click();
//    }
    //Or
    //with mouse action
    public void clicklogin()
    {
//    	Actions act=new Actions(driver);
    	act.click(login).perform();
    	
    }
    
    
    
    @FindBy(xpath="//button[@id='add-to-cart-sauce-labs-backpack']")
    public WebElement bagpack ;
    public void clickonbag()
    {
    	bagpack.click();
    }
    
    @FindBy(xpath="//a[@class='shopping_cart_link']")
    public WebElement addtocart ;
    public String gettextfromaddtocart()
    {
    	String totalproduct=addtocart.getText();
    	return totalproduct;
    }
  //button[text()='Add to cart']
    @FindBy(xpath="//button[text()='Add to cart']")
    public List<WebElement> multipleele  ;
    public void clickonmultiple()
    {
    	for(WebElement x:multipleele)
    	 {
    		 x.click();
    	 }
    }
    
    
    //4 create constructor
    public homepomclass(WebDriver driver)
    {
    	this.driver=driver;
    	PageFactory.initElements(driver,this);
//    	s= new Select(filter);
    	act=new Actions(driver);
    }
    @FindBy(xpath="//select[@class='product_sort_container']")
    public WebElement filter ;
    public void clickdropdownfilter()
    {
    	filter.click();
       Select s= new Select(filter);
    	s.selectByValue("hilo");
    	
    }


}
