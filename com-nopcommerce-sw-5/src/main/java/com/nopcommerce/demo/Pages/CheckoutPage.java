package com.nopcommerce.demo.Pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class CheckoutPage extends Utility {

    @CacheLookup
    @FindBy(id ="BillingNewAddress_FirstName")
    WebElement firstNameTextBox;

    @CacheLookup
    @FindBy(id ="BillingNewAddress_LastName")
    WebElement lastNameTextBox;

    @CacheLookup
    @FindBy(id ="BillingNewAddress_Email")
    WebElement emailTextBox;

    @CacheLookup
    @FindBy(id ="BillingNewAddress_CountryId")
    WebElement countryDropdown;

    @CacheLookup
    @FindBy(id ="BillingNewAddress_City")
    WebElement cityTextBox;

    @CacheLookup
    @FindBy(id ="BillingNewAddress_Address1")
    WebElement address1TextBox;

    @CacheLookup
    @FindBy(id ="BillingNewAddress_ZipPostalCode")
    WebElement postalcodeTextBox;

    @CacheLookup
    @FindBy(id ="BillingNewAddress_PhoneNumber")
    WebElement phoneNumberTextBox;

    @CacheLookup
    @FindBy(xpath ="//button[@onclick='Billing.save()']")
    WebElement continueButton;

    @CacheLookup
    @FindBy(id ="shippingoption_1")
    WebElement nextDayAirRadioButton;

    @CacheLookup
    @FindBy(id ="paymentmethod_1")
    WebElement creditCard;

    @CacheLookup
    @FindBy(xpath ="//button[@class='button-1 payment-method-next-step-button']")
    WebElement paymentContinue;

    @CacheLookup
    @FindBy(xpath ="//button[@onclick='ShippingMethod.save()']")
    WebElement continueButton1;

    @CacheLookup
    @FindBy(id ="CreditCardType")
    WebElement creditCardDropDown;

    @CacheLookup
    @FindBy(id ="CardholderName")
    WebElement cardHolderName;

    @CacheLookup
    @FindBy(id ="CardNumber")
    WebElement cardNumber;

    @CacheLookup
    @FindBy(id ="ExpireMonth")
    WebElement expireMonthDropdown;

    @CacheLookup
    @FindBy(id ="ExpireYear")
    WebElement expireYearDropdown;

    @CacheLookup
    @FindBy(id ="CardCode")
    WebElement cardCode;

    @CacheLookup
    @FindBy(xpath ="//button[@class='button-1 payment-info-next-step-button']")
    WebElement continueButton2;

    @CacheLookup
    @FindBy(xpath ="//span[contains(text(),'Credit Card')]")
    WebElement creditCardText;

    @CacheLookup
    @FindBy(xpath ="//span[contains(text(),'Next Day Air')]")
    WebElement nextDayAirText ;

    @CacheLookup
    @FindBy(xpath ="//span[@class='value-summary']//strong[contains(text(),'$2,950.00')]")
    WebElement totalAmountText;

    @CacheLookup
    @FindBy(xpath ="//button[contains(text(),'Confirm')]")
    WebElement confirmButton;

    @CacheLookup
    @FindBy(xpath ="//h1[contains(text(),'Thank you')]")
    WebElement thankYouText;

    @CacheLookup
    @FindBy(xpath ="//strong[contains(text(),'Your order has been successfully processed!')]")
    WebElement orderSuccessProcessText;

    @CacheLookup
    @FindBy(xpath ="//button[contains(text(),'Continue')]")
    WebElement continueButton3;

    @CacheLookup
    @FindBy(id ="shippingoption_2")
    WebElement radioButton2ndDayAir;

    @CacheLookup
    @FindBy(xpath ="//span[contains(.,'2nd Day Air')]")
    WebElement secondDayAirText;

    @CacheLookup
    @FindBy(xpath ="//span[@class='value-summary']//strong[contains(text(),'$2,950.00')]")
    WebElement totalAmountNokiaText;

    public void inputFirstname(String firstname){
        sendTextToElement(firstNameTextBox, firstname);
    }
    public void inputLastname(String lastname){
        sendTextToElement(lastNameTextBox, lastname);
    }
    public void inputEmail(String email){
        sendTextToElement(emailTextBox, email);
    }
    public void selectCountry(String countryname){
        selectByVisibleTextFromDropDown(countryDropdown,countryname);
    }
    public void inputCity(String cityname){
        sendTextToElement(cityTextBox,cityname);
    }
    public void inputAddress1(String address){
        sendTextToElement(address1TextBox,address);
    }
    public void inputPostalCode(String postcode){
        sendTextToElement(postalcodeTextBox,postcode);
    }
    public void inputPhoneNumber(String phone){
        sendTextToElement(phoneNumberTextBox,phone);
    }
    public void clickOnContinueButton(){
        clickOnElement(continueButton);
    }
    public void clickOnNextDayAirRadioButton(){
        clickOnElement(nextDayAirRadioButton);
    }
    public void clickOnContinueButton1(){
        clickOnElement(continueButton1);
    }
    public void clickOnCreditCard(){
        clickOnElement(creditCard);
    }
    public void clickOnPaymentContinueButton(){
        clickOnElement(paymentContinue);
    }
    public void selectCreditCard(String card){
        selectByVisibleTextFromDropDown(creditCardDropDown,card);
    }

    public void inputCardHolderName(String holdername)
    {
        sendTextToElement(cardHolderName,holdername);
    }
    public void inputCardNumber(String card){
        sendTextToElement(cardNumber, card);

    }
    public void selectExpireMonth(String expirymonth){
        selectByVisibleTextFromDropDown(expireMonthDropdown,expirymonth);
    }
    public void selectExpireYear(String expiryyear){
        selectByVisibleTextFromDropDown(expireYearDropdown,expiryyear);
    }
    public void inputCardCode(String cvc){
        sendTextToElement(cardCode,cvc);
    }
    public void clickOnContinueButton2()
    {
        clickOnElement(continueButton2);
    }
    public void verifyCreditCardText(){

       assertVerifyText(creditCardText,"Credit Card");
    }
    public void verifyNextDayAirText(){

       assertVerifyText(nextDayAirText,"Next Day Air");
    }
    public void verifyTotalAmountText(){

        assertVerifyText(totalAmountText,"$2,950.00");
    }
    public void clickOnConfirmButton(){
        clickOnElement(confirmButton);
    }
    public void verifyThankYouText(){

        assertVerifyText(thankYouText,"Thank you");
    }
    public void verifyOrderSuccessProcessText(){

        assertVerifyText(orderSuccessProcessText,"Your order has been successfully processed!");
    }
    public void clickOnContinueButton3(){
        clickOnElement(continueButton3);
    }
    public void clickOnRadioButton2ndDayAir(){
        clickOnElement(radioButton2ndDayAir);
    }
    public void verify02ndDayText(){

        assertVerifyText(secondDayAirText,"2nd Day Air");
    }
    public void verifyTotalAmountNokiaText(){

        assertVerifyText(totalAmountNokiaText,"$698.00");
    }
}
