package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

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
		showMessageButton.click();
		
		WebElement messageField= driver.findElement(By.xpath("//div[@id='message-one']"));
		//getText()
		System.out.println("Text on the message field is :"+messageField.getText());
		
		//clear()
		messageBox.clear();
		
		WebElement getTotalButton = driver.findElement(By.id("button-two"));
		//tagName()
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
