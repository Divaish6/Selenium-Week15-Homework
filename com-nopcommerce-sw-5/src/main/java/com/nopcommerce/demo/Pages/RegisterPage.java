package com.nopcommerce.demo.Pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends Utility {

    @CacheLookup
    @FindBy(linkText ="Register")
    WebElement registerText;

    @CacheLookup
    @FindBy(id ="FirstName")
    WebElement firstNameTextBox;

    @CacheLookup
    @FindBy(id ="LastName")
    WebElement lastNameTextBox;

    @CacheLookup
    @FindBy(id ="Email")
    WebElement emailTextBox;

    @CacheLookup
    @FindBy(id ="Password")
    WebElement passwordTextBox;

    @CacheLookup
    @FindBy(id ="ConfirmPassword")
    WebElement confirmPasswordTextBox;

    @CacheLookup
    @FindBy(id ="register-button")
    WebElement registerButton;

    @CacheLookup
    @FindBy(xpath ="//div[contains(text(),'Your registration completed')]")
    WebElement registerSuccessText;

    @CacheLookup
    @FindBy(xpath ="//a[contains(text(),'Continue')]")
    WebElement continueButton;

    public void verifyRegisterText() {

        assertVerifyText(registerText,"Register");
    }

    public void inputFirstname(String firstname) {
        sendTextToElement(firstNameTextBox, firstname);
    }

    public void inputLastname(String lastname) {
        sendTextToElement(lastNameTextBox, lastname);
    }

    public void inputEmail(String email) {
        sendTextToElement(emailTextBox, email);
    }

    public void inputPassword(String password) {
        sendTextToElement(passwordTextBox, password);
    }

    public void inputConfirmPassword(String confirmpassword) {
        sendTextToElement(confirmPasswordTextBox, confirmpassword);
    }

    public void clickOnRegisterButton() {
        clickOnElement(registerButton);
    }

    public void verifyRegisterSuccessText() {

        assertVerifyText(registerSuccessText,"Your registration completed");
    }

    public void clickOnContinueButton() {
        clickOnElement(continueButton);
    }

}
