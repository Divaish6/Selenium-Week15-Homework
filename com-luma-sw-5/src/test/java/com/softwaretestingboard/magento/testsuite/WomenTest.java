package com.softwaretestingboard.magento.testsuite;

import com.softwaretestingboard.magento.customlisteners.CustomListeners;
import com.softwaretestingboard.magento.pages.HomePage;
import com.softwaretestingboard.magento.pages.WomensJacketsPage;
import com.softwaretestingboard.magento.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListeners.class)
public class WomenTest extends BaseTest {
    HomePage homepage;
    WomensJacketsPage womenPage;

    @BeforeMethod(alwaysRun = true)
    public void inIt() {
        homepage = new HomePage();
        womenPage = new WomensJacketsPage();

    }


    @Test(groups = {"sanity","regression"})
    public void verifyTheSortByProductNameFilter() throws InterruptedException {
        //Mouse Hover on Women Menu
        homepage.mouseHoverOnWomenMenu();
        Thread.sleep(3000);
        //Mouse Hover on Tops
        homepage.mouseHoverOnTops();
        Thread.sleep(3000);
        //Click on Jackets
        homepage.clickOnJackets();
        Thread.sleep(3000);
        //Select Sort By filter “Product Name”
        womenPage.selectProductNameFilter("Product Name");
        Thread.sleep(3000);
        //Verify the products name display in alphabetical order
        Assert.assertEquals(womenPage.getProductList1(), womenPage.getProductList2());
        Thread.sleep(3000);
    }

    @Test(groups = {"sanity","smoke","regression"})
    public void verifyTheSortByPriceFilter() throws InterruptedException {
        //Mouse Hover on Women Menu
        homepage.mouseHoverOnWomenMenu();
        Thread.sleep(3000);
        //Mouse Hover on Tops
        homepage.mouseHoverOnTops();
        Thread.sleep(3000);
        //Click on Jackets
        homepage.clickOnJackets();
        Thread.sleep(3000);
        //Select Sort By filter “Price”
        womenPage.selectProductNameFilter("Price");
        Thread.sleep(3000);
        //Verify the products price display in Low to High
        Assert.assertEquals(womenPage.getPriceList1(), womenPage.getPriceList2());
        Thread.sleep(3000);
    }
}
