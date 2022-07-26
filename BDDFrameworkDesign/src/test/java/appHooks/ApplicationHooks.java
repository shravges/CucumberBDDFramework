package appHooks;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.qa.factory.DriverFactory;
import com.qa.utilities.ConfigReader;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class ApplicationHooks 
{
	private DriverFactory driverFactory;
	public WebDriver driver;
	private ConfigReader configReader;
	public Properties prop;
	
	@Before(order=0)
	public void setupProperties()
	{
		configReader = new ConfigReader();
		prop= configReader.initProperties();	
	}
	
	@Before(order=1)
	public void setupDriver()
	{	
		driverFactory = new DriverFactory();
		driver = driverFactory.initDriver(prop.getProperty("browser"));
		//driver.get(prop.getProperty("url"));
	}
	
	
	@After
	public void tearDown()
	{
		driver.quit();
	}

}
