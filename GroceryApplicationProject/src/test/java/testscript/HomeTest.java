package testscript;

import java.io.IOException;

import org.testng.annotations.Test;

import automationcore.Base;
import net.bytebuddy.build.Plugin.Factory.UsingReflection.Priority;
import pages.HomePage;
import pages.LoginPage;
import utilities.ExcelUtility;

public class HomeTest extends Base{

	@Test(description="Validating whether user is able to logout successfully")
	public void verifyUserIsAbleToSuccessfullyLogout() throws IOException
	{
		String username=ExcelUtility.getStringData(0, 0, "LoginPage");
		String password=ExcelUtility.getStringData(0, 1, "LoginPage");
		LoginPage loginpage= new LoginPage(driver);
		loginpage.enterUsernameOnUsernameField(username);
		loginpage.enterPasswordOnPasswordField(password);
		loginpage.clickonSigninButton();
		HomePage homepage= new HomePage(driver);
		homepage.clickOnAdminLogoutIcon();
		homepage.clickOnLogoutButton();	
		
	}
	
}
