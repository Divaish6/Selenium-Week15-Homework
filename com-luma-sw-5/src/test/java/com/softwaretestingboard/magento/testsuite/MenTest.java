package com.softwaretestingboard.magento.testsuite;

import com.softwaretestingboard.magento.customlisteners.CustomListeners;
import com.softwaretestingboard.magento.pages.HomePage;
import com.softwaretestingboard.magento.pages.MenPage;
import com.softwaretestingboard.magento.pages.ShoppingCartPage;
import com.softwaretestingboard.magento.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListeners.class)
public class MenTest extends BaseTest {
    HomePage homePage;
    MenPage menPage;
    ShoppingCartPage shoppingCart;

    @BeforeMethod(alwaysRun = true)
    public void inIt() {
        homePage = new HomePage();
        menPage = new MenPage();
        shoppingCart = new ShoppingCartPage();
    }

    @Test(groups = {"sanity","regression"})
    public void userShouldAddProductSuccessFullyToShoppingCart() throws InterruptedException {
        //Mouse Hover on Men Menu
        homePage.mouseHoverOnMenMenu();
        Thread.sleep(3000);
        //Mouse Hover on Bottoms
        homePage.mouseHoverOnBottom();
        Thread.sleep(3000);
        //Click on Pants
        homePage.clickOnPant();
        Thread.sleep(3000);
        //Mouse Hover on product name ‘Cronus Yoga Pant’ and click on size 32.
        menPage.mouseHoverOnCronusYogaPant();
        Thread.sleep(3000);
        menPage.clickOnSize();
        //Mouse Hover on product name‘Cronus Yoga Pant’ and click on colourBlack.
        menPage.clickOnColor();
        Thread.sleep(3000);
        //Mouse Hover on product name ‘Cronus Yoga Pant’ and click on ‘Add To Cart’ Button.
        menPage.clickOnAddToCart();
        Thread.sleep(3000);
        // Verify the text ‘You added Cronus Yoga Pant to your shopping cart.’
        Assert.assertEquals(menPage.getTextAfterAddToCart(), "You added Cronus Yoga Pant to your shopping cart.");
        Thread.sleep(3000);
        //Click on ‘shopping cart’ Link into message
        menPage.clickOnShoppingCart();
        Thread.sleep(3000);
        //Verify the text ‘Shopping Cart.’
        Assert.assertEquals(shoppingCart.getShoppingCart(), "Shopping Cart");
        Thread.sleep(3000);
        //Verify the product name ‘Cronus Yoga Pant’
        Assert.assertEquals(shoppingCart.getCronusYogaPantText(), "Cronus Yoga Pant");
        Thread.sleep(3000);
        //Verify the product size ‘32’
        Assert.assertEquals(shoppingCart.getSizeText(), "32");
        Thread.sleep(3000);
        //Verify the product colour ‘Black’
        Assert.assertEquals(shoppingCart.getColorText(), "Black");
        Thread.sleep(3000);
    }
}
