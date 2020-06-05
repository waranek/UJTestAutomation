package selenium.uj.project.pages;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInPage extends BasePage {

    @FindBy(id = "email")
    private WebElement emailField;

    @FindBy(id = "passwd")
    private WebElement passwordField;

    @FindBy(id = "SubmitLogin")
    private WebElement submitButton;

    public SignInPage(WebDriver driver, Logger logger) {
        super(driver, logger);
    }

    public SignInPage fillLoginForm(String email, String pass) {
        fillElement(emailField, email);
        fillElement(passwordField, pass);
        return this;
    }

    public MyAccountPage submitLoginForm() {
        clickElement(submitButton);
        return new MyAccountPage(driver, logger);
    }
}