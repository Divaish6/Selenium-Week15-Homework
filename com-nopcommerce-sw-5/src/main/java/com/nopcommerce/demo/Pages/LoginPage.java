package com.nopcommerce.demo.Pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends Utility {

    @CacheLookup
    @FindBy(xpath ="//h1[contains(text(),'Welcome, Please Sign In!')]")
    WebElement welcomePageSignInText;

    @CacheLookup
    @FindBy(xpath ="//button[contains(text(),'Checkout as Guest')]")
    WebElement checkoutAsGuestButton;

    @CacheLookup
    @FindBy(xpath ="//button[contains(text(),'Register')]")
    WebElement registerButton;

    public void verifyWelcomePageSignInText() {

        assertVerifyText(welcomePageSignInText,"Welcome, Please Sign In!");
    }

    public void clickOnCheckoutAsGuestButton() {
        clickOnElement(checkoutAsGuestButton);
    }

    public void clickOnRegisterButton() {
        clickOnElement(registerButton);
    }
}
