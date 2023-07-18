package Com.tutorialsninja.pages;

import Com.tutorialsninja.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class LogInPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//a[@title='My Account']")
    WebElement MyAccountLink;

    @CacheLookup
    @FindBy(xpath = "//ul[@class='dropdown-menu dropdown-menu-right']//a[normalize-space()='Logout']")
    WebElement selectLogOut;

    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Account Logout']")
    WebElement AccountLogoutText;

    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'Returning Customer')]")
    WebElement ReturningCustomerText;

    @CacheLookup
    @FindBy(xpath = "//input[@id='input-email']")
    WebElement EmailField;

    @CacheLookup
    @FindBy(xpath = "//input[@id='input-password']")
    WebElement PasswordField;

    @CacheLookup
    @FindBy(xpath = "//input[@value='Login']")
    WebElement LoginButton;

    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'My Account')]")
    WebElement MyAccountText;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Continue')]")
    WebElement ContinueButton;

    public void clickOnMyAccountLink(){
        clickOnElement(MyAccountLink);
    }
    public void selectLogout(){
        mouseHoverToElementAndClick(selectLogOut);
    }
    public void verifyAccountLogoutText(String expected,String text){
        assertVerifyText(AccountLogoutText,expected,text);
    }
    public void verifyReturningCustomerText(String expected,String text){
        assertVerifyText(ReturningCustomerText,expected,text);
    }
    public void enterEmail(String text){
        sendTextToElement( EmailField,text);
    }
    public void enterPassword(String text){
        sendTextToElement(PasswordField,text);
    }
    public void clickOnLoginButton(){
        clickOnElement(LoginButton);
    }
    public void verifyMyAccountText(String expected,String text){
        assertVerifyText(MyAccountText,expected,text);
    }
    public void ClickOnContinueButton(){
        clickOnElement(ContinueButton);
    }

}
