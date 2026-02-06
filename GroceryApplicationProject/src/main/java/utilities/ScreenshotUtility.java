package utilities;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotUtility {
	public void getScreenshot(WebDriver driver, String failedTestCase) throws IOException {

		TakesScreenshot scrShot = (TakesScreenshot) driver; // predefined interface to capture screenshot.
		File screenShot = scrShot.getScreenshotAs(OutputType.FILE); // capture screenshot and store it in file format.

		String timeStamp = new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss").format(new Date()); // get current date and time
																							// to make unique name for
																							// screenshot.

		File f1 = new File(System.getProperty("user.dir") + "//OutputScreenShot");// create file in directory to store
																					// screenshot of failed test case.
		if (!f1.exists()) {

			f1.mkdirs();
		}
		String destination = System.getProperty("user.dir") + "//outputScreenShot//" + failedTestCase + timeStamp
				+ ".png"; // create complete path and format to store screenshot of failed test case.
		// String destination = f1.getPath() + "//" + failedTestCase + timeStamp +
		// ".png";

		File finalDestination = new File(destination);
		FileHandler.copy(screenShot, finalDestination);
	}

}
