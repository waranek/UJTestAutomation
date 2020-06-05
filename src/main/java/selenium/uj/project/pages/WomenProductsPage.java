package selenium.uj.project.pages;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;


public class WomenProductsPage extends BasePage {
    @FindBy(className = "product_img_link")
    private WebElement firstProductItem;

    public WomenProductsPage(WebDriver driver, Logger logger) {
        super(driver, logger);
    }

    public ProductPage openFirstItem() {
        Actions actions = new Actions(driver);
        actions.moveToElement(firstProductItem).perform();
        WebElement moreButton = By.className("lnk_view").findElement(driver);
        clickElement(moreButton);
        return new ProductPage(driver, logger);
    }
}
