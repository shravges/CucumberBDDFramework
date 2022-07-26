package com.qa.pages;

import org.openqa.selenium.WebDriver;

public class SearchPage 
{
	WebDriver driver;
	public SearchPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public String checkSearchResult()
	{
		return driver.getTitle();
	}
	
	
	
}
