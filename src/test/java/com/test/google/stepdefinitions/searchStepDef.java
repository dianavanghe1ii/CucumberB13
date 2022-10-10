package com.test.google.stepdefinitions;

import com.test.google.pages.GoogleHomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import utils.ConfigReader;
import utils.DriverHelper;

public class searchStepDef {
    WebDriver driver= DriverHelper.getDriver();
    GoogleHomePage googleHomePage=new GoogleHomePage(driver);
    @Given("User navigates to the Google page")
    public void user_navigates_to_the_google_page() {
        driver.get(ConfigReader.readProperty("googleurl"));

    }
    @When("User searches for Techtorial")
    public void user_searches_for_techtorial() {
        googleHomePage.searchWord("Techtorial");

    }
    @Then("User validates less than ten links on the Google Page")
    public void user_validates_less_than_ten_links_on_the_google_page() {
        Assert.assertTrue(googleHomePage.validateLinksNumber());
    }
}
