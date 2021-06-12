package stepdefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import Pages.LoginPagePOM;
import Util.BrowserfactoryPOM;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class LoginPOMStepdef {	
	WebDriver driver;
	LoginPagePOM loginpagepom;

	@Before
	public void initializeBrowser() {
		driver = BrowserfactoryPOM.launchBrowser();
		loginpagepom = PageFactory.initElements(driver, LoginPagePOM.class);
	}

	@Given("^User should be on techfios login page$")
	public void user_should_be_on_techfios_login_page() throws Throwable {
	    driver.get("https://techfios.com/billing/?ng=login");
	}

	@When("^User enter \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enter_and(String username, String password) throws Throwable {
	    loginpagepom.enterUserCredentials(username, password);
	}

	@And("^User clicks on signin button$")
	public void user_clicks_on_signin_button() throws Throwable {
		loginpagepom.clickSiginButton();
	}
	

	@Then("^User should land on Dashboard Page$")
	public void user_should_land_on_Dashboard_Page() throws Throwable {
		loginpagepom.verifyDashBoardPage();
		Thread.sleep(3000);

	}
	

	@After		
		public void tearDown() {
			driver.close();
			driver.quit();
		}
	
	

}
