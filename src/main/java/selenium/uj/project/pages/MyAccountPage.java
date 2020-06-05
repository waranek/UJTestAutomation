package selenium.uj.project.pages;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends BasePage {


    public MyAccountPage(WebDriver driver, Logger logger) {
        super(driver, logger);
    }

    public boolean isMyAccountPageDisplayed() {
        return isUserLogged();
    }

}
