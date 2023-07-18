package Com.tutorialsninja.testsuite;

import Com.tutorialsninja.customlisteners.CustomListeners;
import Com.tutorialsninja.pages.DesktopsPage;
import Com.tutorialsninja.pages.HomePage;
import Com.tutorialsninja.pages.LaptopsAndNoteBooksPage;
import Com.tutorialsninja.testbase.BaseTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(CustomListeners.class)
public class TopMenuTest extends BaseTest {

    HomePage homePage ;
    DesktopsPage desktopsPage ;
    LaptopsAndNoteBooksPage laptopsAndNoteBooksPage ;

    @BeforeMethod(alwaysRun = true)
    public void inIt() {
        homePage = new HomePage();
         desktopsPage = new DesktopsPage();
        laptopsAndNoteBooksPage = new LaptopsAndNoteBooksPage();
    }

    @Test(groups = {"sanity","regression"})
    public void verifyUserShouldNavigateToDesktopsPageSuccessfully(){
        //Mouse hover on “Desktops” Tab and click
        homePage.MouseHoverOnDesktopsTab();
        //call selectMenu method and pass the menu = “Show All Desktops”
        homePage.SelectShowAllDesktops();
        //Verify the text ‘Desktops’
       desktopsPage.verifyDesktopsText();
    }
    @Test(groups = {"sanity","smoke","regression"})
    public void verifyUserShouldNavigateToLaptopsAndNotebooksPageSuccessfully(){
        //2.1 Mouse hover on “Laptops & Notebooks” Tab and click
        homePage.MouseHoverOnLaptopNotebooksTab();
        //2.2 call selectMenu method and pass the menu = “Show All Laptops & Notebooks”
        homePage.SelectShowAllLaptopsNotebooks();
        //2.3 Verify the text ‘Laptops & Notebooks’
        laptopsAndNoteBooksPage.verifyLaptopandNoteBookText();
    }
    @Test(groups = {"smoke","regression"})
    public void verifyUserShouldNavigateToComponentsPageSuccessfully(){
        //3.1 Mouse hover on “Components” Tab and click
        homePage.MouseHoverOnComponentsTab();
        //3.2 call selectMenu method and pass the menu = “Show All Components”
        homePage.SelectShowAllComponents();
        //3.3 Verify the text ‘Components’
       homePage.verifyComponentsText();
    }
}
