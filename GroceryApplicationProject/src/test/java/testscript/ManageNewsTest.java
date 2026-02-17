package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import automationcore.Base;
import constant.Constant;
import pages.HomePage;
import pages.LoginPage;
import pages.ManageNewsPage;
import utilities.ExcelUtility;

public class ManageNewsTest extends Base {

	HomePage homepage;
	ManageNewsPage managenewspage;

	@Test(priority = 1, description = "Creating new news")

	public void verifyUserIsAbleToAddNewNews() throws IOException {
		String username = ExcelUtility.getStringData(0, 0, "LoginPage");
		String password = ExcelUtility.getStringData(0, 1, "LoginPage");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUsernameOnUsernameField(username).enterPasswordOnPasswordField(password);
		homepage = loginpage.clickonSigninButton();
		managenewspage = homepage.clickOnManageNewsMoreInfo();
		managenewspage.clickOnNewButton().enterNewNewsOnTextField().clickOnSaveNewsButton();
		boolean news_created_successfully = managenewspage.newsCreatedSuccessfullyAlertDisplay();
		Assert.assertTrue(news_created_successfully, Constant.NEWSCREATIONERROR);
	}

	@Test(priority = 2, description = "Searching already added news")
	public void verifyUserIsAbleToSearchNews() throws IOException {
		String username = ExcelUtility.getStringData(0, 0, "LoginPage");
		String password = ExcelUtility.getStringData(0, 1, "LoginPage");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUsernameOnUsernameField(username).enterPasswordOnPasswordField(password);
		homepage = loginpage.clickonSigninButton();
		managenewspage = homepage.clickOnManageNewsMoreInfo();
		managenewspage.clickOnSearchNewsButton().enterNewsToBeSearched().clickOnSearchButton();
		boolean news_search_result = managenewspage.newsSearchedSuccessfully();
		Assert.assertTrue(news_search_result, Constant.NEWSSEARCHERROR);
	}

	@Test(priority = 3, description = "Resetting the already added news")
	public void verifyUserIsAbleToResetTheNews() throws IOException {
		String username = ExcelUtility.getStringData(0, 0, "LoginPage");
		String password = ExcelUtility.getStringData(0, 1, "LoginPage");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUsernameOnUsernameField(username).enterPasswordOnPasswordField(password);
		homepage = loginpage.clickonSigninButton();
		managenewspage = homepage.clickOnManageNewsMoreInfo();
		managenewspage.clickOnResetButton();
		boolean news_refresh_display = managenewspage.newsRefreshedSuccessfully();
		Assert.assertTrue(news_refresh_display, Constant.NEWSRESETERROR);
	}

}
