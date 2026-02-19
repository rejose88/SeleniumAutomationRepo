package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.PageUtility;
import utilities.WaitUtility;

public class AdminUsersPage {

	public WebDriver driver;
	WaitUtility waitutility = new WaitUtility();
	PageUtility pageutility = new PageUtility();

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
	@FindBy(xpath = "//select[@id='ut']")
	WebElement user_type_select_field;
	@FindBy(xpath = "//button[@name='Search']")
	WebElement admin_users_search_button;
	@FindBy(xpath = "//h5[text()=' Alert!']")
	WebElement user_created_successfully_alert;
	@FindBy(xpath = "//table[@class='table table-bordered table-hover table-sm']/tbody/tr[1]/td")
	WebElement user_search_result;
	@FindBy(xpath = "//table[@class='table table-bordered table-hover table-sm']/tbody/tr[1]/td")
	WebElement user_refresh_display;

	public AdminUsersPage clickOnNewUserButton() {
		add_new_user_button.click();
		return this;
	}

	public AdminUsersPage enterNewUsername(String newUserName) {
		add_new_user_username_field.sendKeys(newUserName);
		return this;
	}

	public AdminUsersPage enterPasswordForNewUser(String newPassword) {
		add_new_user_password_field.sendKeys(newPassword);
		return this;
	}

	public AdminUsersPage selectUserTypeForNewUser(String new_user_type) {

		pageutility.selectDropdownWithValue(user_type_dropdown, new_user_type); // calling pageutility class
		return this;

	}

	public AdminUsersPage clickOnNewUserSaveButton() {
		waitutility.waitUntilElementToBeClickable(driver, add_new_user_button); // calling waitutility class
		save_new_user_button.click();
		return this;
	}

	public AdminUsersPage clickOnSearchButton() {
		search_user_button.click();
		return this;
	}

	public AdminUsersPage enterTheUserNameToBeSearched(String username_to_be_searched) {
		username_search_field.sendKeys(username_to_be_searched);
		return this;
	}

	public AdminUsersPage selectUserTypeForTheUserToBeSearched(String user_type_to_be_searched) {
		pageutility.selectDropdownWithVisibleText(user_type_select_field, user_type_to_be_searched); // calling
																										// pageutility
																										// class
		return this;

	}

	public AdminUsersPage clickOnSearchUsersSearchButton() {
		admin_users_search_button.click();
		return this;
	}

	public AdminUsersPage clickOnResetButton() {
		reset_user_button.click();
		return this;
	}

	public boolean userCreatedSuccessfullyAlertDisplay() {
		return user_created_successfully_alert.isDisplayed();
	}

	public boolean userSearchedSuccessfully() {

		return user_search_result.isDisplayed();
	}

	public boolean usersRefreshedSuccessfully() {

		return user_refresh_display.isDisplayed();
	}

}
