package PageObjectModel.Components.Home;

import PageObjectModel.Components.DemoBlazeComponent;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class HomeHeaderComponent extends DemoBlazeComponent {

    // Attributes
    private final WebDriverWait wait;

    // Elements
    @FindBy(how = How.XPATH, using = "//div[@id = 'navbarExample']/ul/li/a")
    private List<WebElement> menuItemList;

    // Constructor
    public HomeHeaderComponent(WebDriver driver) {
        super(driver);
        this.driver = driver;

        wait = new WebDriverWait(driver, 5);
    }

    public void clickOnMenuItem(String item) {
        for (int i = 0; i < menuItemList.size(); i ++) {
            if (menuItemList.get(i).getText().contains(item)) {
                menuItemList.get(i).click();
                break;
            }
        }
    }
}
