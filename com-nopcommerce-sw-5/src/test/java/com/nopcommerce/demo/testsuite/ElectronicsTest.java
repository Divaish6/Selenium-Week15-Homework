package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.Pages.*;
import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListeners.class)
public class ElectronicsTest extends BaseTest {
    ElectronicsPage electronicsPage;
    CellPhonePage cellPhonesPage;
    NokiaLumia1020Page nokiaLumia1020Page;
    ShoppingCartPage shoppingCartPage ;
    LoginPage loginPage;
    RegisterPage registerPage;
    CheckoutPage checkoutPage;
    HomePage homePage;

    @BeforeMethod(alwaysRun = true)
    public void inIt() {
        electronicsPage = new ElectronicsPage();
        cellPhonesPage = new CellPhonePage();
        nokiaLumia1020Page = new NokiaLumia1020Page();
        shoppingCartPage = new ShoppingCartPage();
        loginPage = new LoginPage();
        registerPage = new RegisterPage();
        checkoutPage = new CheckoutPage();
        homePage = new HomePage();
    }

    @Test(groups = {"sanity","regression"})
    public void verifyUserShouldNavigateToCellPhonesPageSuccessfully() {
        //1.1 Mouse Hover on “Electronics” Tab
        electronicsPage.hoverOnElectronics();
        //1.2 Mouse Hover on “Cell phones” and click
        electronicsPage.hoverOnCellPhoneAndClick();
        //1.3 Verify the text “Cell phones”
        cellPhonesPage.verifyCellPhoneText();
    }

