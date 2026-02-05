package testscript;

import java.io.IOException;

import org.testng.annotations.Test;

import automationcore.Base;
import pages.AdminUsersPage;
import pages.HomePage;
import pages.LoginPage;
import pages.ManageNewsPage;
import utilities.ExcelUtility;

public class AdminUsersTest extends Base {

	@Test(priority=1,description="Verifying if Admin is able to add new user")
	public void verifyAdminIsAbleToAddNewUser() throws IOException
	{
		String username=ExcelUtility.getStringData(0, 0, "LoginPage");
		String password=ExcelUtility.getStringData(0, 1, "LoginPage");
		LoginPage loginpage= new LoginPage(driver);
		loginpage.enterUsernameOnUsernameField(username);  
		loginpage.enterPasswordOnPasswordField(password);
		loginpage.clickonSigninButton();
		HomePage homepage= new HomePage(driver);
		homepage.clickOnAdminUsersMoreInfo();
		AdminUsersPage admin_users_page = new AdminUsersPage(driver);
		admin_users_page.creatingNewUser();		
	}
	
	@Test(priority=2,description="Verifying if admin is able to search an existing user")
	public void verifyAdminIsAbleToSearchUser() throws IOException
	{
		String username=ExcelUtility.getStringData(0, 0, "LoginPage");
		String password=ExcelUtility.getStringData(0, 1, "LoginPage");
		LoginPage loginpage= new LoginPage(driver);
		loginpage.enterUsernameOnUsernameField(username);  
		loginpage.enterPasswordOnPasswordField(password);
		loginpage.clickonSigninButton();
		HomePage homepage= new HomePage(driver);
		homepage.clickOnAdminUsersMoreInfo();
		AdminUsersPage admin_users_page = new AdminUsersPage(driver);
		admin_users_page.searchingExistingUser();
	}
	
	@Test(priority=3,description="Verifying if admin is able to reset/refresh the user list")
	public void verifyAdminIsAbleToResetUserList() throws IOException
	{
		String username=ExcelUtility.getStringData(0, 0, "LoginPage");
		String password=ExcelUtility.getStringData(0, 1, "LoginPage");
		LoginPage loginpage= new LoginPage(driver);
		loginpage.enterUsernameOnUsernameField(username);  
		loginpage.enterPasswordOnPasswordField(password);
		loginpage.clickonSigninButton();
		HomePage homepage= new HomePage(driver);
		homepage.clickOnAdminUsersMoreInfo();
		AdminUsersPage admin_users_page = new AdminUsersPage(driver);
		admin_users_page.resettingUserList();
	}
}
