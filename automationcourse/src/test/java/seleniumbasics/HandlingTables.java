package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandlingTables extends Base {
	
	public void tableHandling()
	{
		driver.navigate().to("https://money.rediff.com/indices/nse");
		WebElement nsetable=driver.findElement(By.xpath("//table[@id='dataTable']"));
		System.out.println(nsetable.getText());
		
		WebElement table_head_row=driver.findElement(By.xpath("//table[@id='dataTable']/thead/tr"));
		System.out.println(table_head_row.getText());
		
		WebElement tablerow=driver.findElement(By.xpath("//table[@id='dataTable']/tbody/tr[1]"));
		System.out.println(tablerow.getText());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HandlingTables tableHandle= new HandlingTables();
		tableHandle.initialiseDriver();
		tableHandle.tableHandling();

	}

}
