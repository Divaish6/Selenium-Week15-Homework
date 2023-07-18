package Com.tutorialsninja.testsuite;

import Com.tutorialsninja.customlisteners.CustomListeners;
import Com.tutorialsninja.pages.HomePage;
import Com.tutorialsninja.pages.LogInPage;
import Com.tutorialsninja.pages.RegisterPage;
import Com.tutorialsninja.testbase.BaseTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(CustomListeners.class)
public class MyAccountTest extends BaseTest {

    HomePage homePage ;
    RegisterPage registerPage;
    LogInPage logInPage;

    @BeforeMethod(alwaysRun = true)
    public void inIt() {
        homePage = new HomePage();
        registerPage = new RegisterPage();
        logInPage = new LogInPage();

    }

    @Test(groups = {"sanity","regression"})
    public void verifyUserShouldNavigateToRegisterPageSuccessfully(){
        //1.1 Click on My Account Link.
        homePage.clickOnMyAccountLink();
        //1.2 Select “Register”
        homePage.selectRegister();
        //1.3 Verify the text “Register Account”.
        registerPage.verifyRegisterText("Register Account","Register Account text is found");
    }
    @Test(groups = {"sanity","smoke","regression"})
    public void verifyUserShouldNavigateToLoginPageSuccessfully(){
        //2.1 Click on My Account Link.
        homePage.clickOnMyAccountLink();
        //2.2 Select “Login”
        homePage.selectLogin();
        //2.3 Verify the text “Returning Customer”.
        logInPage.verifyReturningCustomerText("Returning Customer","text not match");
    }
    @Test(groups = {"smoke","regression"})
    public void verifyThatUserRegisterAccountSuccessfully(){
        //3.1 Click on My Account Link.
        homePage.clickOnMyAccountLink();
        //3.2 Select “Register”
        homePage.selectRegister();
        //3.3 Enter First Name
        registerPage.EnterFirstname("roman");
        //3.4 Enter Last Name
        registerPage.EnterLastname("Monam");
        //3.5 Enter Email
        registerPage.EnterEmail("Diueshk@gmail.com");
        //3.6 Enter Telephone
        registerPage.EnterTelephoneNo("0987654324");
        //3.7 Enter Password
        registerPage.EnterPassword("123Diuesh");
        //3.8 Enter Password Confirm
        registerPage.EnterPasswordConfirm("123Diuesh");
        //3.9 Select Subscribe Yes radio button
        registerPage.ClickOnYesRadioButton();
        //3.10 Click on Privacy Policy check box
        registerPage.ClickOnPolicyCheckBox();
        //3.11 Click on Continue button
        registerPage.ClickOnContinueButton();
        //3.12 Verify the message “Your Account Has Been Created!”
        registerPage.verifySuccessMessage("Your Account Has Been Created!","text not match");
        //3.13 Click on Continue button
        registerPage.ClickOnContinueButton1();
        //3.14 Click on My Account Link.
        logInPage.clickOnMyAccountLink();
        //3.15 Select “Logout”
        logInPage.selectLogout();
        //3.16 Verify the text “Account Logout”
        logInPage.verifyAccountLogoutText("Account Logout","text not metch");
        //3.17 Click on Continue button
        logInPage.ClickOnContinueButton();
    }
    @Test(groups = {"regression"})
    public void verifyThatUserShouldLoginAndLogoutSuccessfully(){
        //4.1 Click on My Account Link.
        homePage.clickOnMyAccountLink();
        //4.2 Select “Login”
        homePage.selectLogin();
        //4.3 Enter Email address
        logInPage.enterEmail("Diueshk@gmail.com");
        //4.4 Enter Password
        logInPage.enterPassword("123Diuesh");
        //4.6 Click on Login button
        logInPage.clickOnLoginButton();
        //4.7 Verify text “My Account”
        logInPage.verifyMyAccountText("My Account","text not match");
        //4.8 Click on My Account Link.
        logInPage.clickOnMyAccountLink();
        //4.9 Select “Logout”
        logInPage.selectLogout();
        //4.10 Verify the text “Account Logout”
        logInPage.verifyAccountLogoutText("Account Logout","text is not metch");
        //4.11 Click on Continue button
        logInPage.ClickOnContinueButton();
    }
}
