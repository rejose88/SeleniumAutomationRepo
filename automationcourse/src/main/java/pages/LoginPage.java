package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	public WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
		
	@FindBy(id="user-name")WebElement user_name;
	@FindBy(id="password")WebElement password;
	@FindBy(id="login-button")WebElement login_button;	
	
	public void enterUsernameOnUserNameField()
	{
		user_name.sendKeys("standard_user");
	}
	public void enterPasswordOnPasswordField()
	{
		password.sendKeys("secret_sauce");
	}
	public void clickOnLoginButton()
	{
		login_button.click();
	}
	
}
