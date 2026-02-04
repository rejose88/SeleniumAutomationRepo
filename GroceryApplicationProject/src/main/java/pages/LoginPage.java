package pages;

import java.awt.print.PageFormat;

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
	
	@FindBy(name="username")WebElement username_field;
	@FindBy(name="password")WebElement password_field;
	@FindBy(xpath="//button[@type='submit' and @class='btn btn-dark btn-block']" )WebElement signin_button;
	
	public void enterUsernameOnUsernameField(String username)
	{
		username_field.sendKeys(username);
	}
	
	public void enterPasswordOnPasswordField(String password)
	{
		password_field.sendKeys(password);
	}
	
	public void clickonSigninButton()
	{
		signin_button.click();
	}

}
