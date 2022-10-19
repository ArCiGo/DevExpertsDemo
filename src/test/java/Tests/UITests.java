package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import java.lang.reflect.Method;

import static Utilities.ExtentReports.ExtentTestManager.startTest;

public class UITests extends BaseTest {

    // Properties
    private String product = "s6";

    @Test(description = "It adds a product to the shopping cart.",
        priority = 1, groups = { "UI" })
    public void AddProductToShoppingCart(Method method) {
        startTest(method.getName(), "It adds a product to the shopping cart.");

        performingShoppingCartTasks();
        Assert.assertTrue(demoBlazeCartPage.isOnShoppingCart(product));
    }

    @Test(description = "It removes a product in the shopping cart.",
            priority = 2, groups = { "UI" })
    public void RemoveProductInShoppingCart(Method method) throws InterruptedException {
        startTest(method.getName(), "It removes a product in the shopping cart.");

        performingShoppingCartTasks();
        demoBlazeCartPage.clickOnDeleteLinkButton();
        // checkTotal() just only validates if there is a text in the element
        Assert.assertTrue(demoBlazeCartPage.checkTotal());
    }

    /*
    Since these lines of code are used by both tests,
    I extracted them into a single method
     */
    public void performingShoppingCartTasks() {
        demoBlazeHomePage.clickOnProduct(product);
        demoBlazeProductPage.clickOnAddToCart();
        demoBlazeHomePage.clickOnMenuItem("Cart");
    }
}
