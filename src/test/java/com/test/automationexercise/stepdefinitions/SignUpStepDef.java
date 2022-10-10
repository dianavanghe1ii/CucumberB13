package com.test.automationexercise.stepdefinitions;

import com.test.automationexercise.pages.AutomationHomePage;
import com.test.automationexercise.pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import utils.ConfigReader;
import utils.DriverHelper;

public class SignUpStepDef {
    WebDriver driver= DriverHelper.getDriver();
    AutomationHomePage automationHomePage=new AutomationHomePage(driver);
    LoginPage loginPage=new LoginPage(driver);
    @Given("User navigates to automationExercise webpage")
    public void user_navigates_to_automation_exercise_webpage() {
        driver.get(ConfigReader.readProperty("automationurl"));
    }
    @Given("User validates the url of the page")
    public void user_validates_the_url_of_the_page() {
        Assert.assertEquals("https://www.automationexercise.com/",driver.getCurrentUrl().trim());
    }
    @When("User click signupLogin button")
    public void user_click_signup_login_button() {
       automationHomePage.clickSignUpButton();
    }
    @Then("User verifies New User Signup is visible")
    public void user_verifies_new_user_signup_is_visible() {
        Assert.assertTrue(loginPage.validateHeader());
    }
    @Then("User enters name, email address and signup button")
    public void user_enters_name_email_address_and_signup_button() {
       loginPage.sendingInfo("diana1","diana123456@gmail.com");
    }

}
