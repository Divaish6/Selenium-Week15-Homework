package com.softwaretestingboard.magento.testsuite;

import com.softwaretestingboard.magento.customlisteners.CustomListeners;
import com.softwaretestingboard.magento.pages.GearPage;
import com.softwaretestingboard.magento.pages.HomePage;
import com.softwaretestingboard.magento.pages.OverNightDufflePage;
import com.softwaretestingboard.magento.pages.ShoppingCartPage;
import com.softwaretestingboard.magento.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(CustomListeners.class)
public class GearTest extends BaseTest {
    HomePage homePage;
    GearPage gearPage;
    OverNightDufflePage overNightDuffle;
    ShoppingCartPage shoppingCartPage;

    @BeforeMethod(alwaysRun = true)
    public void inIt() {
        homePage = new HomePage();
        gearPage = new GearPage();
        overNightDuffle = new OverNightDufflePage();
        shoppingCartPage = new ShoppingCartPage();
    }



    @Test(groups = {"sanity","regression"})
    public void userShouldAddProductSuccessFullyToShoppingCart() throws InterruptedException {
        //Mouse Hover on Gear Menu
        homePage.mouseHoverOnGearMenu();
        Thread.sleep(3000);
        //Click on Bags
        homePage.clickOnBags();
        Thread.sleep(3000);
        //Click on Product Name ‘Overnight Duffle’
        gearPage.clickOnOvernightDuffle();
        Thread.sleep(3000);
        //Verify the text ‘Overnight Duffle’
        Assert.assertEquals(overNightDuffle.getOverNightDuffelText(), "Overnight Duffle");
        Thread.sleep(3000);
        //Change Qty 3
        overNightDuffle.changeQuantityTo3("3");
        Thread.sleep(3000);
        //Click on ‘Add to Cart’ Button.
        overNightDuffle.clickOnAddToCart();
        Thread.sleep(3000);
        //Verify the text‘You added Overnight Duffle to your shopping cart.’
        Assert.assertEquals(overNightDuffle.getAddToCartText(), "You added Overnight Duffle to your shopping cart.");
        Thread.sleep(3000);
        //Click on ‘shopping cart’ Link into message
        overNightDuffle.clickOnShoppingCart();
        Thread.sleep(3000);
        //Verify the text ‘Overnight Duffle’
        Assert.assertEquals(shoppingCartPage.getOverNightDuffleText(), "Overnight Duffle");
        Thread.sleep(3000);
        //Verify the Qty is ‘3’
        Assert.assertEquals(shoppingCartPage.getQty(), "3");
        Thread.sleep(3000);
        //Verify the product price ‘$135.00’
        Assert.assertEquals(shoppingCartPage.getProductPrice(), "$135.00");
        Thread.sleep(3000);
        //Change Qty to ‘5’
        shoppingCartPage.changeQtyOfOverNightDuffle("5");
        Thread.sleep(3000);
        //Click on ‘Update Shopping Cart’ button
        shoppingCartPage.clickOnUpdateShoppingCart();
        Thread.sleep(3000);
        //Verify the product price ‘$225.00’
        Assert.assertEquals(shoppingCartPage.getUpdatedProductPrice(), "$225.0");
        Thread.sleep(3000);
    }
}
