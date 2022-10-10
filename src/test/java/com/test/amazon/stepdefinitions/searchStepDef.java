package com.test.amazon.stepdefinitions;

import com.test.amazon.pages.AmazonHomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import utils.ConfigReader;
import utils.DriverHelper;

public class searchStepDef {
    WebDriver driver= DriverHelper.getDriver();
    AmazonHomePage amazonHomePage=new AmazonHomePage(driver);
    @Given("User navigates to the Amazon page")
    public void user_navigates_to_the_amazon_page() {
        driver.get(ConfigReader.readProperty("amazonurl"));
    }
    @When("User searches for iphone thirteen case")
    public void user_searches_for_iphone_thirteen_case() {
        amazonHomePage.searchWord("iphone 13 case");

    }
    @Then("User validates the number is fifty thousands results")
    public void user_validates_the_number_is_fifty_thousands_results() {
        Assert.assertTrue(amazonHomePage.validateResult());
    }
    @Then("User validates all headers containing iPhone")
    public void user_validates_all_headers_containing_i_phone() {
        amazonHomePage.validateHeaders("iphone");
    }

}
