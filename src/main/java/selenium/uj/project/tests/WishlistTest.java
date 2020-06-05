package selenium.uj.project.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import selenium.uj.project.pages.*;

public class WishlistTest extends DefaultTest {

    @Test
    public void addItemToWishlistTest() {
        MyAccountPage myAccountPage = new MyAccountPage(driver, logger);
        WomenProductsPage womenProductsPage = myAccountPage.openWomenProducts();
        ProductPage productPage = womenProductsPage.openFirstItem();
        productPage.clickAddToWishlist();
        Assert.assertTrue(productPage.isAddToWishlistPopUpVisible());
        productPage.closePopup();
    }
}