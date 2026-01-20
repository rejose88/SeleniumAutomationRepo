package seleniumbasics;

public class HandlingBrowserCommands extends Base {

	public void verifyBrowserCommands()
	{
		String title=driver.getTitle();
		System.out.println(title);
		String url=driver.getCurrentUrl();
		System.out.println(url);
		String id=driver.getWindowHandle();
		System.out.println(id);
		String source=driver.getPageSource();
		System.out.println(source);	
		
	}
	
	public void verifyNavigationCommands()
	{
		driver.navigate().to("https://www.flipkart.com/");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HandlingBrowserCommands browser= new HandlingBrowserCommands();
		browser.initialiseDriver();
		browser.verifyBrowserCommands();
		browser.verifyNavigationCommands();
	}

}

