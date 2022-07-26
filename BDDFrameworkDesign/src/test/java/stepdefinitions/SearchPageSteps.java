package stepdefinitions;

import com.qa.factory.DriverFactory;
import com.qa.pages.HomePage;
import com.qa.pages.SearchPage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchPageSteps 
{
		HomePage hp= new HomePage(DriverFactory.getDriver());
		SearchPage sp;
		
		@When("User enters search item {string}")
		public void user_enters_search_item(String searchItem) 
		{
		   sp= hp.searchItem(searchItem);
		    
		}

		@Then("Results shown for {string}")
		public void results_shown_for(String expectedTitleString)
		{
		   String actualTitle = sp.checkSearchResult();
		   if(actualTitle.contains(expectedTitleString))
		   {
			   System.out.println("Search result shown");
		   }
		   else
		   {
			   System.out.println("Search result not shown");
		   }
		}




}
