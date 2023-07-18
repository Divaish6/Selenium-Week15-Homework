package com.nopcommerce.demo.Pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class BuildYourOwnComputer extends Utility {

    @CacheLookup
    @FindBy(xpath ="//div[@class='product-name']/h1")
    WebElement buildYourComputerText;

    @CacheLookup
    @FindBy(xpath ="//select[@name='product_attribute_1']")
    WebElement processor;

    @CacheLookup
    @FindBy(css ="#product_attribute_2")
    WebElement ram;

    @CacheLookup
    @FindBy(xpath ="//input[@id='product_attribute_3_7']")
    WebElement hddRadio;

    @CacheLookup
    @FindBy(xpath ="//label[text()='Vista Premium [+$60.00]']")
    WebElement osRadio;

    @CacheLookup
    @FindBy(xpath ="//input[@id='product_attribute_5_10']")
    WebElement msOfficeSoftware;

    @CacheLookup
    @FindBy(xpath ="//input[@id='product_attribute_5_12']")
    WebElement totalCommander;

    @CacheLookup
    @FindBy(xpath ="//span[@class='price-value-1']")
    WebElement priceText;

    @CacheLookup
    @FindBy(xpath ="//button[@id='add-to-cart-button-1']")
    WebElement addToCartButton;

    @CacheLookup
    @FindBy(xpath ="//*[@id='bar-notification']/div/p")
    WebElement verifyProductAddedToCart;

    @CacheLookup
    @FindBy(xpath ="//span[@class='close']")
    WebElement closeTheBarMsg;

    @CacheLookup
    @FindBy(xpath ="//span[contains(text(),'Shopping cart')]")
    WebElement mouseHoverOnShoppingCart1;

    @CacheLookup
    @FindBy(xpath ="//button[contains(text(),'Go to cart')]")
    WebElement clickOnGoToCartButton1;

    public void verifyTextFromBuildownComputer(){

        assertVerifyText(buildYourComputerText,"Build your own computer");
    }
    public void selectProcessor(String text){

        selectByVisibleTextFromDropDown(processor,text);
    }
    public void selectRAM(String text){

        selectByVisibleTextFromDropDown(ram,text);
    }
    public void selectHDDRadio(){
        clickOnElement(hddRadio);
    }
    public void selectOSRadio(){
        clickOnElement(osRadio);
    }
    public void selectSoftwareMS(){
        clickOnElement(msOfficeSoftware);
    }
    public void selectTotalCommander(){
        clickOnElement(totalCommander);
    }
    public void verifyTextFromPrice(){

        assertVerifyText(priceText,"$1,475.00");
    }

    public void clickOnAddToCartButton() {
        clickOnElement(addToCartButton);
    }

    public void verifyTheProductHasBeenAddedToYourShoppingCart(){
        assertVerifyText(verifyProductAddedToCart,"The product has been added to your shopping cart");

    }

    public void closeTheBarByClickingOnTheCrossButton(){
        clickOnElement(closeTheBarMsg);
    }

    public void mouseHoverOnShoppingCartButton(){

        mouseHoverToElement(mouseHoverOnShoppingCart1);
    }
    public void clickOnGoToCartButton(){
        clickOnElement(clickOnGoToCartButton1);
    }
}
