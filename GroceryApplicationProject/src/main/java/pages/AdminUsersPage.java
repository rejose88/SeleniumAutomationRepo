package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AdminUsersPage {

	public WebDriver driver;

	public AdminUsersPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@href='javascript:void(0)' and @class='btn btn-rounded btn-danger']")
	WebElement add_new_user_button;
	@FindBy(xpath = "//a[@href='javascript:void(0)' and @class='btn btn-rounded btn-primary']")
	WebElement search_user_button;
	@FindBy(xpath = "//a[@class='btn btn-rounded btn-warning' and @href='https://groceryapp.uniqassosiates.com/admin/list-admin']")
	WebElement reset_user_button;
	@FindBy(id = "username")
	WebElement add_new_user_username_field;
	@FindBy(id = "password")
	WebElement add_new_user_password_field;
	@FindBy(id = "user_type")
	WebElement user_type_dropdown;
	@FindBy(xpath = "//button[@name='Create']")
	WebElement save_new_user_button;
	@FindBy(id = "un")
	WebElement username_search_field;
	@FindBy(id = "ut")
	WebElement user_type_select_field;
	@FindBy(xpath = "//button[@name='Search']")
	WebElement admin_users_search_button;

	public void clickOnNewUserButton() {
		add_new_user_button.click();
	}

	public void enterNewUsername(String newUserName) {
		add_new_user_username_field.sendKeys(newUserName);
	}

	public void enterPasswordForNewUser(String newPassword) {
		add_new_user_password_field.sendKeys(newPassword);
	}

	public void selectUserTypeForNewUser() {
		Select select = new Select(user_type_dropdown);
		select.selectByValue("staff");
	}

	public void clickOnNewUserSaveButton() {
		save_new_user_button.click();
	}

	public void clickOnSearchButton() {
		search_user_button.click();
	}

	public void enterTheUserNameToBeSearched() {
		username_search_field.sendKeys("aaron.suresh");
	}

	public void selectUserTypeForTheUserToBeSearched() {
		Select select = new Select(user_type_select_field);
		select.selectByVisibleText("Staff");
	}

	public void clickOnSearchUsersSearchButton() {
		admin_users_search_button.click();
	}

	public void clickOnResetButton() {
		reset_user_button.click();
	}

}
