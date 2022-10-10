package com.test.smartbear.stepdefinitions;

import com.test.smartbear.pages.LoginPage;
import com.test.smartbear.pages.MainPage;
import com.test.smartbear.pages.OrderPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import utils.ConfigReader;
import utils.DriverHelper;

import java.util.List;
import java.util.Map;

public class OrderStepDef {
    WebDriver driver = DriverHelper.getDriver();
    LoginPage loginPage = new LoginPage(driver);
    MainPage mainPage = new MainPage(driver);
    OrderPage orderPage = new OrderPage(driver);

    @When("User provides valid username and password")
    public void user_provides_valid_username_and_password() {
        loginPage.login(ConfigReader.readProperty("smartbearusername"), ConfigReader.readProperty("smartbearpassword"));
    }

    @Then("User validates the title {string} and clicks Order Button")
    public void user_validates_the_title_and_clicks_order_button(String title) {
        Assert.assertEquals(title, driver.getTitle().trim());
        mainPage.clickOrderButton();
    }

    @When("User enters the product information {string} and {string}")
    public void user_enters_the_product_information_and(String productName, String quantity) {
        orderPage.provideProductInformation(productName, quantity);
    }

    @When("User enters address information {string}, {string}, {string},{string}, {string}")
    public void user_enters_address_information(String name, String street, String city, String state, String zip) {
        orderPage.provideAddressInformation(name, street, city, state, zip);
    }

    @When("User enters payment information {string}, {string},{string}")
    public void user_enters_payment_information(String cardNumber, String expiration, String cardType) {
        orderPage.providePaymentInformation(cardNumber, expiration, cardType);
    }

    @Then("User clicks Process button and validates the message {string}")
    public void user_clicks_process_button_and_validates_the_message(String message) {
        orderPage.validateMessage(message);
    }

    @Then("User validates the title and clicks Order Button")
    public void user_validates_the_title_and_clicks_order_button(DataTable dataTable) {
        Map<String, String> title = dataTable.asMap();
        Assert.assertEquals(title.get("title"), driver.getTitle().trim());
        mainPage.clickOrderButton();
    }

    @When("User enters the product information")
    public void user_enters_the_product_information(DataTable dataTable) {
        Map<String, String> productInformation = dataTable.asMap();
        orderPage.provideProductInformation(productInformation.get("productName"), productInformation.get("quantity"));
    }

    @When("User enters address information")
    public void user_enters_address_information(DataTable dataTable) {
        Map<String, String> addressInformation = dataTable.asMap();
        orderPage.provideAddressInformation(addressInformation.get("customerName"),
                addressInformation.get("street"),
                addressInformation.get("city"),
                addressInformation.get("state"),
                addressInformation.get("zipcode"));
    }

    @When("User enters payment information")
    public void user_enters_payment_information(DataTable dataTable) {
        Map<String, String> paymentInformation = dataTable.asMap();
        orderPage.providePaymentInformation(paymentInformation.get("cardNumber"),
                paymentInformation.get("expirationDate"),
                paymentInformation.get("cardType"));
    }

    @Then("User clicks Process button and validates the message")
    public void user_clicks_process_button_and_validates_the_message(DataTable dataTable) {
        List<String> message=dataTable.asList();
        orderPage.validateMessage(message.get(0));
    }

}
