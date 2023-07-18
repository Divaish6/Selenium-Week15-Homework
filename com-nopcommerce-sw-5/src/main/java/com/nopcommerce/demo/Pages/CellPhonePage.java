package com.nopcommerce.demo.Pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class CellPhonePage extends Utility {

    @CacheLookup
    @FindBy(xpath ="//h1[normalize-space()='Cell phones']")
    WebElement cellPhoneText;

    @CacheLookup
    @FindBy(xpath ="//a[contains(text(),'List')]")
    WebElement listViewTab;

    @CacheLookup
    @FindBy(xpath ="//h2[@class='product-title']//a[contains(text(),'Nokia Lumia 1020')]")
    WebElement nokiaLumia1020;

    public void verifyCellPhoneText(){

        assertVerifyText(cellPhoneText,"Cell phones");
    }
    public void clickOnListViewTab(){
        clickOnElement(listViewTab);
    }
    public void clickOnNokiaLumia1020(){
        clickOnElement(nokiaLumia1020);
    }
}
