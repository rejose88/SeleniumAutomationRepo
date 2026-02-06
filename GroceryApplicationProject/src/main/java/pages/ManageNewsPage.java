package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageNewsPage {

	public WebDriver driver;

	public ManageNewsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/news/add']")
	WebElement new_news_button;
	@FindBy(id = "news")
	WebElement add_new_news_field;
	@FindBy(xpath = "//button[@name='create']")
	WebElement save_news_button;
	@FindBy(xpath = "//a[@href='javascript:void(0)']")
	WebElement search_news_button;
	@FindBy(xpath = "//input[@name='un']")
	WebElement manage_news_search_news_field;
	@FindBy(xpath = "//button[@name='Search']")
	WebElement manage_news_search_button;
	@FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/list-news']")
	WebElement reset_news_button;

	public void clickOnNewButton() {
		new_news_button.click();
	}

	public void enterNewNewsOnTextField() {
		add_new_news_field.sendKeys("Today's main news");
	}

	public void clickOnSaveNewsButton() {
		save_news_button.click();
	}

	public void clickOnSearchNewsButton() {
		search_news_button.click();
	}

	public void enterNewsToBeSearched() {
		manage_news_search_news_field.sendKeys("Today's main news");
	}

	public void clickOnSearchButton() {
		manage_news_search_button.click();
	}

	public void clickOnResetButton() {
		reset_news_button.click();
	}

}
