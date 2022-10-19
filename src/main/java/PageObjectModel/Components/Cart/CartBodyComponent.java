package PageObjectModel.Components.Cart;

import PageObjectModel.Components.DemoBlazeComponent;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CartBodyComponent extends DemoBlazeComponent {

    // Attributes
    private final WebDriverWait wait;

    // Elements
    @FindBy(how = How.XPATH, using = "//h3[@id = 'totalp']")
    private WebElement totalAmountH3;

    @FindBy(how = How.XPATH, using = "//tr/td[2]")
    private WebElement productName;

    @FindBy(how = How.XPATH, using = "//tr/td[4]/a")
    private WebElement deleteLinkButton;

    // Constructor
    public CartBodyComponent(WebDriver driver) {
        super(driver);
        this.driver = driver;

        wait = new WebDriverWait(driver, 5);
    }

    // Actions
    public boolean isOnShoppingCart(String product) {
        wait.until(ExpectedConditions.visibilityOf(productName));
        return productName.getText().contains(product);
    }

    public void clickOnDeleteLinkButton() throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOf(deleteLinkButton)).click();
        Thread.sleep(5000);
    }

    public boolean checkTotal() {
        return totalAmountH3.getText().isEmpty();
    }
}
