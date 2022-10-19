package PageObjectModel.Pages;

import PageObjectModel.Components.Home.HomeBodyComponent;
import PageObjectModel.Components.Home.HomeHeaderComponent;
import org.openqa.selenium.WebDriver;

public class DemoBlazeHomePage extends BasePage {

    // Attributes
    private HomeBodyComponent homeBodyComponent;
    private HomeHeaderComponent homeHeaderComponent;

    // Constructor
    public DemoBlazeHomePage(WebDriver driver) {
        super(driver);
        this.homeBodyComponent = new HomeBodyComponent(driver);
        this.homeHeaderComponent = new HomeHeaderComponent(driver);
    }

    // Actions
    public void goTo(String url) {
        driver.navigate().to(url);
    }

    public DemoBlazeProductPage clickOnProduct(String product) {
        return this.homeBodyComponent.clickOnProduct(product);
    }

    public void clickOnMenuItem(String item) {
        this.homeHeaderComponent.clickOnMenuItem(item);
    }
}
