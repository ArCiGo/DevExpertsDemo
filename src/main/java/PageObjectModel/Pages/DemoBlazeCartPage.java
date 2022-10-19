package PageObjectModel.Pages;

import PageObjectModel.Components.Cart.CartBodyComponent;
import org.openqa.selenium.WebDriver;

public class DemoBlazeCartPage extends BasePage{

    // Attributes
    private CartBodyComponent cartBodyComponent;

    // Constructor
    public DemoBlazeCartPage(WebDriver driver) {
        super(driver);
        this.cartBodyComponent = new CartBodyComponent(driver);
    }

    // Actions
    public boolean isOnShoppingCart(String product) {
        return this.cartBodyComponent.isOnShoppingCart(product);
    }

    public void clickOnDeleteLinkButton() throws InterruptedException {
        this.cartBodyComponent.clickOnDeleteLinkButton();
    }

    public boolean checkTotal() {
        return this.cartBodyComponent.checkTotal();
    }
}
