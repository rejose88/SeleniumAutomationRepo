package seleniumbasics;

import java.awt.AWTException;
import java.awt.Desktop.Action;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HandlingActions extends Base {

	public void verifyRightClick()
	{
		WebElement others = driver.findElement(By.xpath("//a[@id='others']"));
		Actions actions = new Actions(driver);
		actions.contextClick(others).build().perform();
		
	}
	
	public void verifyMouseHover()
	{
		WebElement mouseHover=driver.findElement(By.xpath("//a[@id='others']"));
		Actions actions = new Actions(driver);
		actions.moveToElement(mouseHover).build().perform();
	}
	
	public void verifyDragDrop()
	{
		driver.navigate().to("https://demoqa.com/droppable");
		WebElement drag=driver.findElement(By.id("draggable"));
		WebElement drop= driver.findElement(By.id("droppable"));
		Actions actions = new Actions(driver);
		actions.dragAndDrop(drag, drop).build().perform();
	}
	
	public void verifyKeyBoardAction() throws AWTException
	{
		Robot robot= new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_T);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_T);		
	}
	
	public static void main(String[] args){
		// TODO Auto-generated method stub

		HandlingActions handleAction= new HandlingActions();
		handleAction.initialiseDriver();
		//handleAction.verifyRightClick();
		//handleAction.verifyMouseHover();
		//handleAction.verifyDragDrop();
		try {
			handleAction.verifyKeyBoardAction();
			} 
		catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}
		
	}

}
