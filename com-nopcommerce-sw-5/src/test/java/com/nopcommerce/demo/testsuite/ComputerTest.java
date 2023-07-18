package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.Pages.*;
import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(CustomListeners.class)
public class ComputerTest extends BaseTest {
    HomePage homepage;
    ComputerPage computerPage;
    DesktopPage desktopPage;
    BuildYourOwnComputer buildYourOwnComputer;
    ShoppingCartPage shoppingCartPage;
    LoginPage loginPage;
    CheckoutPage checkoutpage;

    @BeforeMethod(alwaysRun = true)
    public void inIt() {
        homepage = new HomePage();
        computerPage = new ComputerPage();
        desktopPage = new DesktopPage();
        buildYourOwnComputer = new BuildYourOwnComputer();
        shoppingCartPage = new ShoppingCartPage();
        loginPage = new LoginPage();
        checkoutpage = new CheckoutPage();
    }

    @Test(groups = {"sanity","regression"})
    public void verifyProductArrangeInAlphaBaticalOrder() throws InterruptedException {
        //1.1 Click on Computer Menu.
        homepage.selectMenu("Computers");
        //1.2 Click on Desktop Category
        desktopPage.clickonDesktop();
        //1.3 Select Sort By position "Name: Z to A"
        desktopPage.clickOnSortByNameZToA();
        //1.4 Verify the Product will arrange in Descending order.
        desktopPage.verifyProductsArrangedInAlphabeticallyDescendingOrder();
    }

    @Test(groups = {"sanity","smoke","regression"})
    public void verifyProductAddedToShoppingCartSuccessFully() throws InterruptedException {
        //2.1 Click on Computer Menu.
        homepage.selectMenu("Computers");
        //2.2 Click on Desktop
        computerPage.clickOnDesktopCategory();
        //2.3 Select Sort By position "Name: A to Z"
        desktopPage.clickOnSortByNameAToZ();
        //2.4 Click on "Add To Cart"
        Thread.sleep(1000);
        desktopPage.clickOnAddToCartButton();
        //2.5 Verify the Text "Build your own computer"
        buildYourOwnComputer.verifyTextFromBuildownComputer();
        //2.6 Select "2.2 GHz Intel Pentium Dual-Core E2200" using Select class
        buildYourOwnComputer.selectProcessor("2.2 GHz Intel Pentium Dual-Core E2200");
        //2.7.Select "8GB [+$60.00]" using Select class.
        buildYourOwnComputer.selectRAM("8GB [+$60.00]");
        //2.8 Select HDD radio "400 GB [+$100.00]"
        buildYourOwnComputer.selectHDDRadio();
        //2.9 Select OS radio "Vista Premium [+$60.00]"
        buildYourOwnComputer.selectOSRadio();
        //2.10 Check Two Check boxes "Microsoft Office [+$50.00]" and "Total Commander [+$5.00]"
        buildYourOwnComputer.selectTotalCommander();
        Thread.sleep(5000);
        //2.11 Verify the price "$1,475.00"
        buildYourOwnComputer.verifyTextFromPrice();
        //2.12 Click on "ADD TO CARD" Button.
        buildYourOwnComputer.clickOnAddToCartButton();
        //2.13 Verify the Message "The product has been added to your shopping cart" on Top green Bar After that close the bar clicking on the cross button.
        buildYourOwnComputer.verifyTheProductHasBeenAddedToYourShoppingCart();
        buildYourOwnComputer.closeTheBarByClickingOnTheCrossButton();
        //2.14 Then MouseHover on "Shopping cart" and Click on "GO TO CART" button.
        buildYourOwnComputer.mouseHoverOnShoppingCartButton();
        buildYourOwnComputer.clickOnGoToCartButton();
        //2.15 Verify the message "Shopping cart"
        shoppingCartPage.verifyShoppingCartText();
        Thread.sleep(2000);
        //2.16 Change the Qty to "2" and Click on "Update shopping cart"
        shoppingCartPage.changeQuantity();
        shoppingCartPage.clickOnUpdateCartButton();
        //2.17 Verify the Total"$2,950.00
        shoppingCartPage.VerifyTotal();
        // 2.18 click on checkbox “I agree with the terms of service”
        shoppingCartPage.clickOnTermsOfServiceCheckBox();
        // 2.19 Click on “CHECKOUT”
        shoppingCartPage.clickOnCheckOutButton();
        // 2.20 Verify the Text “Welcome, Please Sign In!”
        loginPage.verifyWelcomePageSignInText();
        //2.21 Click on “CHECKOUT AS GUEST”Tab
        loginPage.clickOnCheckoutAsGuestButton();
        //2.22 Fill the all mandatoryfield
        checkoutpage.inputFirstname("Roma");
        checkoutpage.inputLastname("Monam");
        checkoutpage.inputEmail("DIUESHO@gmail.com");
        checkoutpage.selectCountry("United Kingdom");
        checkoutpage.inputCity("London");
        checkoutpage.inputAddress1("123 High Street");
        checkoutpage.inputPostalCode("EC127YS");
        checkoutpage.inputPhoneNumber("12345678");
        //2.23 Click on “CONTINUE”
        checkoutpage.clickOnContinueButton();
        //2.24 Click on Radio Button “Next Day Air($0.00)”
        checkoutpage.clickOnNextDayAirRadioButton();
        // 2.25 Click on “CONTINUE”
        checkoutpage.clickOnContinueButton1();
        // 2.26 Select Radio Button “Credit Card”
        checkoutpage.clickOnCreditCard();
        checkoutpage.clickOnPaymentContinueButton();
        //2.27 Select “Master card” From Select credit card dropdown
        checkoutpage.selectCreditCard("Master card");
        //2.28 Fill all the details
        checkoutpage.inputCardHolderName("Mr D ROMAN");
        checkoutpage.inputCardNumber("5356 6548 1418 5420");
        checkoutpage.selectExpireMonth("12");
        checkoutpage.selectExpireYear("2025");
        checkoutpage.inputCardCode("789");
        // 2.29 Click on “CONTINUE”
        checkoutpage.clickOnContinueButton2();
        //2.30 Verify “Payment Method” is “Credit Card”
        checkoutpage.verifyCreditCardText();
        // 2.32 Verify “Shipping Method” is “Next Day Air”
        checkoutpage.verifyNextDayAirText();
        //2.33 Verify Total is “$2,950.00”
        checkoutpage.verifyTotalAmountText();
        //2.34 Click on “CONFIRM”
        checkoutpage.clickOnConfirmButton();
        //2.35 Verify the Text “Thank You”
        checkoutpage.verifyThankYouText();
        // 2.36 Verify the message “Your order has been successfully processed!”
        checkoutpage.verifyOrderSuccessProcessText();
        // 2.37 Click on “CONTINUE”
        checkoutpage.clickOnContinueButton3();
        // 2.38 Verify the text “Welcome to our store”
        homepage.verifyWelcomeOurStoreText();
    }
}
