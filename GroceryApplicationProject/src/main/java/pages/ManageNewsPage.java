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
	@FindBy(xpath = "//h5[text()=' Alert!']")
	WebElement news_created_successfully_alert;
	@FindBy(xpath = "//table[@class='table table-bordered table-hover table-sm']/tbody/tr[1]/td[1]")
	WebElement news_search_result;
	@FindBy(xpath = "//table[@class='table table-bordered table-hover table-sm']/tbody/tr[1]/td[1]")
	WebElement news_refresh_display;

	public ManageNewsPage clickOnNewButton() {
		new_news_button.click();
		return this;
	}

	public ManageNewsPage enterNewNewsOnTextField() {
		add_new_news_field.sendKeys("Today's main news");
		return this;
	}

	public ManageNewsPage clickOnSaveNewsButton() {
		save_news_button.click();
		return this;
	}

	public ManageNewsPage clickOnSearchNewsButton() {
		search_news_button.click();
		return this;
	}

	public ManageNewsPage enterNewsToBeSearched() {
		manage_news_search_news_field.sendKeys("Today's main news");
		return this;
	}

	public ManageNewsPage clickOnSearchButton() {
		manage_news_search_button.click();
		return this;
	}

	public ManageNewsPage clickOnResetButton() {
		reset_news_button.click();
		return this;
	}

	public boolean newsCreatedSuccessfullyAlertDisplay() {
		return news_created_successfully_alert.isDisplayed();
	}

	public boolean newsSearchedSuccessfully() {

		return news_search_result.isDisplayed();
	}

	public boolean newsRefreshedSuccessfully() {

		return news_refresh_display.isDisplayed();
	}
}
