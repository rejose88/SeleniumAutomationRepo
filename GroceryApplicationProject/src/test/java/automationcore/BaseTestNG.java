package automationcore;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class BaseTestNG {

	public WebDriver driver;
	
	@BeforeMethod
	public void initialiseDriver()
	{
		driver= new ChromeDriver();
		driver.navigate().to("https://groceryapp.uniqassosiates.com/admin/login");
		driver.manage().window().maximize();
	}
	
	/*@AfterMethod
	public void browserCloseQuit()
	{
		driver.quit();
	}   */

}
