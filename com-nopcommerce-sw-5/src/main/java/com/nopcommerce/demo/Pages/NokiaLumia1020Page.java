package com.nopcommerce.demo.Pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class NokiaLumia1020Page extends Utility {

    @CacheLookup
    @FindBy(xpath ="//h1[contains(text(),'Nokia Lumia 1020')]")
    WebElement nokiaLumiaText;

    @CacheLookup
    @FindBy(id ="price-value-20")
    WebElement nokiaPriceText;

    @CacheLookup
    @FindBy(id ="product_enteredQuantity_20")
    WebElement cartQuantity;

    @CacheLookup
    @FindBy(id ="product_enteredQuantity_20")
    WebElement cleaqQuantity;

    @CacheLookup
    @FindBy(id ="add-to-cart-button-20")
    WebElement addToCartButton;

    @CacheLookup
    @FindBy(xpath ="//body/div[@id='bar-notification']/div[1]/p[1]")
    WebElement productAddedToCartText;

    @CacheLookup
    @FindBy(xpath ="//span[@title='Close']")
    WebElement closeTheBarMsg;

    @CacheLookup
    @FindBy(xpath ="//span[contains(text(),'Shopping cart')]")
    WebElement shoppingCartElement;

    @CacheLookup
    @FindBy(xpath ="//button[contains(text(),'Go to cart')]")
    WebElement goToCartElement;

    public void verifyNokiaLumiaText() {

        assertVerifyText(nokiaLumiaText,"Nokia Lumia 1020");
    }

    public void verifyNokiaPriceText() {

        assertVerifyText(nokiaPriceText,"$349.00");
    }

    public void changeQuantity(String text) {
        cleaqQuantity.clear();
        sendTextToElement(cartQuantity,text);
    }

    public void clickOnAddToCartButton() {
        clickOnElement(addToCartButton);
    }

    public void  verifyTextFromProductAddedToCart() {

        assertVerifyText(productAddedToCartText,"The product has been added to your shopping cart");
    }

    public void closeTheBarByClickingOnTheCrossButton() {
        clickOnElement(closeTheBarMsg);
    }

    public void mouseHoverOnShoppingCart() {
        mouseHoverToElement(shoppingCartElement);
    }

    public void clickOnShoppingCart() {
        clickOnElement(goToCartElement);
    }
}
