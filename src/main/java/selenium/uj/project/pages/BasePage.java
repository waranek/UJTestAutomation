package selenium.uj.project.pages;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BasePage extends DefaultPage {

    @FindBy(className = "login")
    private WebElement signInLink;

    @FindBy(xpath = "//html/body/div/div[1]/header/div[2]/div/div/nav/div[2]/a")
    private WebElement signOutLink;

    @FindBy(xpath = "//html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[1]/a")
    private WebElement womenProductsLink;

    @FindBy(xpath = "//html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[2]/a")
    private WebElement dressesProductsLink;

    @FindBy(xpath = "//html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[3]/a")
    private WebElement tshirtsProductsLink;

    @FindBy(id = "search_query_top")
    private WebElement searchInput;


    public BasePage(WebDriver driver, Logger logger) {
        super(driver, logger);
    }

    public SignInPage openSignInPage() {
        clickElement(signInLink);
        return new SignInPage(driver, logger);
    }

    public WomenProductsPage openWomenProducts() {
        clickElement(womenProductsLink);
        return new WomenProductsPage(driver, logger);
    }

    public WomenProductsPage openDressesProducts() {
        clickElement(dressesProductsLink);
        return new WomenProductsPage(driver, logger);
    }

    public WomenProductsPage openTshirtsProducts() {
        clickElement(tshirtsProductsLink);
        return new WomenProductsPage(driver, logger);
    }

    public SearchResultPage submitSearch(String searchText) {
        fillElement(searchInput, searchText);
        searchInput.submit();
        return new SearchResultPage(driver, logger);
    }

    public boolean isUserLogged() {
        return isElementDisplayed(signOutLink);
    }

}
