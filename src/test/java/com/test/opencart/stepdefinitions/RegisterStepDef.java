package com.test.opencart.stepdefinitions;

import com.test.opencart.pages.LoginPage;
import com.test.opencart.pages.MainPage;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import utils.ConfigReader;
import utils.DriverHelper;

public class RegisterStepDef {
    WebDriver driver= DriverHelper.getDriver();
    LoginPage loginPage=new LoginPage(driver);
    MainPage mainPage=new MainPage(driver);
    @Given("User provides valid username and password for openChart website")
    public void user_provides_valid_username_and_password_for_open_chart_website() {
        loginPage.login(ConfigReader.readProperty("opencartusername"),ConfigReader.readProperty("opencartpassword"));
    }
    @Given("User clicks the close button from alert pop-up")
    public void user_clicks_the_close_button_from_alert_pop_up() throws InterruptedException {
        mainPage.clickClosePopUp();
    }
    @When("User clicks the Customer button and validates the {string}")
    public void user_clicks_the_customer_button_and_validates_the(String title) {
        mainPage.clickCustomersButton();
        Assert.assertEquals(title,driver.getTitle().trim());
    }
    @When("User clicks the Add button and validates the {string}")
    public void user_clicks_the_add_button_and_validates_the(String string) {

    }
    @When("User click the Address button and provides {string}, {string}, {string}, {string}, {string}, {string}")
    public void user_click_the_address_button_and_provides(String string, String string2, String string3, String string4, String string5, String string6) {

    }
    @Then("user clicks the Save button and validates the message {string}")
    public void user_clicks_the_save_button_and_validates_the_message(String string) {

    }


}
