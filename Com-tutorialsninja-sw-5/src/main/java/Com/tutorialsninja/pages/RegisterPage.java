package Com.tutorialsninja.pages;

import Com.tutorialsninja.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends Utility {

    @CacheLookup
    @FindBy(xpath ="//h1[contains(text(),'Register Account')]")
    WebElement RegisterText;

    @CacheLookup
    @FindBy(xpath ="//input[@id='input-firstname']")
    WebElement FirstnameField;

    @CacheLookup
    @FindBy(xpath ="//input[@id='input-lastname']")
    WebElement LastnameField;

    @CacheLookup
    @FindBy(xpath ="//input[@id='input-email']")
    WebElement EmailField;

    @CacheLookup
    @FindBy(xpath ="//input[@id='input-telephone']")
    WebElement TelephoneField;

    @CacheLookup
    @FindBy(xpath ="//input[@id='input-password']")
    WebElement PasswordField;

    @CacheLookup
    @FindBy(xpath ="//input[@id='input-confirm']")
    WebElement PasswordConfirmField;

    @CacheLookup
    @FindBy(xpath ="//label[normalize-space()='Yes']")
    WebElement YesradioButton;

    @CacheLookup
    @FindBy(xpath ="//input[@name='agree']")
    WebElement Policycheckbox;

    @CacheLookup
    @FindBy(xpath ="//input[@value ='Continue']")
    WebElement ContinueButton;

    @CacheLookup
    @FindBy(xpath ="//a[contains(text(),'Continue')]")
    WebElement ContinueButton1;

    @CacheLookup
    @FindBy(xpath ="//h1[contains(text(),'Your Account Has Been Created!')]")
    WebElement CreatedMessage;

    public void verifyRegisterText(String expectedText,String Text){
        assertVerifyText(RegisterText,expectedText,Text);
    }
    public void EnterFirstname(String text){
        sendTextToElement(FirstnameField,text);
    }
    public void EnterLastname(String text){
        sendTextToElement(LastnameField ,text);
    }
    public void EnterEmail(String text){
        sendTextToElement( EmailField,text);
    }
    public void EnterTelephoneNo(String text){
        sendTextToElement(TelephoneField,text);
    }
    public void EnterPassword(String text){
        sendTextToElement(PasswordField,text);
    }
    public void EnterPasswordConfirm(String text){
        sendTextToElement(PasswordConfirmField,text);
    }
    public void ClickOnYesRadioButton(){
        clickOnElement(YesradioButton);
    }
    public void ClickOnPolicyCheckBox(){
        clickOnElement(Policycheckbox);
    }
    public void ClickOnContinueButton(){
        clickOnElement(ContinueButton);
    }
    public void verifySuccessMessage(String expectedText,String Text){
        assertVerifyText(CreatedMessage,expectedText,Text);
    }
    public void ClickOnContinueButton1(){
        clickOnElement(ContinueButton1);
    }

}
