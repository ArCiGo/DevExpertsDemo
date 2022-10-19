package PageObjectModel.Pages;

import PageObjectModel.Components.Home.HomeBodyComponent;
import PageObjectModel.Components.Product.ProductBodyComponent;
import org.openqa.selenium.WebDriver;

public class DemoBlazeProductPage extends BasePage {

    // Attributes
    private ProductBodyComponent productBodyComponent;

    // Constructor
    public DemoBlazeProductPage(WebDriver driver) {
        super(driver);
        this.productBodyComponent = new ProductBodyComponent(driver);
    }

    // Actions
    public void clickOnAddToCart() {
        this.productBodyComponent.clickOnAddToCart();
    }
}
