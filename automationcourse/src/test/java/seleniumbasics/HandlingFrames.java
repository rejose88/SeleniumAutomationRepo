package seleniumbasics;

import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandlingFrames extends Base {

	
	public void verifyFrames()
	{
		driver.navigate().to("https://demoqa.com/frames");
		List<WebElement> totalFrames=driver.findElements(By.tagName("iframe"));
		System.out.println("Total no of frames:"+totalFrames.size());
		driver.switchTo().frame(totalFrames.get(0));
		
		WebElement frame1=driver.findElement(By.id("frame1"));
		driver.switchTo().frame(frame1);
		WebElement frameheading=driver.findElement(By.id("sampleHeading"));
		System.out.println("Frame 1 text "+frameheading.getText());
		
		driver.switchTo().defaultContent(); // switching back to where the control was previously
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HandlingFrames frames= new HandlingFrames();
		frames.initialiseDriver();
		frames.verifyFrames();

	}

}
