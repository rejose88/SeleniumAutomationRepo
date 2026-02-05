package seleniumbasics;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandlingWebElements extends Base {

	public void verifyWebElement()
	{
		//Navigate to the specific page
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php"); 
		
		//Locating webelement for message box
		WebElement messageBox=driver.findElement(By.xpath("//input[@id='single-input-field']"));  
		//sendKeys()
		messageBox.sendKeys("My Sample Text Message");
		
		WebElement showMessageButton= driver.findElement(By.xpath("//button[@id='button-one']"));
		//click()
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(5)); //explicit wait
		wait.until(ExpectedConditions.elementToBeClickable(showMessageButton));
		
		//fluent wait
		Wait<WebDriver> fluent = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(5))
				.pollingEvery(Duration.ofSeconds(1)).ignoring(NoSuchElementException.class);
		fluent.until(ExpectedConditions.elementToBeClickable(showMessageButton));
				
		
		showMessageButton.click();
		
		//isDisplayed()
		System.out.println("showMessageButton is displayed or not? "+showMessageButton.isDisplayed());
		
		//isEnabled()
		System.out.println("showMessageButton is enabled or not? "+showMessageButton.isEnabled());
		
		WebElement messageField= driver.findElement(By.xpath("//div[@id='message-one']"));
		//getText()
		System.out.println("Text on the message field is :"+messageField.getText());
		
		//clear()
		messageBox.clear();
		
		WebElement getTotalButton = driver.findElement(By.id("button-two"));
		//getTagName()
		System.out.println("Tag name is : "+getTotalButton.getTagName());
		
		//getCssValue()
		System.out.println("Background colour of Show Message Button :"+showMessageButton.getCssValue("background-color"));
		
		
	}
	public static void main(String[] args) {
		
		HandlingWebElements webElementHandlingWebElements= new HandlingWebElements();
		webElementHandlingWebElements.initialiseDriver();
		webElementHandlingWebElements.verifyWebElement();	
		
	}

}
