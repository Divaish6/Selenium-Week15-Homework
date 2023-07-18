package Com.tutorialsninja.pages;

import Com.tutorialsninja.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class DesktopsPage extends Utility {
    @CacheLookup
    @FindBy(xpath ="//h2[contains(text(),'Desktops')]")
    WebElement DesktopsText;

    @CacheLookup
    @FindBy(xpath ="//select[@id='input-sort']")
    WebElement selectNameZtoA;

    @CacheLookup
    @FindBy(xpath ="//div[@class='caption']")
    List<WebElement> ListDescendingOrder;

    @CacheLookup
    @FindBy(xpath ="//select[@id='input-sort']")
    WebElement selectNameAtoZ;

    @CacheLookup
    @FindBy(xpath ="//a[contains(text(),'HP LP3065')]")
    WebElement HPLP3065Link;

    @CacheLookup
    @FindBy(xpath ="//h1[contains(text(),'HP LP3065')]")
    WebElement HPLP3065Text;

    @CacheLookup
    @FindBy(xpath ="//input[@id='input-option225']")
    WebElement DeliveryDatefieldclear;

    @CacheLookup
    @FindBy(xpath ="//input[@id='input-option225']")
    WebElement EnterDeliveryDate;

    @CacheLookup
    @FindBy(xpath ="//input[@id='input-quantity']")
    WebElement quantityFieldClear;

    @CacheLookup
    @FindBy(xpath ="//input[@id='input-quantity']")
    WebElement quantityChange;

    @CacheLookup
    @FindBy(xpath ="//button[@id='button-cart']")
    WebElement AddToCartButton;

    @CacheLookup
    @FindBy(xpath ="//div[text() ='Success: You have added ']")
    WebElement getMessage;

    @CacheLookup
    @FindBy(css ="div[class='alert alert-success alert-dismissible'] a:nth-child(2)")
    WebElement shoppingCartLink;

    public void verifyDesktopsText(){
        assertVerifyText(DesktopsText,"Desktops","Desktops text is not found");
    }
    public void SelectNameZtoA(String text) {
        selectByVisibleTextFromDropDown(selectNameZtoA,text);
    }
    public void ListDescendingOrder() {
        List<WebElement> PRODUCTName = ListDescendingOrder;
        System.out.println(PRODUCTName.size());
        for (WebElement product : PRODUCTName) {
            System.out.println(product.getText());
            // return getTextFromElement(ListDescendingOrder);
        }
    }
    public void SelectNameAtoZ(String text1){
         selectByVisibleTextFromDropDown(selectNameAtoZ,text1);
    }
    public void clickOnHPLP3065Link(){
        clickOnElement(HPLP3065Link);
    }
    public String getHPLP3065text(){
        return getTextFromElement(HPLP3065Text);
    }
    public void selectDeliveryDate(String text){
          DeliveryDatefieldclear.clear();
          sendTextToElement(EnterDeliveryDate,text);
    }
    public void Quantitychange(String text){
        quantityFieldClear.clear();
        sendTextToElement(quantityChange,text);
    }
    public void clickOnAddCartButton(){
        clickOnElement(AddToCartButton);
    }
    public String getMessagedisplay(){
        return getTextFromElement(getMessage);
    }
    public void clickOnShoppingcart(){
        clickOnElement(shoppingCartLink);
    }


}
