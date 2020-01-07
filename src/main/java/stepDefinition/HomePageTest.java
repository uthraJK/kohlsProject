package stepDefinition;

import org.junit.After;
import org.junit.Assert;

import Object.HomePageObj;
import cucumber.api.java.Before;
import cucumber.api.java.en.*;

public class HomePageTest {

	HomePageObj hp;

	public HomePageTest() {
		hp = new HomePageObj();
	}

	@Given("^user navigates to the Kohls application$")
	public void user_navigates_to_the_Kohls_application() throws Throwable {
		hp = new HomePageObj();
	}

	@When("^user enters the product description \"([^\"]*)\"$")
	public void user_enters_the_product_description(String arg1) throws Throwable {
		hp.enterProductSearchTextBox(arg1);
	}

	@When("^clicks on search$")
	public void clicks_on_search() throws Throwable {
		hp.clickSearchIcon();

	}

	@Then("^User should be navigated to the search results page$")
	public void user_should_be_navigated_to_the_search_results_page() throws Throwable {
		//Assert.assertTrue(hp.displaycountofSearchResults() > 0);
		//Assert.assertNotNull();
		hp.displaycountofSearchResults();
		//System.out.println(hp.displaycountofSearchResults());
		hp.navigateToHomePage();
	}

	@When("^user clicks on shop by department$")
	public void user_clicks_on_shop_by_department() throws Throwable {

		hp.clickshopByDepartment();
	}

	@When("^user selects the \"([^\"]*)\"$")
	public void user_selects_the(String arg1) throws Throwable {
		if (arg1.equalsIgnoreCase("Men")) {
			hp.selectShopByDepartmentMen();
		} else if (arg1.equalsIgnoreCase("Women")) {
			hp.selectShopByDepartmentWomen();
		}
		else if (arg1.equalsIgnoreCase("Kids")) {
			hp.selectShopByDepartmentKids();
		}
		else if (arg1.equalsIgnoreCase("Baby")) {
			hp.selectShopByDepartmentBaby();
		}
		else   {
			hp.selectShopByDepartmentToys();
		}
			}

	@Then("^user should be navigated to the \"([^\"]*)\" page$")
	public void user_should_be_navigated_to_the_page(String arg1) throws Throwable {
		if (arg1.equalsIgnoreCase("Men")) {
			Assert.assertTrue(hp.getTitle().contains(arg1));
		} else if (arg1.equalsIgnoreCase("Women")) {
			Assert.assertTrue(hp.getTitle().contains(arg1));
		}
		else if (arg1.equalsIgnoreCase("Kids")) {
			Assert.assertTrue(hp.getTitle().contains(arg1));
		}
		else if (arg1.equalsIgnoreCase("Baby")) {
			Assert.assertTrue(hp.getTitle().contains(arg1));
		}
		else   {
			Assert.assertTrue(hp.getTitle().contains(arg1));
		}
		
		
	}
	@After
	public void homeScreen()
	{
		hp.navigateToHomePage();
	}
	

}
