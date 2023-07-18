package Com.tutorialsninja.pages;

import Com.tutorialsninja.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class HomePage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Currency')]")
    WebElement currency;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='£Pound Sterling']")
    WebElement currencyChange;

    @CacheLookup
    @FindBy(linkText= "Desktops")
    WebElement DesktopsTab;

    @CacheLookup
    @FindBy(linkText = "Show AllDesktops")
    WebElement SelectShowAllDesktops;

    @CacheLookup
    @FindBy(linkText = "Laptops & Notebooks")
    WebElement LaptopNotebooksTab;

    @CacheLookup
    @FindBy(linkText = "Show AllLaptops & Notebooks")
    WebElement selectShowAllLaptopsNotebooks;

    @CacheLookup
    @FindBy(linkText = "Components")
    WebElement ComponentsTab;

    @CacheLookup
    @FindBy(linkText = "Show AllComponents")
    WebElement SelectShowAllComponents;

    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'Components')]")
    WebElement ComponentsText;

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'My Account')]")
    WebElement MyAccountlink;

    @CacheLookup
    @FindBy(xpath = "//ul[@class='dropdown-menu dropdown-menu-right']//a[normalize-space()='Login']")
    WebElement selectLogin;

    @CacheLookup
    @FindBy(xpath = "//ul[@class='dropdown-menu dropdown-menu-right']//a[normalize-space()='Register']")
    WebElement selectRegister;

    public void clickOnCurrencyChange() {
        clickOnElement(currency);
    }

    public void selectCurrencyPound() {
        clickOnElement(currencyChange);
    }

    public void MouseHoverOnDesktopsTab() {
        mouseHoverToElement(DesktopsTab);
    }

    public void SelectShowAllDesktops() {
        mouseHoverToElementAndClick(SelectShowAllDesktops);
    }

    public void MouseHoverOnLaptopNotebooksTab() {
        mouseHoverToElement(LaptopNotebooksTab);
    }

    public void SelectShowAllLaptopsNotebooks() {
        mouseHoverToElementAndClick(selectShowAllLaptopsNotebooks);
    }

    public void MouseHoverOnComponentsTab() {
        mouseHoverToElement(ComponentsTab);
    }

    public void SelectShowAllComponents() {
        mouseHoverToElementAndClick(SelectShowAllComponents);
    }

    public void verifyComponentsText() {
        assertVerifyText(ComponentsText, "Components", "Components text is not found");
    }

    public void clickOnMyAccountLink() {
        clickOnElement(MyAccountlink);
    }

    public void selectLogin() {
        mouseHoverToElementAndClick(selectLogin);
    }

    public void selectRegister() {
        mouseHoverToElementAndClick(selectRegister);
    }
}
