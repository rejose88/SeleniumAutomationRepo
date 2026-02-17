package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import automationcore.Base;
import constant.Constant;
import pages.HomePage;
import pages.LoginPage;
import utilities.ExcelUtility;

public class HomeTest extends Base {

	HomePage homepage;
	@Test(description = "Validating whether user is able to logout successfully.", retryAnalyzer = retry.RetryMechanism.class)
	public void verifyUserIsAbleToSuccessfullyLogout() throws IOException {
		String username = ExcelUtility.getStringData(0, 0, "LoginPage");
		String password = ExcelUtility.getStringData(0, 1, "LoginPage");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUsernameOnUsernameField(username).enterPasswordOnPasswordField(password);
		homepage=loginpage.clickonSigninButton();
		homepage.clickOnAdminLogoutIcon();
		loginpage=homepage.clickOnLogoutButton();
		boolean signInBox_Title = loginpage.getDisplayStatuOfSignInBox();
		Assert.assertTrue(signInBox_Title, Constant.LOGOUTERROR);
	}

}
