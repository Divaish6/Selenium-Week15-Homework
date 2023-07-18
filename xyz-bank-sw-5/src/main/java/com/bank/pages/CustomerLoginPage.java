package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class CustomerLoginPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Customer Login')]")
    WebElement clickOnLoginTab;

    @CacheLookup
    @FindBy(xpath ="//select[@id='userSelect']")
    WebElement selectYourname;
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Login')]")
    WebElement loginButton;
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Logout')]")
    WebElement verifyLogoutText;
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Logout')]")
    WebElement logOutButtonText;

    public CustomerLoginPage() {
        PageFactory.initElements(driver, this);
    }

    public void clickOnLoginTab() {
        Reporter.log("Clicking on login button" + clickOnLoginTab.toString());
        clickOnElement(clickOnLoginTab);
    }

    public void selectYourname(String text) {
        selectByVisibleTextFromDropDown(selectYourname, text);
    }



    public void userClickOnLoginButton() {

        clickOnElement(loginButton);
    }

    public String verifyLogoutMessage() {

        return getTextFromElement(verifyLogoutText);
    }

    public void clickOnLogOutButton() {

        clickOnElement(logOutButtonText);
    }
}
