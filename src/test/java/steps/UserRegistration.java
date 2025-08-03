package steps;


	import cucumber.api.java.en.Given;
	import cucumber.api.java.en.When;
import pages.HomePage;
import pages.UserRegistrationPage;
import tests.TestBase;
import cucumber.api.java.en.Then;

import org.testng.Assert;

import cucumber.api.PendingException;

	public class UserRegistration extends TestBase{
		
		HomePage homeObject;
		UserRegistrationPage registerObject;

	    @Given("^the user in the home page$")
	    public void the_user_in_the_home_page1() throws Throwable {
	     homeObject = new HomePage(driver);
	     homeObject.openRegistrationPage();
	    }

	    @When("^I click on register link$")
	    public void i_click_on_registerlink1() {
	         Assert.assertTrue(driver.getCurrentUrl().contains("register"));	   
	         }
	
	   /* @When("^I entered the user data$")
	    public void i_entered_the_user_data1()   {
	    registerObject= new UserRegistrationPage(driver);
	    registerObject.userRegistration("Moataz", "nabil", "moataz@test.gmail", "123445678");
	    }
	    */
	    
	    @When("^I entered \"firstname\", \"lastname\" , \"email\" , \"password\"")
	    public void i_entered(String firstname ,String lastname ,String email ,String password)   {
	    	registerObject= new UserRegistrationPage(driver);
		    registerObject.userRegistration(firstname,lastname,email,password);
	    }

	    @Then("^the registration page displayed successfully$")
	    public void the_registration_page_displayed_successfully1()  {
	       registerObject.userLogout();
	    }
	    @Given("^the user in the home page$")
	    public void the_user_in_the_home_page() {
	        System.out.println("User is on the home page");
	    }

	     

}
