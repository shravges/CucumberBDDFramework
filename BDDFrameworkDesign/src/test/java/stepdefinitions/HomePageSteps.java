package stepdefinitions;

import com.qa.factory.DriverFactory;
import com.qa.pages.HomePage;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class HomePageSteps {
	HomePage hp = new HomePage(DriverFactory.getDriver());
		
	@Given("User is on home page")
	public void user_is_on_home_page() 
	{
		hp.accessHomePage();
		System.out.println("Landed on home page");
	}

	@Then("title should be displayed {string}")
	public void title_should_be_displayed(String homePageTitle)
	{
		String pageTitle = hp.getHomePageTitle();
		System.out.println("Page title = " +pageTitle);
		assertEquals(homePageTitle,pageTitle);
	}
	
	@Then("amazon image should be displayed")
	public void amazon_image_should_be_displayed() {
	   boolean imageResult = hp.checkAmazonImage();
	   assertTrue(imageResult);
	}
	
}
