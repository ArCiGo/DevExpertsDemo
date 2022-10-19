package PageObjectModel.Components;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class DemoBlazeComponent {

    protected WebDriver driver;

    public DemoBlazeComponent(WebDriver driver) {
        this.driver = driver;

        PageFactory.initElements(driver, this);
    }
}
