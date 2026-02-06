package automationcore;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import utilities.ScreenshotUtility;

public class Base {

	public WebDriver driver;

	@BeforeMethod
	public void initialiseDriver() {
		driver = new ChromeDriver();
		driver.navigate().to("https://groceryapp.uniqassosiates.com/admin/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); // implicit wait
	}

	@AfterMethod
	public void driverQuit(ITestResult iTestResult) throws IOException {

		if (iTestResult.getStatus() == ITestResult.FAILURE) { // check if the test case is failed.

			ScreenshotUtility screenShot = new ScreenshotUtility();
			screenShot.getScreenshot(driver, iTestResult.getName());
			// call getScreenshot method to capture screenshot of failed test case and pass
			// driver and test case name as parameters.
		}
		// driver.quit();

	}
}
