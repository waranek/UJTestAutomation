package selenium.uj.project.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import selenium.uj.project.pages.BasePage;
import selenium.uj.project.pages.SignInPage;
import selenium.uj.project.utils.BaseProperties;

public class LoginTest extends DefaultTest {

    @Test
    public void successLoginTest() {
        BasePage basePage = new BasePage(driver, logger);
        SignInPage signInPage = basePage.openSignInPage();
        signInPage.fillLoginForm(
                        BaseProperties.BASE_ADMIN_EMAIL,
                        BaseProperties.BASE_ADMIN_PASSWORD);
/*

        // Przykładowe wykonanie screenshota w teście, nazwa dowolnie modyfikowalna wg potrzeb
        customScreenshot.makeScreenshot(driver,
                new Date().getTime() + "_" +
                        new LoginTest(){}.getClass().getEnclosingMethod().getName()
                        + "_" + "STEP 1 - FILL_LOGIN_FORM");


 */

        Assert.assertTrue(
                signInPage
                        .submitLoginForm()
                        .isMyAccountPageDisplayed());
    }
}