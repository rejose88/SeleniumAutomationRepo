package seleniumbasics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AlertHandling extends Base {

	public void verifySimpleAlert()
	{
		driver.navigate().to("https://demoqa.com/alerts");
		WebElement confirmAlert=driver.findElement(By.xpath("//button[@id='alertButton']"));
		confirmAlert.click();
		Alert al=driver.switchTo().alert();
		al.accept();
	}
	
	public void verifyConfirmAlert()
	{
		driver.navigate().to("https://demoqa.com/alerts");
		WebElement confirmAlert1=driver.findElement(By.xpath("//button[@id='confirmButton']"));
		confirmAlert1.click();
		Alert al=driver.switchTo().alert();
		al.dismiss();
		//al.accept();
	}
	
	public void verifyPromptAlert()
	{
		driver.navigate().to("https://demoqa.com/alerts");
		WebElement confirmAlert2=driver.findElement(By.xpath("//button[@id='promtButton']"));
		confirmAlert2.click();
		Alert al=driver.switchTo().alert();
		al.sendKeys("ok");
		al.accept();	
		//al.dismiss();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AlertHandling alert= new AlertHandling();
		alert.initialiseDriver();
		//alert.verifySimpleAlert();
		//alert.verifyConfirmAlert();
		alert.verifyPromptAlert();
	}

}
