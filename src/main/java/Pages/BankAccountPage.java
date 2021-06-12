package Pages;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class BankAccountPage {
	

	WebDriver driver;

	public BankAccountPage(WebDriver driver) {

		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//input[@id = 'username']")
	WebElement USERNAME_FILED_ELEMENT;

	@FindBy(how = How.XPATH, using = "//input[@id = 'password']")
	WebElement PASSWORD_FILED_ELEMENT;

	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Sign in')]")
	WebElement SIGN_BUTTON_FILED_ELEMENT;

	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Bank & Cash')]")
	WebElement BANK_AND_CASH_FILED_ELEMENT;
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'New Account')]")
	WebElement NEW_ACCOUNT_FILED_ELEMENT;
	@FindBy(how = How.XPATH, using = "//input[@id='account']")
	WebElement ACCOUNT_FILED_ELEMENT;
	@FindBy(how = How.XPATH, using = "//input[@id='description']")
	WebElement DESCRIPTION_FILED_ELEMENT;
	@FindBy(how = How.XPATH, using = "//input[@id= 'balance' and @ type='text']")
	WebElement INITIAL_BALANCE_FILED_ELEMENT;
	@FindBy(how = How.XPATH, using = "//input[@id='account_number']")
	WebElement ACCOUNT_NUMBER_FILED_ELEMENT;	
	@FindBy(how = How.XPATH, using = "//input[@id='contact_person']")
	WebElement CONTACT_PERSON_FILED_ELEMENT;	
	@FindBy(how = How.XPATH, using = "//input[@id='contact_phone']")
	WebElement PHONE_NUMBER_FILED_ELEMENT;	
	@FindBy(how = How.XPATH, using = "//input[@id='ib_url']")
	WebElement BANK_URL_FILED_ELEMENT;
	@FindBy(how = How.XPATH, using = "//button[@class = 'btn btn-primary']/i[1]")
	WebElement  SUBMIT_BUTTON_FILED_ELEMENT;	
	@FindBy(how = How.XPATH, using = "//div[@id = 'page-wrapper']/div[3]/div[1]")
	WebElement  VERIFY_ACCOUNT_FILED_ELEMENT;
	
	
	public void enterUserCredentials(String username, String password) {

		USERNAME_FILED_ELEMENT.sendKeys(username);
		PASSWORD_FILED_ELEMENT.sendKeys(password);
	}

	public void clickSiginButton() {
		
		SIGN_BUTTON_FILED_ELEMENT.click();
	}

	public void verifyDashBoardPage() {
		String ExpectedPage = driver.getTitle();
		String ActualPage = "Dashboard- iBilling";
		Assert.assertEquals(ActualPage, ExpectedPage);
	}

	public void clickOnBankAndCash() {

		BANK_AND_CASH_FILED_ELEMENT.click();
	}

	public void clickonNewAccount() {

		NEW_ACCOUNT_FILED_ELEMENT.click();
	}
	
	public void verifyNewAccountdPage() {
		String ExpectedPage = driver.getTitle();
		String ActualPage = "Accounts- iBilling";
		Assert.assertEquals(ActualPage, ExpectedPage);
	}
	
	public void enterUserDetails(String accttitle,String description, int initalBalance, int acctNumber, String contactPerson,int phone,String url) {
		ACCOUNT_FILED_ELEMENT.sendKeys(accttitle);
		DESCRIPTION_FILED_ELEMENT.sendKeys(description);
		INITIAL_BALANCE_FILED_ELEMENT.sendKeys(String.valueOf(initalBalance));
		ACCOUNT_NUMBER_FILED_ELEMENT.sendKeys(String.valueOf(acctNumber));
		CONTACT_PERSON_FILED_ELEMENT.sendKeys(contactPerson);
		PHONE_NUMBER_FILED_ELEMENT.sendKeys(String.valueOf(phone));
		BANK_URL_FILED_ELEMENT.sendKeys(url);
		
	}
	
	public void clickSubmitButton() {
		SUBMIT_BUTTON_FILED_ELEMENT.click();
	}
	
	public void verifyAccountCreatedPage() {
		String ExpectedPage = driver.getTitle();
		String ActualPage = "Accounts- iBilling";
		Assert.assertEquals(ActualPage, ExpectedPage);
	}
	
	public void verifyaccountcreated() {
		
		System.out.println(VERIFY_ACCOUNT_FILED_ELEMENT.getText());
		
	}
	
	public void takeScreenShotAtEndOfTheTest(WebDriver driver) throws Throwable {
		TakesScreenshot ts = ((TakesScreenshot) driver);
		File sourceFile = ts.getScreenshotAs(OutputType.FILE);
		SimpleDateFormat formatter = new SimpleDateFormat("MMddyy_HHmmss");
		Date date = new Date();
		String label = formatter.format(date);
		String CurrentDirectory = System.getProperty("user.dir");
		FileUtils.copyFile(sourceFile, new File(CurrentDirectory + "/screenshot/" + label + ".png"));
	}

}
