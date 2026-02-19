package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.WaitUtility;

public class LoginPage {

	public WebDriver driver;
	WaitUtility waitutility = new WaitUtility();

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(name = "username")
	WebElement username_field;
	@FindBy(name = "password")
	WebElement password_field;
	@FindBy(xpath = "//button[@type='submit']")
	WebElement signin_button;
	@FindBy(xpath = "//p[text()='Dashboard']")
	WebElement dashBoardTile;
	@FindBy(xpath = "//b[text()='7rmart supermarket']")
	WebElement pageTitle;
	@FindBy(xpath = "//h5[text()=' Alert!']")
	WebElement signInFailedAlertMessage;

	public LoginPage enterUsernameOnUsernameField(String username) {
		username_field.sendKeys(username);
		return this;
	}

	public LoginPage enterPasswordOnPasswordField(String password) {
		password_field.sendKeys(password);
		return this;
	}

	public HomePage clickonSigninButton() {
		signin_button.click();
		return new HomePage(driver);
	}

	public boolean verifyDashBoardDisplayInHomePage() {
		return driver.findElement(By.xpath("//p[text()='Dashboard']")).isDisplayed();

	}

	public String getTextFromSignInPageTile() {
		return pageTitle.getText();
	}

	public boolean verifyAlertInSignInPage() {
		return !signInFailedAlertMessage.isDisplayed();
	}

	public boolean getDisplayStatuOfSignInBox() // for logout testcase verification in HomeTest.java
	{
		return pageTitle.isDisplayed();
	}

}
