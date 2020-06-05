package selenium.uj.project.pages;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductPage extends BasePage {

    @FindBy(id = "wishlist_button")
    private WebElement wishButton;

    @FindBy(className = "fancybox-error")
    private WebElement popupParagraph;


    public ProductPage(WebDriver driver, Logger logger) {
        super(driver, logger);
    }

    public ProductPage clickAddToWishlist() {
        clickElement(wishButton);
        return this;
    }

    public String getPopupText() {
        return popupParagraph.getText();
    }

    public boolean isAddToWishlistPopUpVisible() {
        WebDriverWait block = new WebDriverWait(driver, 10);
        WebElement popup = block.until(ExpectedConditions.visibilityOfElementLocated(By.className("fancybox-overlay")));
        return isElementDisplayed(popup);
    }

    public void closePopup() {
        WebElement closePopupButton = By.className("fancybox-close").findElement(driver);
        clickElement(closePopupButton);
    }
}
