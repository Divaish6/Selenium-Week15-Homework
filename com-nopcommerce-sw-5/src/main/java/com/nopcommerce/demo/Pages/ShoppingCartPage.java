package com.nopcommerce.demo.Pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class ShoppingCartPage extends Utility {

    @CacheLookup
    @FindBy(linkText ="Shopping cart")
    WebElement shoppingCartText;

    @CacheLookup
    @FindBy(xpath ="//td[@class='quantity']/child::input")
    WebElement quantity;

    @CacheLookup
    @FindBy(xpath ="//td[@class='quantity']/child::input")
    WebElement qutslear;

    @CacheLookup
    @FindBy(id ="updatecart")
    WebElement updateShoppingCart;

    @CacheLookup
    @FindBy(xpath ="//span[@class='value-summary']//strong")
    WebElement total;

    @CacheLookup
    @FindBy(id ="termsofservice")
    WebElement termsOfServiceCheckBox;

    @CacheLookup
    @FindBy(id ="checkout")
    WebElement checkOutButton;

    @CacheLookup
    @FindBy(xpath ="//span[contains(text(),'(2)')]")
    WebElement verifyQuantity;

    @CacheLookup
    @FindBy(xpath ="//td[@class='subtotal']/span[text()='$2,950.00']")
    WebElement verifyTotal;


    public void verifyShoppingCartText(){

        assertVerifyText(shoppingCartText,"Shopping cart");
    }
    public void changeQuantity(){
        qutslear.clear();

        sendTextToElement(quantity, Keys.BACK_SPACE + "2");
    }
    public void clickOnUpdateCartButton(){
        clickOnElement(updateShoppingCart);
    }
    public void verifyTotalText(){

        assertVerifyText(total,"$698.00");
    }
    public void clickOnTermsOfServiceCheckBox(){
        clickOnElement(termsOfServiceCheckBox);
    }
    public void clickOnCheckOutButton(){
        clickOnElement(checkOutButton);
    }
    public void VerifyQuantity(){

        assertVerifyText(verifyQuantity,"(2)");
    }
    public void VerifyTotal(){

        assertVerifyText(verifyTotal,"$2,950.00");
    }
}
