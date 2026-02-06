package testscript;

import java.io.IOException;

import org.testng.annotations.Test;

import automationcore.Base;
import pages.HomePage;
import pages.LoginPage;
import pages.ManageNewsPage;
import utilities.ExcelUtility;

public class ManageNewsTest extends Base {

	@Test(priority = 1, description = "Creating new news")

	public void verifyUserIsAbleToAddNewNews() throws IOException {
		String username = ExcelUtility.getStringData(0, 0, "LoginPage");
		String password = ExcelUtility.getStringData(0, 1, "LoginPage");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUsernameOnUsernameField(username);
		loginpage.enterPasswordOnPasswordField(password);
		loginpage.clickonSigninButton();
		HomePage homePage = new HomePage(driver);
		homePage.clickOnManageNewsMoreInfo();
		ManageNewsPage manage_news_page = new ManageNewsPage(driver);
		manage_news_page.clickOnNewButton();
		manage_news_page.enterNewNewsOnTextField();
		manage_news_page.clickOnSaveNewsButton();
	}

	@Test(priority = 2, description = "Searching already added news")
	public void verifyUserIsAbleToSearchNews() throws IOException {
		String username = ExcelUtility.getStringData(0, 0, "LoginPage");
		String password = ExcelUtility.getStringData(0, 1, "LoginPage");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUsernameOnUsernameField(username);
		loginpage.enterPasswordOnPasswordField(password);
		loginpage.clickonSigninButton();
		HomePage homePage = new HomePage(driver);
		homePage.clickOnManageNewsMoreInfo();
		ManageNewsPage manage_news_page = new ManageNewsPage(driver);
		manage_news_page.clickOnSearchNewsButton();
		manage_news_page.enterNewsToBeSearched();
		manage_news_page.clickOnSearchButton();
	}

	@Test(priority = 3, description = "Resetting the already added news")
	public void verifyUserIsAbleToResetTheNews() throws IOException {
		String username = ExcelUtility.getStringData(0, 0, "LoginPage");
		String password = ExcelUtility.getStringData(0, 1, "LoginPage");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUsernameOnUsernameField(username);
		loginpage.enterPasswordOnPasswordField(password);
		loginpage.clickonSigninButton();
		HomePage homePage = new HomePage(driver);
		homePage.clickOnManageNewsMoreInfo();
		ManageNewsPage manage_news_page = new ManageNewsPage(driver);
		manage_news_page.clickOnResetButton();
	}

}
