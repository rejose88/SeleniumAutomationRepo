package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class HandlingJavaScriptExecutor extends Base {
	
	public void verifyJavaScript()
	{
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		
		WebElement messageBox=driver.findElement(By.xpath("//input[@id='single-input-field']"));  
		//messageBox.sendKeys("My Sample Text Message");
		
		WebElement show_message_button=driver.findElement(By.id("button-one"));
		
		JavascriptExecutor js=(JavascriptExecutor)driver;   //casting - changing control from WebDriver to JSExecutor
		
		js.executeScript("arguments[0].value='My sample text';", messageBox); //value='' for giving text as input
		
		js.executeScript("arguments[0].click();",show_message_button); // clicking on Show Message button
		
		js.executeScript("window.scrollBy(0,350)","");  //vertical scroll down, giving value to y axis
		
		js.executeScript("window.scrollBy(0,-350)",""); //vertical scroll up, giving value to y axis
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HandlingJavaScriptExecutor javascriptobj= new HandlingJavaScriptExecutor();
		javascriptobj.initialiseDriver();
		javascriptobj.verifyJavaScript();

	}

}
