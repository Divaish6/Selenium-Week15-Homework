package Com.tutorialsninja.pages;

import Com.tutorialsninja.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class CheckoutPage extends Utility {

    @CacheLookup
    @FindBy(xpath ="//h1[contains(text(),'Checkout')]")
    WebElement CheckoutText;

    @CacheLookup
    @FindBy(linkText ="New Customer")
    WebElement NewCustomerText;

    @CacheLookup
    @FindBy(xpath ="//input[@value='guest']")
    WebElement GuestRadioButton ;

    @CacheLookup
    @FindBy(css ="#button-account")
    WebElement ContinueButton;
    @CacheLookup
    @FindBy(xpath ="//input[@id='input-payment-firstname']")
    WebElement Firstnamefield ;

    @CacheLookup
    @FindBy(xpath ="//input[@id='input-payment-lastname']")
    WebElement Lastnamefield ;

    @CacheLookup
    @FindBy(xpath ="//input[@id='input-payment-email']")
    WebElement  EmailField;

    @CacheLookup
    @FindBy(xpath ="//input[@id='input-payment-telephone']")
    WebElement  TelephoneField;

    @CacheLookup
    @FindBy(xpath ="//input[@id='input-payment-address-1']")
    WebElement  Address1Field;

    @CacheLookup
    @FindBy(xpath ="//input[@id='input-payment-city']")
    WebElement  CityField;

    @CacheLookup
    @FindBy(xpath ="//input[@id='input-payment-postcode']")
    WebElement PostcodeField;

    @CacheLookup
    @FindBy(xpath ="//select[@id='input-payment-country']")
    WebElement CountrySelect;

    @CacheLookup
    @FindBy(xpath ="//select[@id='input-payment-zone']")
    WebElement StateSelect;

    @CacheLookup
    @FindBy(css ="#button-guest")
    WebElement ContinueButton1;

    @CacheLookup
    @FindBy(xpath ="//textarea[@name='comment']")
    WebElement AddCommentBox;

    @CacheLookup
    @FindBy(xpath ="//input[@name='agree']")
    WebElement  ConditionsCheckbox;

    @CacheLookup
    @FindBy(xpath ="//input[@id='button-payment-method']")
    WebElement  ContinueButton2;



    public void verifyCheckoutText(){
        assertVerifyText(CheckoutText,"Checkout","Checkout text is not found");
    }
    public void verifyNewCustomerText(){
        assertVerifyText(NewCustomerText,"New Customer","New Customer text is not found");
    }
    public void clickOnGuestradioButton(){
        clickOnElement(GuestRadioButton);
    }
    public void clickOnContinueButton(){
        clickOnElement(ContinueButton);
    }
    public void EnterFirstName(String Firstname){
        sendTextToElement(Firstnamefield,Firstname);
    }
    public void EnterLastName(String Lastname){
           sendTextToElement(Lastnamefield,Lastname);
    }
    public void EnterEmail(String Email){
           sendTextToElement(EmailField,Email);
    }
    public void EnterTelephone(String Tel){
           sendTextToElement(TelephoneField,Tel);
    }
    public void EnterAddress(String Address){
       sendTextToElement(Address1Field,Address);
    }
    public void EnterCity(String City){
       sendTextToElement(CityField,City);
    }
    public void EnterPostcode(String Postcode){
      sendTextToElement( PostcodeField,Postcode);
    }
    public void selectCountry(String Country){
        selectByVisibleTextFromDropDown(CountrySelect,Country);
    }
    public void selectState(String State){
         selectByVisibleTextFromDropDown(StateSelect,State);
    }
    public void clickOnContinueButton1(){
        clickOnElement(ContinueButton1);
    }
    public void AddcommentboxField(String text){
        sendTextToElement(AddCommentBox,text);
    }
    public void ClickOnconditionCheckBox(){
        clickOnElement(ConditionsCheckbox);
    }
    public void ClickOnContinueButton2(){
        clickOnElement(ContinueButton2);
    }
}
