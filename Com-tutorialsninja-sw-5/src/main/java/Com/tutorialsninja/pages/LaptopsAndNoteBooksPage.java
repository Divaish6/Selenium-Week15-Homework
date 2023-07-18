package Com.tutorialsninja.pages;

import Com.tutorialsninja.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class LaptopsAndNoteBooksPage extends Utility {

    @CacheLookup
    @FindBy(linkText = "Laptops & Notebooks")
    WebElement LaptopandNoteBookText;

    @CacheLookup
    @FindBy(xpath = "//select[@id='input-sort']")
    WebElement selectPriceHighLow;

    @CacheLookup
    @FindBy(xpath = "//p[@class= 'price']")
    List<WebElement> arrageHightoLowOrder;

    @CacheLookup
    @FindBy(linkText = "MacBook")
    WebElement ProductMacBook;

    @CacheLookup
    @FindBy(linkText = "MacBook")
    WebElement MacBookText;

    @CacheLookup
    @FindBy(xpath = "//button[@id='button-cart']")
    WebElement AddToCartButton;

    @CacheLookup
    @FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
    WebElement SuccessMessage;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'shopping cart')]")
    WebElement shoppingCartlink;

    public void verifyLaptopandNoteBookText(){
        assertVerifyText(LaptopandNoteBookText,"Laptops & Notebooks",
                "Laptops & Notebooks text is not found");
    }
    public void SelectPriceHighLow(String text){
        selectByVisibleTextFromDropDown(selectPriceHighLow,text);
    }
    public void verifyarrangeHightoLoworder(){
        verifyListProduct(arrageHightoLowOrder);
    }
    public void clickOnProductName(){
        clickOnElement(ProductMacBook);
    }
    public void verifyMacBookText(){
        assertVerifyText(MacBookText,"MacBook","MacBook text is not found");
    }
    public void clickOnAddToCartButton(){
        clickOnElement(AddToCartButton);
    }
    public void verifySuccessMessage(){
        assertVerifyText(SuccessMessage,"Success: You have added MacBook to your " +
                "shopping cart!\n×","Success message is not found ");
    }
    public void clickOnShoppingCart(){
        clickOnElement(shoppingCartlink);
    }
}
