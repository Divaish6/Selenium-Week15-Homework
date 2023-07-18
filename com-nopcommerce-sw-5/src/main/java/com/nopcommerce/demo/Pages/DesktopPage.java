package com.nopcommerce.demo.Pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DesktopPage extends Utility {

    @CacheLookup
    @FindBy(xpath ="//img[@alt='Picture for category Desktops']")
    WebElement desktopLink;

    @CacheLookup
    @FindBy(xpath ="//select[@id='products-orderby']")
    WebElement sortByFilter;

    @CacheLookup
    @FindBy(xpath ="//body/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/button[1]")
    WebElement addToCartButton;


    public void clickonDesktop(){
        clickOnElement(desktopLink);
    }
    public void clickOnSortByNameZToA(){

        selectByVisibleTextFromDropDown(sortByFilter,"Name: Z to A");
    }

    public void clickOnSortByNameAToZ(){

        selectByVisibleTextFromDropDown(sortByFilter,"Name: A to Z");
    }

    public void clickOnAddToCartButton(){

        clickOnElement(addToCartButton);
    }
    public void verifyProductsArrangedInAlphabeticallyDescendingOrder() throws InterruptedException {
        List<WebElement> elementList = findElementsFromWebPage(By.xpath("//h2[@class='product-title']"));
        System.out.println("Total elements are : " + elementList.size());
        List<String> originalProductNameList = new ArrayList<>();
        for (WebElement product : elementList) {
            originalProductNameList.add(product.getText());
        }
        Collections.sort(originalProductNameList, Collections.reverseOrder());
        Thread.sleep(3000);
        System.out.println(originalProductNameList);

        List<WebElement> afterSortingElementList=findElementsFromWebPage(By.xpath("//h2[@class='product-title']"));
        List<String> afterSortingProductName=new ArrayList<>();
        for(WebElement product1:afterSortingElementList){
            afterSortingProductName.add(product1.getText());
        }
        System.out.println(afterSortingProductName);
        Assert.assertEquals(originalProductNameList,afterSortingProductName);
    }
}


