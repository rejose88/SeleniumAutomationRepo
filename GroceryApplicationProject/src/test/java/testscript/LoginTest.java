package testscript;

import java.io.IOException;

import org.testng.annotations.Test;

import automationcore.Base;
import pages.LoginPage;
import utilities.ExcelUtility;

public class LoginTest extends Base {

	@Test(priority = 1, description = "Validating user login with valid credentials")
	public void verifyUserLoginWithValidUsernameAndValidPassword() throws IOException {
		String username = ExcelUtility.getStringData(0, 0, "LoginPage");
		String password = ExcelUtility.getStringData(0, 1, "LoginPage");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUsernameOnUsernameField(username);
		loginpage.enterPasswordOnPasswordField(password);
		loginpage.clickonSigninButton();
	}

	@Test(priority = 2, description = "Validating user login with Invalid Username and Valid Password")
	public void verifyUserLoginWithInvalidUsernameAndValidPassword() throws IOException {
		String username = ExcelUtility.getStringData(1, 0, "LoginPage");
		String password = ExcelUtility.getStringData(1, 1, "LoginPage");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUsernameOnUsernameField(username);
		loginpage.enterPasswordOnPasswordField(password);
		loginpage.clickonSigninButton();
	}

	@Test(priority = 3, description = "Validating user login with Valid Username and Invalid Password")
	public void verifyUserLoginWithValidUsernameAndInvalidPassword() throws IOException {
		String username = ExcelUtility.getStringData(2, 0, "LoginPage");
		String password = ExcelUtility.getStringData(2, 1, "LoginPage");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUsernameOnUsernameField(username);
		loginpage.enterPasswordOnPasswordField(password);
		loginpage.clickonSigninButton();
	}

	@Test(priority = 4, description = "Validating user login with Invalid Username and Invalid Password")
	public void verifyUserLoginWithInvalidUsernameAndInvalidPassword() throws IOException {
		String username = ExcelUtility.getStringData(2, 0, "LoginPage");
		String password = ExcelUtility.getStringData(2, 1, "LoginPage");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUsernameOnUsernameField(username);
		loginpage.enterPasswordOnPasswordField(password);
		loginpage.clickonSigninButton();
	}
}
