package com.mmtools.stepDefinitions;

import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.mmtools.utilities.SeleniumUtility;
import com.mmtools.webpages.RegistrationPage;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegistrationSteps extends SeleniumUtility {
	WebDriver driver;
	RegistrationPage registrationPage;

	@Given("the user is on the Registration page")
    public void the_user_is_on_the_registration_page() {
        setUp("Chrome", "https://www.mmtoolparts.com/customer/account/create/");
        registrationPage = new RegistrationPage(driver);
    }

}