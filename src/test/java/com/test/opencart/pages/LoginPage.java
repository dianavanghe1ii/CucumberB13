package com.test.opencart.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public LoginPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    @FindBy(id="input-username")
    WebElement username;
    @FindBy(id="input-password")
    WebElement password;
    @FindBy(xpath = "//button[contains(text(),'Login')]")
    WebElement loginButton;
    public void login(String userName, String passWord){
        this.username.sendKeys(userName);
        this.password.sendKeys(passWord);
        loginButton.click();

    }

}
