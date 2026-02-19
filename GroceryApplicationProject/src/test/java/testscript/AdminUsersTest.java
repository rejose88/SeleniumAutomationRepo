package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import automationcore.Base;
import constant.Constant;
import pages.AdminUsersPage;
import pages.HomePage;
import pages.LoginPage;
import utilities.ExcelUtility;
import utilities.FakerUtility;

public class AdminUsersTest extends Base {
	HomePage homepage;
	AdminUsersPage adminuserspage;

	@Test(priority = 1, description = "Verifying if Admin is able to add new user")
	public void verifyAdminIsAbleToAddNewUser() throws IOException {
		String username = ExcelUtility.getStringData(0, 0, "LoginPage");
		String password = ExcelUtility.getStringData(0, 1, "LoginPage");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUsernameOnUsernameField(username).enterPasswordOnPasswordField(password);
		homepage = loginpage.clickonSigninButton();
		adminuserspage = homepage.clickOnAdminUsersMoreInfo();
		adminuserspage.clickOnNewUserButton();

		// Using FakerUtility to generate random username and password for the new user
		FakerUtility faker = new FakerUtility();
		String newUserName = faker.createRandomUsername();
		adminuserspage.enterNewUsername(newUserName);
		String newPassword = faker.createRandomPassword();
		String new_user_type = ExcelUtility.getStringData(0, 2, "AdminUserPage");
		adminuserspage.enterPasswordForNewUser(newPassword).selectUserTypeForNewUser(new_user_type)
				.clickOnNewUserSaveButton();

		boolean user_created_successfully = adminuserspage.userCreatedSuccessfullyAlertDisplay();
		Assert.assertTrue(user_created_successfully, Constant.USERCREATIONERROR);

	}

	@Test(priority = 2, description = "Verifying if admin is able to search an existing user")
	public void verifyAdminIsAbleToSearchUser() throws IOException {
		String username = ExcelUtility.getStringData(0, 0, "LoginPage");
		String password = ExcelUtility.getStringData(0, 1, "LoginPage");

		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUsernameOnUsernameField(username).enterPasswordOnPasswordField(password);
		homepage = loginpage.clickonSigninButton();
		adminuserspage = homepage.clickOnAdminUsersMoreInfo();
		String username_to_be_searched = ExcelUtility.getStringData(0, 0, "AdminUserPage");
		String user_type_to_be_searched = ExcelUtility.getStringData(0, 1, "AdminUserPage");
		adminuserspage.clickOnSearchButton().enterTheUserNameToBeSearched(username_to_be_searched)
				.selectUserTypeForTheUserToBeSearched(user_type_to_be_searched).clickOnSearchUsersSearchButton();

		boolean user_search_result = adminuserspage.userSearchedSuccessfully();
		Assert.assertTrue(user_search_result, Constant.USERSEARCHERROR);

	}

	@Test(priority = 3, description = "Verifying if admin is able to reset/refresh the user list")
	public void verifyAdminIsAbleToResetUserList() throws IOException {
		String username = ExcelUtility.getStringData(0, 0, "LoginPage");
		String password = ExcelUtility.getStringData(0, 1, "LoginPage");

		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUsernameOnUsernameField(username).enterPasswordOnPasswordField(password);
		homepage = loginpage.clickonSigninButton();
		adminuserspage = homepage.clickOnAdminUsersMoreInfo();
		adminuserspage.clickOnResetButton();

		boolean user_refresh_display = adminuserspage.usersRefreshedSuccessfully();
		Assert.assertTrue(user_refresh_display, Constant.USERRESETERROR);

	}
}
