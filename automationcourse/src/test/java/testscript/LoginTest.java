package testscript;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class LoginTest extends BaseTestNG{
	
	@Test
	public void verifyUserLoginWithValidUsernameAndPassword()
	{
		
		//WebElement user_name= driver.findElement(By.id("user-name"));
		//WebElement password= driver.findElement(By.id("password"));
		//user_name.sendKeys("standard_user");
		//password.sendKeys("secret_sauce");
		//WebElement login_button=driver.findElement(By.id("login-button"));
		//login_button.click();
		
		
	}
	@Test
	public void verifyUserLoginWithValidUsernameAndInvalidPassword()
	{
		
		WebElement user_name= driver.findElement(By.id("user-name"));
		WebElement password= driver.findElement(By.id("password"));
		user_name.sendKeys("standard_user");
		password.sendKeys("12345");
		WebElement login_button=driver.findElement(By.id("login-button"));
		login_button.click();
		
	}
	
	@Test
	public void verifyUserLoginWithInvalidUsernameAndValidPassword()
	{
		
		WebElement user_name= driver.findElement(By.id("user-name"));
		WebElement password= driver.findElement(By.id("password"));
		user_name.sendKeys("user");
		password.sendKeys("secret_sauce");
		WebElement login_button=driver.findElement(By.id("login-button"));
		login_button.click();
		
	}
	
	@Test
	public void verifyUserLoginWithInvalidUsernameAndInvalidPassword()
	{
		
		WebElement user_name= driver.findElement(By.id("user-name"));
		WebElement password= driver.findElement(By.id("password"));
		user_name.sendKeys("user");
		password.sendKeys("12345");
		WebElement login_button=driver.findElement(By.id("login-button"));
		login_button.click();
		
	} 
	
}


