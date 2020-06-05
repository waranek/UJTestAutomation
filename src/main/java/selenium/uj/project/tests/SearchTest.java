package selenium.uj.project.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import selenium.uj.project.pages.*;

public class SearchTest  extends DefaultTest {

    @Test
    public void searchTest() {
        BasePage basePage = new BasePage(driver, logger);
        SearchResultPage searchResultPage = basePage.submitSearch("dress");
        Assert.assertEquals(searchResultPage.getProductCountText(), "Showing 1 - 7 of 7 items");
    }
}
