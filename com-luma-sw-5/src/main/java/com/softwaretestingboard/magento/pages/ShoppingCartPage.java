package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class ShoppingCartPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//span[@class='base']")
    WebElement shoppingCart;

    @CacheLookup
    @FindBy(xpath = "//td[@class='col item']//a[normalize-space()='Cronus Yoga Pant']")
    WebElement cronusYogaPant;

    @CacheLookup
    @FindBy(xpath = "//dd[contains(text(),'32')]")
    WebElement size;

    @CacheLookup
    @FindBy(xpath = "//dd[contains(text(),'Black')]")
    WebElement color;

    @CacheLookup
    @FindBy(xpath = "//td[@class='col item']//a[normalize-space()='Overnight Duffle']")
    WebElement overNightDuffleText;

    @CacheLookup
    @FindBy(xpath = "(//input[@class='input-text qty'])[1]")
    WebElement qtyText;

    @CacheLookup
    @FindBy(xpath = "//span[@class='cart-price']//span[@class='price'][normalize-space()='$135.00']")
    WebElement productPrice;

    @CacheLookup
    @FindBy(xpath = "(//input[@class='input-text qty'])[1]")
    WebElement qty;

    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Update Shopping Cart']")
    WebElement updateShoppingCart;

    @CacheLookup
    @FindBy(xpath = "//span[@class='cart-price']//span[@class='price'][normalize-space()='$225.00']")
    WebElement updatedProductPrice;

    public String getShoppingCart() {
        return getTextFromElement(shoppingCart);
    }

    public String getCronusYogaPantText() {
        return getTextFromElement(cronusYogaPant);
    }

    public String getSizeText() {
        return getTextFromElement(size);
    }

    public String getColorText() {
        return getTextFromElement(color);
    }

    public String getOverNightDuffleText() {
        return getTextFromElement(overNightDuffleText);
    }

    public String getQty() {
        String qty =  qtyText.getAttribute("value");
        return qty;
    }

    public String getProductPrice() {
        return getTextFromElement(productPrice);
    }

    public void changeQtyOfOverNightDuffle(String newQty) {
        qty.clear();
        sendTextToElement(qty, newQty);
    }

    public void clickOnUpdateShoppingCart() {
        clickOnElement(updateShoppingCart);
    }

    public String getUpdatedProductPrice() {
        return getTextFromElement(updatedProductPrice);
    }

}
