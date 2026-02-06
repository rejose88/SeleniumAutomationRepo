package testscript;

import java.io.IOException;

import org.testng.annotations.Test;

import automationcore.Base;
import pages.AdminUsersPage;
import pages.HomePage;
import pages.LoginPage;
import pages.ManageNewsPage;
import utilities.ExcelUtility;
import utilities.FakerUtility;

public class AdminUsersTest extends Base {

	@Test(priority = 1, description = "Verifying if Admin is able to add new user")
	public void verifyAdminIsAbleToAddNewUser() throws IOException {
		String username = ExcelUtility.getStringData(0, 0, "LoginPage");
		String password = ExcelUtility.getStringData(0, 1, "LoginPage");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUsernameOnUsernameField(username);
		loginpage.enterPasswordOnPasswordField(password);
		loginpage.clickonSigninButton();

		HomePage homepage = new HomePage(driver);
		homepage.clickOnAdminUsersMoreInfo();
		AdminUsersPage admin_users_page = new AdminUsersPage(driver);
		admin_users_page.clickOnNewUserButton();

		FakerUtility faker = new FakerUtility();
		String newUserName = faker.createRandomUsername();
		admin_users_page.enterNewUsername(newUserName);
		String newPassword = faker.createRandomPassword();
		admin_users_page.enterPasswordForNewUser(newPassword);

		admin_users_page.selectUserTypeForNewUser();
		admin_users_page.clickOnNewUserSaveButton();

	}

	@Test(priority = 2, description = "Verifying if admin is able to search an existing user")
	public void verifyAdminIsAbleToSearchUser() throws IOException {
		String username = ExcelUtility.getStringData(0, 0, "LoginPage");
		String password = ExcelUtility.getStringData(0, 1, "LoginPage");

		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUsernameOnUsernameField(username);
		loginpage.enterPasswordOnPasswordField(password);
		loginpage.clickonSigninButton();

		HomePage homepage = new HomePage(driver);
		homepage.clickOnAdminUsersMoreInfo();

		AdminUsersPage admin_users_page = new AdminUsersPage(driver);
		admin_users_page.clickOnSearchButton();
		admin_users_page.enterTheUserNameToBeSearched();
		admin_users_page.selectUserTypeForTheUserToBeSearched();
		admin_users_page.clickOnSearchUsersSearchButton();

	}

	@Test(priority = 3, description = "Verifying if admin is able to reset/refresh the user list")
	public void verifyAdminIsAbleToResetUserList() throws IOException {
		String username = ExcelUtility.getStringData(0, 0, "LoginPage");
		String password = ExcelUtility.getStringData(0, 1, "LoginPage");

		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUsernameOnUsernameField(username);
		loginpage.enterPasswordOnPasswordField(password);
		loginpage.clickonSigninButton();

		HomePage homepage = new HomePage(driver);
		homepage.clickOnAdminUsersMoreInfo();

		AdminUsersPage admin_users_page = new AdminUsersPage(driver);
		admin_users_page.clickOnResetButton();
	}
}
