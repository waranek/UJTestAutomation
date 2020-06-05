package selenium.uj.project.pages;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchResultPage extends BasePage {

    @FindBy(className = "product-count")
    private WebElement productCountDiv;
    
    public SearchResultPage(WebDriver driver, Logger logger) {
        super(driver, logger);
    }

    public String getProductCountText() {
        return productCountDiv.getText().trim();
    }

}
