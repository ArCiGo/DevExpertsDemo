package PageObjectModel.Components.Product;

import PageObjectModel.Components.DemoBlazeComponent;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductBodyComponent extends DemoBlazeComponent {

    // Attributes
    private final WebDriverWait wait;

    // Elements
    @FindBy(how = How.XPATH, using = "//a[contains(text(), 'Add')]")
    private WebElement addToCartButton;

    // Constructor
    public ProductBodyComponent(WebDriver driver) {
        super(driver);
        this.driver = driver;

        wait = new WebDriverWait(driver, 5);
    }

    // Actions
    public void clickOnAddToCart() {
        wait.until(ExpectedConditions.visibilityOf(addToCartButton));
        addToCartButton.click();

        wait.until(ExpectedConditions.alertIsPresent());

        Alert alert = driver.switchTo().alert();
        alert.accept();
    }
}
