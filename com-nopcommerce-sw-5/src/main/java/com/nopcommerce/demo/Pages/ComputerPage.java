package com.nopcommerce.demo.Pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class ComputerPage extends Utility {

    @CacheLookup
    @FindBy(xpath ="//img[@alt='Picture for category Desktops']")
    WebElement desktopCategory;

    public void clickOnDesktopCategory(){
        clickOnElement(desktopCategory);
    }
}
