package Com.tutorialsninja.pages;

import Com.tutorialsninja.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class ShoppingCartPage extends Utility {

    /******************************DesktopsTest************************************/

    @CacheLookup
    @FindBy(css ="div[class='alert alert-success alert-dismissible'] a:nth-child(2)")
    WebElement shoppingCartLink;

    @CacheLookup
    @FindBy(xpath ="//h1[contains(text(),' (1.00kg)')]")
    WebElement ShoppingCartText;

    @CacheLookup
    @FindBy(css ="HP LP3065")
    WebElement getProductName;

    @CacheLookup
    @FindBy(xpath ="//small[contains(text(),'Delivery Date:2023-07-09')]")
    WebElement getDeliveryDateText;

    @CacheLookup
    @FindBy(xpath ="//td[contains(text(),'Product 21')]")
    WebElement getProduct21Text;

    @CacheLookup
    @FindBy(xpath ="//tbody/tr[1]/td[6]")
    WebElement get$122Text;

    public void clickOnShoppingCartLink(){
        clickOnElement(shoppingCartLink);
    }
    public String getShoppingcartText(){
        return getTextFromElement(ShoppingCartText);
    }
    public String getProductNameText(){
        return getTextFromElement(getProductName);
    }
    public String getDeliveryDateText(){
        return getTextFromElement(getDeliveryDateText);
    }
    public String getProduct21Text(){
        return getTextFromElement(getProduct21Text);
    }
    public String get$122Text(){
        return getTextFromElement(get$122Text);
    }

    /*****************************Laptoptest**************************************/


    @CacheLookup
    @FindBy(xpath ="//h1[contains(text(),' (0.00kg)')]")
    WebElement ShoppingCartText1;

    @CacheLookup
    @FindBy(xpath ="//form[@method='post']//a[text()='MacBook']")
    WebElement ProductnameMacBook;

    @CacheLookup
    @FindBy(xpath ="//tbody/tr[1]/td[4]/div[1]/input[1]")
    WebElement QuantityFieldclear;

    @CacheLookup
    @FindBy(xpath ="//tbody/tr[1]/td[4]/div[1]/input[1]")
    WebElement ChangeQyantity;

    @CacheLookup
    @FindBy(xpath ="//i[@class='fa fa-refresh']")
    WebElement UpdateTab;

    @CacheLookup
    @FindBy(xpath ="//body/div[@id='checkout-cart']/div[1]")
    WebElement SuccessMessage1;

    @CacheLookup
    @FindBy(xpath ="//tbody/tr[1]/td[6]")
    WebElement $1204Text;

    @CacheLookup
    @FindBy(xpath ="//a[contains(text(),'Checkout')]")
    WebElement CheckoutButton;




    public void verifyShoppingCartText1(){
        assertVerifyText(ShoppingCartText1,"Shopping Cart  (0.00kg)","Shopping Cart text is not found");
    }
    public void verifyProductNameMacBookText(){
        assertVerifyText(ProductnameMacBook,"MacBook","MacBook text is not found");
    }
    public void EnterQuantity2(String text){
        QuantityFieldclear.clear();
        sendTextToElement(ChangeQyantity,text);
    }
    public void clickOnUpdateTab(){
        clickOnElement(UpdateTab);
    }
    public void verifySuccessMessage1(){
        assertVerifyText(SuccessMessage1,"Success: You have modified your shopping " +
                "cart!\n×","Success message is not found");
    }
    public void verify$1204Text(){
        assertVerifyText($1204Text,"$1,204.00","Total $1,204.00 is not found");
    }
    public void clickOnCheckoutButton(){
        clickOnElement(CheckoutButton);
    }


}