    @Test(groups = {"sanity","smoke","regression"})
    public void verifyThatTheProductAddedSuccessfullyAndPlaceOrderSuccessfully() throws InterruptedException {
        //2.1 Mouse Hover on “Electronics” Tab
        electronicsPage.hoverOnElectronics();
        //2.2 Mouse Hover on “Cell phones” and click
        electronicsPage.hoverOnCellPhoneAndClick();
        //2.3 Verify the text “Cell phones”
        cellPhonesPage.verifyCellPhoneText();
        //2.4 Click on List View Tab
        cellPhonesPage.clickOnListViewTab();
        //2.5 Click on product name “Nokia Lumia 1020” link
        Thread.sleep(1000);
        cellPhonesPage.clickOnNokiaLumia1020();
        //2.6 Verify the text “Nokia Lumia 1020”
        nokiaLumia1020Page.verifyNokiaLumiaText();
        //2.7 Verify the price “$349.00”
        nokiaLumia1020Page.verifyNokiaPriceText();
        //2.8 Change quantity to 2
        nokiaLumia1020Page.changeQuantity("2");
        //2.9 Click on “ADD TO CART” tab
        nokiaLumia1020Page.clickOnAddToCartButton();
        //2.10 Verify the Message "The product has been added to your shopping cart" on Top green Bar  After that close the bar clicking on the cross button.
        nokiaLumia1020Page.verifyTextFromProductAddedToCart();
        nokiaLumia1020Page.closeTheBarByClickingOnTheCrossButton();
        //2.11 Then MouseHover on "Shopping cart" and Click on "GO TO CART" button.
        nokiaLumia1020Page.mouseHoverOnShoppingCart();
        nokiaLumia1020Page.clickOnShoppingCart();
        //2.12 Verify the message "Shopping cart"
        shoppingCartPage.verifyShoppingCartText();
        //2.13 Verify the quantity is 2
        //shoppingCartPage.verifyTotalText();
        //2.14 Verify the Total $698.00
        shoppingCartPage.verifyTotalText();
        //2.15 click on checkbox “I agree with the terms of service”
        shoppingCartPage.clickOnTermsOfServiceCheckBox();
        //2.16 Click on “CHECKOUT”
        shoppingCartPage.clickOnCheckOutButton();
        //2.17 Verify the Text “Welcome, Please Sign In!”
        loginPage.verifyWelcomePageSignInText();
        //2.18 Click on “REGISTER” tab
        loginPage.clickOnRegisterButton();
        //2.19 Verify the text “Register”
        registerPage.verifyRegisterText();
        //2.20 Fill the mandatory fields
        registerPage.inputFirstname("Roman");
        registerPage.inputLastname("monan");
        registerPage.inputEmail("Romanmo@gmail.com");
        registerPage.inputPassword("Diuesh123");
        registerPage.inputConfirmPassword("Diuesh123");
        //2.21 Click on “REGISTER” Button
        registerPage.clickOnRegisterButton();
        //2.22 Verify the message “Your registration completed”
        registerPage.verifyRegisterSuccessText();
        //2.23 Click on “CONTINUE” tab
        registerPage.clickOnContinueButton();
        //2.24 Verify the text “Shopping card”
        shoppingCartPage.verifyShoppingCartText();
        //2.25 click on checkbox “I agree with the terms of service”
        // Doesn't work after this due to the Bug in the Website
        //shoppingCartPage.clickOnTermsOfServiceCheckBox();
        //2.26 Click on “CHECKOUT”
        shoppingCartPage.clickOnCheckOutButton();

        //2.27 Fill the Mandatory fields
        checkoutPage.inputFirstname("Diuesh");
        checkoutPage.inputLastname("Roam");
        checkoutPage.inputEmail("Divuesh23@gmail.com");
        checkoutPage.selectCountry("United Kingdom");
        checkoutPage.inputCity("London");
        checkoutPage.inputAddress1("123 HighStreet");
        checkoutPage.inputPostalCode("N15YQ");
        checkoutPage.inputPhoneNumber("12345678");
        //2.28 Click on “CONTINUE”
        checkoutPage.clickOnContinueButton();
        //2.29 Click on Radio Button “2nd Day Air ($0.00)”
        checkoutPage.clickOnRadioButton2ndDayAir();
        // 2.30 Click on “CONTINUE”
        checkoutPage.clickOnContinueButton1();
        // 2.31 Select Radio Button “Credit Card”
        checkoutPage.clickOnCreditCard();
        checkoutPage.clickOnPaymentContinueButton();
        // 2.32 Select “Visa” From Select credit card dropdown
        checkoutPage.selectCreditCard("Visa");
        //2.33 Fill all the details
        checkoutPage.inputCardHolderName("Mr D roman");
        checkoutPage.inputCardNumber("5356 6548 1418 5420");
        checkoutPage.selectExpireMonth("12");
        checkoutPage.selectExpireYear("2025");
        checkoutPage.inputCardCode("789");
        //2.34 Click on “CONTINUE”CHECKOUT
        checkoutPage.clickOnContinueButton2();
        // 2.35 Verify “Payment Method” is “Credit Card”
        checkoutPage.verifyCreditCardText();
        // 2.36 Verify “Shipping Method” is “2nd Day Air”
        checkoutPage.verify02ndDayText();
        // 2.37 Verify Total is “$698.00”
        checkoutPage.verifyTotalAmountNokiaText();
        // 2.38 Click on “CONFIRM”
        checkoutPage.clickOnConfirmButton();
        //2.39 Verify the Text “Thank You”
        checkoutPage.verifyThankYouText();
        //2.40 Verify the message “Your order has been successfully processed!”
        checkoutPage.verifyOrderSuccessProcessText();
        // 2.41 Click on “CONTINUE”
        checkoutPage.clickOnContinueButton3();
        // 2.42 Verify the text “Welcome to our store”
        homePage.verifyWelcomeOurStoreText();
        // 2.43 Click on “Logout” link
        homePage.clickOnLogOutButton();
        // 2.44 Verify the URL is “https://demo.nopcommerce.com/”
        String actualURL = driver.getCurrentUrl();
        // org.junit.Assert.assertEquals(actualURL, "https://demo.nopcommerce.com/" );
        Assert.assertEquals(actualURL, "https://demo.nopcommerce.com/", "error");

    }
}
