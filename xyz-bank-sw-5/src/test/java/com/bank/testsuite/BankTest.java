package com.bank.testsuite;

import com.bank.pages.*;
import com.bank.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BankTest extends BaseTest {

    AccountPage accountPage;
    AddCustomerPage addCustomerPage;
    BankManagerLoginPage bankManagerLoginPage;
    CustomerLoginPage customerLoginPage;
    CustomersPage customersPage;
    HomePage homePage;
    OpenAccountPage openAccountPage;


    @BeforeMethod(alwaysRun = true)
    public void inIt() {
        accountPage = new AccountPage();
        addCustomerPage = new AddCustomerPage();
        bankManagerLoginPage = new BankManagerLoginPage();
        customerLoginPage = new CustomerLoginPage();
        customersPage = new CustomersPage();
        homePage = new HomePage();
        openAccountPage = new OpenAccountPage();
    }

    @Test(groups = {"sanity", "regression"})
    public void bankManagerShouldAddCustomerSuccessfully() {
        homePage.clickOnBankManagerLoginTab();
        bankManagerLoginPage.clickOnAddCustomerTab();
        addCustomerPage.enterFirstName("Diuesh");
        addCustomerPage.enterLastName("Roman");
        addCustomerPage.enterPostCode("Ha8 9uh");
        addCustomerPage.clickOnAddCustomerButton();
        Assert.assertEquals(addCustomerPage.verifyPopUpText(), "Customer added successfully with customer id :6", "Invalid data");
        addCustomerPage.acceptPopUpMessage();
    }

    @Test(groups = {"sanity","smoke", "regression"})
    public void bankManagerShouldOpenAccountSuccessfully() {
        homePage.clickOnBankManagerLoginTab();
        bankManagerLoginPage.clickOnAddCustomerTab();
        addCustomerPage.enterFirstName("Diuesh");
        addCustomerPage.enterLastName("Roman");
        addCustomerPage.enterPostCode("Ha8 9uh");
        addCustomerPage.clickOnAddCustomerButton();
        Assert.assertEquals(addCustomerPage.verifyPopUpText(), "Customer added successfully with customer id :6", "Invalid data");
        addCustomerPage.acceptPopUpMessage();
        bankManagerLoginPage.addOpenAccountTab();
        openAccountPage.selectCustomerNameFromDropDown("Divesh Roman");
        //openAccountPage.searchCustomer("1");
        openAccountPage.selectCurrencyFromDropDown("Pound");
        openAccountPage.clickOnProcessButton();
        //verify message "Account created successfully"
        Assert.assertEquals(openAccountPage.getTextFromAlert(), "Account created successfully with account Number :1016", "No Message Displayed");
        // click on "ok" button on popup.
        openAccountPage.acceptAlert();
    }

    @Test(groups = {"regression"})
    public void customerShouldLoginAndLogoutSuccessfully() throws InterruptedException{
        //click on "Customer Login" Tab
        customerLoginPage.clickOnLoginTab();
        //search customer that you created
        customerLoginPage.selectYourname("Diuesh Roman");
        //click on "Login" Button
        customerLoginPage.userClickOnLoginButton();
        Thread.sleep(2000);
        Assert.assertEquals(customerLoginPage.verifyLogoutMessage(), "Logout", "Logout text is not displayed");
        customerLoginPage.clickOnLogOutButton();
        Assert.assertEquals(customersPage.verifyNameText(), "Your Name :", "Text is not displayed");
    }

    @Test(groups = {"regression"})
    public void customerShouldDepositMoneySuccessfully() {
        //click on "Customer Login" Tab
        customerLoginPage.clickOnLoginTab();
        //search customer that you created
        customerLoginPage.selectYourname("Diuesh Roman");
        //click on "Login" Button
        customerLoginPage.userClickOnLoginButton();
        //click on "Deposit" Tab
        accountPage.clickOnDeposit();
        // Enter amount 100
        accountPage.enterAmount("150");
        //click on "Deposit" Button
        accountPage.clickOnDepositButton();
        //verify message "Deposit Successful"
        Assert.assertEquals(accountPage.verifyDepositSuccessFull(), "Deposit Successful", "No message displayed");
    }

    @Test(groups = {"regression"})
    public void customerShouldWithdrawMoneySuccessfully() {
        //click on "Customer Login" Tab
        accountPage.clickOnLoginTab();
        //search customer that you created
        customerLoginPage.selectYourname("Diuesh Roman");
        //click on "Login" Button
        accountPage.userClickOnLoginButton();
        //click on "Withdrawl" Tab
        accountPage.clickOnWithDrawl();
        //Enter amount 50
        accountPage.enterAmountToWithdraw("50");
        //click on "Withdraw" Button
        accountPage.clickOnWithdrawButton();
        //	verify message "Transaction Successful"
        Assert.assertEquals(accountPage.verifyTransactionMessage(), "Transaction Successful", "No message displayed");

    }
}
