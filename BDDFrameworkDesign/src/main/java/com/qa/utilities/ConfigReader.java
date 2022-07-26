package com.qa.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader 
{
	private Properties prop;
	
	public Properties initProperties()
	{
		try
		{
			prop = new Properties();
			FileInputStream ip = new FileInputStream("C:\\BDDFrameworkDesignPractice\\BDDFrameworkDesign\\src\\test\\resources\\config\\config.properties");
			prop.load(ip);
		}
		catch(FileNotFoundException e)
		{
		e.printStackTrace();	
		}
		catch(IOException e)
		{
		e.printStackTrace();	
		}
		return prop;
	}
	

}	
