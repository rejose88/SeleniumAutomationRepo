package testscript;

import java.io.IOException;

import org.testng.annotations.Test;

import automationcore.BaseTestNG;
import pages.LoginPage;
import utilities.ExcelUtility;

public class LoginTest extends BaseTestNG {
	
	@Test
	public void verifyUserLoginWithValidUsernameAndValidPassword() throws IOException
	{
		String username=ExcelUtility.getStringData(0, 0, "LoginPage");
		String password=ExcelUtility.getStringData(0, 1, "LoginPage");
		LoginPage loginpage= new LoginPage(driver);
		loginpage.enterUsernameOnUsernameField(username);
		loginpage.enterPasswordOnPasswordField(password);
		loginpage.clickOnRememberMeCheckBox();
		loginpage.clickonSigninButton();
	}
	
	@Test
	public void verifyUserLoginWithInvalidUsernameAndValidPassword() throws IOException
	{
		String username=ExcelUtility.getStringData(1, 0, "LoginPage");
		String password=ExcelUtility.getStringData(1, 1, "LoginPage");
		LoginPage loginpage= new LoginPage(driver);
		loginpage.enterUsernameOnUsernameField(username);
		loginpage.enterPasswordOnPasswordField(password);
		loginpage.clickOnRememberMeCheckBox();
		loginpage.clickonSigninButton();
	}
	
	@Test
	public void verifyUserLoginWithValidUsernameAndInvalidPassword() throws IOException
	{
		String username=ExcelUtility.getStringData(2, 0, "LoginPage");
		String password=ExcelUtility.getStringData(2, 1, "LoginPage");
		LoginPage loginpage= new LoginPage(driver);
		loginpage.enterUsernameOnUsernameField(username);
		loginpage.enterPasswordOnPasswordField(password);
		loginpage.clickOnRememberMeCheckBox();
		loginpage.clickonSigninButton();
	}
	
	@Test
	public void verifyUserLoginWithInvalidUsernameAndInvalidPassword() throws IOException
	{
		String username=ExcelUtility.getStringData(2, 0, "LoginPage");
		String password=ExcelUtility.getStringData(2, 1, "LoginPage");
		LoginPage loginpage= new LoginPage(driver);
		loginpage.enterUsernameOnUsernameField(username);
		loginpage.enterPasswordOnPasswordField(password);
		loginpage.clickOnRememberMeCheckBox();
		loginpage.clickonSigninButton();
	}
	
	
	
}
