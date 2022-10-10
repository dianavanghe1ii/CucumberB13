package com.test.google.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class GoogleHomePage {
    public GoogleHomePage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//input[@name='q']")
    WebElement searchBar;
    @FindBy(xpath = "//a//h3")
    List<WebElement> links;


    public void searchWord(String word){
        searchBar.sendKeys(word, Keys.ENTER);
    }
    public boolean validateLinksNumber(){
        if (links.size()<10){
            return true;
        }
        return false;
    }
}
/*
public boolean validateResult(){
        if(result.getText().contains("50,000")){
            return true;
        }
        return false;
    }

    public void validateHeaders(String word){
        for(WebElement header:allHeaders){
            if(!BrowserUtils.getText(header).equals("")){
                Assert.assertTrue(BrowserUtils.getText(header).toLowerCase().contains(word));
            }
        }
    }
 */

