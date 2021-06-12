package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class LoginPagePOM {
	
	
	WebDriver driver;

	public LoginPagePOM(WebDriver driver) {

		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//input[@id = 'username']")
	WebElement USERNAME_FILED_ELEMENT;

	@FindBy(how = How.XPATH, using = "//input[@id = 'password']")
	WebElement PASSWORD_FILED_ELEMENT;

	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Sign in')]")
	WebElement SIGN_BUTTON_FILED_ELEMENT;

	
	
	
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

}
