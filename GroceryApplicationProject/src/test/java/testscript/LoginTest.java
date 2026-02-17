package testscript;

import java.io.IOException;
import java.time.Duration;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import automationcore.Base;
import constant.Constant;
import pages.HomePage;
import pages.LoginPage;
import utilities.ExcelUtility;

public class LoginTest extends Base {

	HomePage homepage;

	@Test(priority = 1, description = "Validating user login with valid credentials", groups = { "smoke" })
	public void verifyUserLoginWithValidUsernameAndValidPassword() throws IOException {
		String username = ExcelUtility.getStringData(0, 0, "LoginPage");
		String password = ExcelUtility.getStringData(0, 1, "LoginPage");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUsernameOnUsernameField(username).enterPasswordOnPasswordField(password);
		homepage = loginpage.clickonSigninButton();
		boolean dashboard_display = loginpage.verifyDashBoardDisplayInHomePage();
		Assert.assertTrue(dashboard_display, Constant.VALIDCREDENTIALERROR);
	}

	@Test(priority = 2, description = "Validating user login with Invalid Username and Valid Password")
	public void verifyUserLoginWithInvalidUsernameAndValidPassword() throws IOException {
		String username = ExcelUtility.getStringData(1, 0, "LoginPage");
		String password = ExcelUtility.getStringData(1, 1, "LoginPage");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUsernameOnUsernameField(username).enterPasswordOnPasswordField(password).clickonSigninButton();
		String expected = "7rmart supermarket";
		String actual = loginpage.getTextFromSignInPageTile();
		Assert.assertEquals(actual, expected, Constant.INVALIDUSERNAMEERROR);
	}

	@Test(priority = 3, description = "Validating user login with Valid Username and Invalid Password")
	public void verifyUserLoginWithValidUsernameAndInvalidPassword() throws IOException {
		String username = ExcelUtility.getStringData(2, 0, "LoginPage");
		String password = ExcelUtility.getStringData(2, 1, "LoginPage");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUsernameOnUsernameField(username).enterPasswordOnPasswordField(password).clickonSigninButton();
		boolean verifyAlertInSignInPageTile = loginpage.verifyAlertInSignInPage();
		Assert.assertFalse(verifyAlertInSignInPageTile, Constant.INVALIDPASSWORDERROR);
	}

	@Test(priority = 4, description = "Validating user login with Invalid Username and Invalid Password", groups = {
			"smoke" }, dataProvider = "loginProvider")
	public void verifyUserLoginWithInvalidUsernameAndInvalidPassword(String username, String password)
			throws IOException {
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUsernameOnUsernameField(username).enterPasswordOnPasswordField(password).clickonSigninButton();
		String expected = "7rmart supermarket";
		String actual = loginpage.getTextFromSignInPageTile();
		Assert.assertEquals(actual, expected, Constant.INVALIDCREDENTIALERROR);
	}

	@DataProvider(name = "loginProvider") //
	public Object[][] getDataFromDataProvider() throws IOException {

		return new Object[][] { new Object[] { "admin", "admin22" }, new Object[] { "admin", "123" },
				// new Object[] {ExcelUtility.getStringData(3,
				// 0,"LoginPage"),ExcelUtility.getStringData(3,1 ,"LoginPage")}
		};
	}
}
