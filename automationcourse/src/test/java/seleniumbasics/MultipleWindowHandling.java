package seleniumbasics;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MultipleWindowHandling extends Base {
	
	public void verifyMultipleWindows()
	{
		driver.navigate().to("https://demo.guru99.com/popup.php");
		String parent_handle_id=driver.getWindowHandle();
		System.out.println("Parent handle id: "+parent_handle_id);
		
		WebElement click_here=driver.findElement(By.xpath("//a[text()='Click Here']"));
		click_here.click();
		
		Set<String> handle_ids= driver.getWindowHandles();
		
		System.out.println("handle ids : "+handle_ids);
		
		Iterator<String> it= handle_ids.iterator();
		while(it.hasNext())
		{
			String current_id=it.next();
			if(!current_id.equals(parent_handle_id))
			{
				driver.switchTo().window(current_id);
				WebElement email=driver.findElement(By.xpath("//input[@name='emailid']"));
				email.sendKeys("reenajose1@gmail.com");
				WebElement submit= driver.findElement(By.xpath("//input[@name='btnLogin']"));
				submit.click();
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultipleWindowHandling windowhandle= new MultipleWindowHandling();
		windowhandle.initialiseDriver();
		windowhandle.verifyMultipleWindows();

	}

}

