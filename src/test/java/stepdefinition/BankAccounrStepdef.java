package stepdefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import Pages.BankAccountPage;
import Util.BrowserfactoryPOM;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BankAccounrStepdef {

	WebDriver driver;
	BankAccountPage bankacount;

	@Before
	public void initializeBrowser() {
		driver = BrowserfactoryPOM.launchBrowser();
		bankacount = PageFactory.initElements(driver, BankAccountPage.class);
	}

	@Given("^User should be on techfios login page first and create an account$")
	public void user_should_be_on_techfios_login_page_first_and_create_an_account() throws Throwable {
		driver.get("https://techfios.com/billing/?ng=login");

	}

	@When("^User enter their \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enter_their_and(String username, String password) throws Throwable {
		bankacount.enterUserCredentials(username, password);

	}

	@When("^User clicks on signin button on the page$")
	public void user_clicks_on_signin_button_on_the_page() throws Throwable {
		bankacount.clickSiginButton();
	}

	@Then("^User should be verified land on Dashboard Page$")
	public void user_should_be_verified_land_on_Dashboard_Page() throws Throwable {
		bankacount.verifyDashBoardPage();

	}

	@When("^User click on Bank and Cash tab$")
	public void user_click_on_Bank_and_Cash_tab() throws Throwable {
		bankacount.clickOnBankAndCash();

	}

	@When("^User click on New Account tab$")
	public void user_click_on_New_Account_tab() throws Throwable {
		bankacount.clickonNewAccount();

	}

	@Then("^User Should verify and land on NewAccount Page$")
	public void user_Should_verify_and_land_on_NewAccount_Page() throws Throwable {
		bankacount.verifyNewAccountdPage();

	}

	@When("^User typein the \"([^\"]*)\"and\"([^\"]*)\"and (\\d+) and (\\d+) and \"([^\"]*)\" and (\\d+) and \"([^\"]*)\"$")
	public void user_typein_the_and_and_and_and_and_and(String accountTitle, String description, int initialBalance,
			int accountNumber, String contactPerson, int phone, String interBankingUrl) throws Throwable {
		bankacount.enterUserDetails(accountTitle, description, initialBalance, accountNumber, contactPerson, phone,
				interBankingUrl);
	}

	@When("^User clicks on submit button on the page$")
	public void user_clicks_on_submit_button_on_the_page() throws Throwable {
		bankacount.clickSubmitButton();
	}

	@Then("^User should verify is account created is true$")
	public void user_should_verify_is_account_created_is_true() throws Throwable {
		Thread.sleep(5000);
		bankacount.verifyaccountcreated();
		bankacount.takeScreenShotAtEndOfTheTest(driver);

	}
	
	@After	
		public void tearDown() {
			driver.close();
			driver.quit();
		}
	}


