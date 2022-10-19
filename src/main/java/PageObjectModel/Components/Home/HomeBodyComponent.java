package PageObjectModel.Components.Home;

import PageObjectModel.Components.DemoBlazeComponent;
import PageObjectModel.Pages.DemoBlazeProductPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomeBodyComponent extends DemoBlazeComponent {

    // Attributes
    private final WebDriverWait wait;

    // Elements
    @FindBy(how = How.XPATH, using = "//h4[@class = 'card-title']")
    private WebElement cardProduct;

    // Constructor
    public HomeBodyComponent(WebDriver driver) {
        super(driver);
        this.driver = driver;

        wait = new WebDriverWait(driver, 5);
    }

    // Actions
    public DemoBlazeProductPage clickOnProduct(String product) {
        wait.until(ExpectedConditions.visibilityOf(cardProduct));

        if(cardProduct.getText().contains(product)) {
            cardProduct.click();
        }

        return new DemoBlazeProductPage(driver);
    }
}
