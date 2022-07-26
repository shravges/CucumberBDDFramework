package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage
{
	WebDriver driver;
	public By txtbxSearch = By.id("twotabsearchtextbox");	
	
	//@FindBy(id="nav-logo-sprites")
	//WebElement imgAmazon;
	
	//constructor
	public HomePage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void accessHomePage()
	{
		try
		{
		driver.get("https://www.amazon.in/");
		//Thread.sleep(5000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	
	public String getHomePageTitle()
	{
		return driver.getTitle();
	}
	
	public boolean checkAmazonImage()
	{
		return driver.findElement(By.id("nav-logo-sprites")).isDisplayed();
	}
	
	public SearchPage searchItem(String item)
	{
		driver.findElement(txtbxSearch).sendKeys(item);
		driver.findElement(txtbxSearch).sendKeys(Keys.ENTER);
		return new SearchPage(driver);
	}
	

}