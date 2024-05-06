package dsalgostepdefinitions;

import java.util.List;

import org.junit.Assert;

import dsalgodrivers.DriverFactory;
import dsalgopages.Homepage_pf;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;

public class Homepage_sd 
{
	Homepage_pf homePage = new Homepage_pf(DriverFactory.getDriver());
	@Given(": The user should be able to open the browser")
	public void the_user_should_be_able_to_open_the_browser() {
		System.out.println("Browser is opened");
	}

	@When(": The user enters the DS_Algo Portal  <URL>")
	public void the_user_enters_the_ds_algo_portal_url() {
		homePage.getUrl();
	}

	@Then(": The user should be landed on the DS_Algo Get Started page with message {string}")
	public void the_user_should_be_landed_on_the_ds_algo_get_started_page_with_message(String actual) {
		String expected = homePage.message();
		Assert.assertEquals(expected, actual); 
		System.out.println("Then Statement"); 
	}

	@When(": The user clicks the Get started button")
	public void the_user_clicks_the_get_started_button() {
		homePage.clickGetStarted();

	}

	@Then(": The user should land in Data Structure Introduction Page with {string} and {string} links")
	public void the_user_should_land_in_data_structure_introduction_page_with_and_links(String string, String string2) {
		DriverFactory.getDriver().navigate().to("https://dsportalapp.herokuapp.com/home");
		String register =homePage.registerLink();
		String signin = homePage.signinLink();	
		Assert.assertEquals(register, string);
		Assert.assertEquals(signin, string2);
	}


	@When(": The user clicks the data structure\"dropdown  arrow\"")
	public void the_user_clicks_the_data_structure_dropdown_arrow() {

		homePage.dropDown();
	}

	@Then(": The user should able to see {int} options Arrays in drop down section")
	public void the_user_should_able_to_see_options_arrays_in_drop_down_section(Integer int1, io.cucumber.datatable.DataTable dataTable) {
		int dropdownsize = homePage.dropDownMenuSize();	
		Assert.assertEquals(dropdownsize, 6);
		List<String> expdropdownlist = dataTable.asList();
		System.out.println("Expected Dropdown List :"+expdropdownlist);
		List<String> actualdropdownlist = homePage.dropDownList();		
		System.out.println("Actual Dropdown List :"+actualdropdownlist);
		Assert.assertTrue(expdropdownlist.containsAll(actualdropdownlist));

	}

	@When(": The user selects any data structures item from the drop down without Sign in.")
	public void the_user_selects_any_data_structures_item_from_the_drop_down_without_sign_in() {
		DriverFactory.getDriver().navigate().to("https://dsportalapp.herokuapp.com/home");
		homePage.clickDropdown();
		System.out.println("Clicked the LinkedList in Dropdown without signin");

	}

	@Then(": The user should able to see an warning message {string}")
	public void the_user_should_able_to_see_an_warning_message(String experrormsg) {
		homePage.clickDropdown();
		String actualerrorMessage = homePage.errorMSg();
		Assert.assertEquals(actualerrorMessage,experrormsg);

	}

	@When(": The user clicks any Get Started buttons of data structures  on the DS Introduction page")
	public void the_user_clicks_any_get_started_buttons_of_data_structures_on_the_ds_introduction_page() {
		DriverFactory.getDriver().navigate().to("https://dsportalapp.herokuapp.com/home");
		 homePage.clickDataStructures();
	}

	@Then(": The user should able to see the warning message {string}")
	public void the_user_should_able_to_see_the_warning_message(String experrormsg) {
		String actualerrormsg = homePage.errorMsg1();
		Assert.assertEquals(actualerrormsg, experrormsg);  

	}

	@When(": The user clicks Register link on the DS Introduction page")
	public void the_user_clicks_register_link_on_the_ds_introduction_page() {
		DriverFactory.getDriver().navigate().to("https://dsportalapp.herokuapp.com/home");
	}

	@Then(": The user should be redirected to Register form")
	public void the_user_should_be_redirected_to_register_form() {
		homePage.getRegisterPage();
	}

	@Then(": The user should able see message {string} at the bottom of the page")
	public void the_user_should_able_see_message_at_the_bottom_of_the_page(String expectedstring) {
		String actualstring = homePage.gettextLogin() ;	
		Assert.assertEquals(actualstring, expectedstring);

	}
}


