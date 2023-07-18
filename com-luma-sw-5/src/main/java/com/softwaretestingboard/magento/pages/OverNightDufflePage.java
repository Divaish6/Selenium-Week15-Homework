package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class OverNightDufflePage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//span[@class='base']")
    WebElement overNightDuffleText;

    @CacheLookup
    @FindBy(xpath = "//input[@id='qty']")
    WebElement qty;

    @CacheLookup
    @FindBy(xpath = "//button[@id='product-addtocart-button']")
    WebElement addToCart;
    @CacheLookup
    @FindBy(xpath = "//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']")
    WebElement addToCartText;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='shopping cart']")
    WebElement shoppingCart;


    public String getOverNightDuffelText() {
        return getTextFromElement(overNightDuffleText);
    }

    public void changeQuantityTo3(String newQty) {
         qty.clear();
        sendTextToElement(qty, newQty);
    }

    public void clickOnAddToCart() {
        clickOnElement(addToCart);
    }

    public String getAddToCartText() {
        return getTextFromElement(addToCartText);
    }

    public void clickOnShoppingCart() {
        clickOnElement(shoppingCart);
    }
}
