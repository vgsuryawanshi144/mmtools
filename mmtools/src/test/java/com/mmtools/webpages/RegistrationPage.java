package com.mmtools.webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mmtools.utilities.SeleniumUtility;

public class RegistrationPage extends SeleniumUtility {

	WebDriver driver;

	public RegistrationPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "firstname")
	private WebElement firstNameField;

	@FindBy(id = "lastname")
	private WebElement lastNameField;

	@FindBy(id = "email_address")
	private WebElement emailField;

	@FindBy(id = "password")
	private WebElement passwordField;

	@FindBy(id = "password-confirmation")
	private WebElement confirmPasswordField;

	@FindBy(id = "remember_meRMwFxI6j39")
	private WebElement rememberMeCheckbox;

	@FindBy(id = "send2")
	private WebElement createAccountButton;

	@FindBy(id = "firstname-error")
	private WebElement firstNameError;

	@FindBy(id = "lastname-error")
	private WebElement lastNameError;

	@FindBy(id = "email_address-error")
	private WebElement emailError;
	
	@FindBy(id = "password-error")
	private WebElement passwordError;
	
	@FindBy(id = "password-confirmation-error")
	private WebElement confirmPasswordError;
	
	@FindBy(id = "remember-me-box")
	private WebElement rememberMeError;

	public WebElement getFirstNameField() {
		return firstNameField;
	}

	public void setFirstNameField(WebElement firstNameField) {
		this.firstNameField = firstNameField;
	}

	public WebElement getLastNameField() {
		return lastNameField;
	}

	public void setLastNameField(WebElement lastNameField) {
		this.lastNameField = lastNameField;
	}

	public WebElement getEmailField() {
		return emailField;
	}

	public void setEmailField(WebElement emailField) {
		this.emailField = emailField;
	}

	public WebElement getPasswordField() {
		return passwordField;
	}

	public void setPasswordField(WebElement passwordField) {
		this.passwordField = passwordField;
	}

	public WebElement getConfirmPasswordField() {
		return confirmPasswordField;
	}

	public void setConfirmPasswordField(WebElement confirmPasswordField) {
		this.confirmPasswordField = confirmPasswordField;
	}

	public WebElement getRememberMeCheckbox() {
		return rememberMeCheckbox;
	}

	public void setRememberMeCheckbox(WebElement rememberMeCheckbox) {
		this.rememberMeCheckbox = rememberMeCheckbox;
	}

	public WebElement getCreateAccountButton() {
		return createAccountButton;
	}

	public void setCreateAccountButton(WebElement createAccountButton) {
		this.createAccountButton = createAccountButton;
	}

	// Methods to interact with the registration page elements
	public void enterFirstName(String firstName) {
		firstNameField.clear();
		firstNameField.sendKeys(firstName);
	}

	public void enterLastName(String lastName) {
		lastNameField.clear();
		lastNameField.sendKeys(lastName);
	}

	public void enterEmail(String email) {
		emailField.clear();
		emailField.sendKeys(email);
	}

	public void enterPassword(String password) {
		passwordField.clear();
		passwordField.sendKeys(password);
	}

	public void enterConfirmPassword(String confirmPassword) {
		confirmPasswordField.clear();
		confirmPasswordField.sendKeys(confirmPassword);
	}

	public void clickRememberMeCheckbox() {
		if (!rememberMeCheckbox.isSelected()) {
			rememberMeCheckbox.click();
		}
	}

	public void clickCreateAccountButton() {
		createAccountButton.click();
	}

	public String getFieldErrorMessage(String field) {
		switch (field) {
		case "First Name":
			return firstNameError.getText();
		case "Last Name":
			return lastNameError.getText();
		case "Email Address":
			return emailError.getText();
		case "Password":
			return passwordError.getText();
		case "Confirm Password":
			return confirmPasswordError.getText();
		default:
			return "";
		}
	}
}