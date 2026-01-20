package seleniumbasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	public WebDriver driver;  
	
	public void initialiseDriver()
	{
		driver= new ChromeDriver(); 
		driver.get("https://selenium.qabible.in/");
		driver.manage().window().maximize();
	}
	
	public void browserCloseQuit()
	{
		//driver.close();
		driver.quit();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Base base= new Base();
		base.initialiseDriver();
		base.browserCloseQuit();
	}

}
