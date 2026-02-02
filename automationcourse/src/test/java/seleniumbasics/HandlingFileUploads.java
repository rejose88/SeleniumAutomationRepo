package seleniumbasics;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandlingFileUploads extends Base {
	
	public void fileUploadUsingSendKeys()
	{
		driver.navigate().to("https://demo.guru99.com/test/upload/");
		WebElement upload=driver.findElement(By.id("uploadfile_0"));
		upload.sendKeys("C:\\Users\\REENA\\git\\SeleniumAutomationRepo\\automationcourse\\src\\test\\resources\\Assignment 8_Inheritance.pdf");
		WebElement check=driver.findElement(By.id("terms"));
		check.click();
		WebElement submit=driver.findElement(By.id("submitbutton"));
		submit.click();
	}
	
	public void fileUploadUsingRobot() throws AWTException
	{
		driver.navigate().to("https://www.ilovepdf.com/pdf_to_word");
		WebElement select_pdf= driver.findElement(By.id("pickfiles"));
		select_pdf.click();
		
		StringSelection selection= new StringSelection("C:\\Users\\REENA\\git\\SeleniumAutomationRepo\\automationcourse\\src\\test\\resources\\Assignment 8_Inheritance.pdf");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
		
		Robot r=new Robot();
		r.delay(2500);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HandlingFileUploads file_uploads= new HandlingFileUploads();
		file_uploads.initialiseDriver();
		//file_uploads.fileUploadUsingSendKeys();
		try {
			file_uploads.fileUploadUsingRobot();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
