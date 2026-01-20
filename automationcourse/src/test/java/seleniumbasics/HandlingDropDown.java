package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropDown extends Base {
	
	public void verifyDropDown()
	{
		driver.navigate().to("https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		
		WebElement dropDown= driver.findElement(By.xpath("//select[@id='dropdowm-menu-1']"));
		
		Select select= new Select(dropDown);
		//select.selectByIndex(1);
		//select.selectByVisibleText("SQL");
		select.selectByValue("python");
		
	}

	public static void main(String[] args) {
		HandlingDropDown drop= new HandlingDropDown();
		drop.initialiseDriver();
		drop.verifyDropDown();
		

	}

}
