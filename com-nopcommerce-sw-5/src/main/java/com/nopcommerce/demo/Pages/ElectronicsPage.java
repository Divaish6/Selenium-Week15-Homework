package com.nopcommerce.demo.Pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class ElectronicsPage extends Utility {

    @CacheLookup
    @FindBy(xpath ="//a[text()='Electronics ']")
    WebElement electronicsCategory;

    @CacheLookup
    @FindBy(xpath ="//ul[@class='top-menu notmobile']//a[normalize-space()='Cell phones']")
    WebElement cellPhone;

    public void hoverOnElectronics() {
        mouseHoverToElement(electronicsCategory);
    }

    public void hoverOnCellPhoneAndClick() {
        mouseHoverToElementAndClick(cellPhone);
    }
}
