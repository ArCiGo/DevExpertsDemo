package Tests;

import AutomationResources.BrowserType;
import AutomationResources.WebDriverFactory;
import PageObjectModel.Pages.DemoBlazeCartPage;
import PageObjectModel.Pages.DemoBlazeHomePage;
import PageObjectModel.Pages.DemoBlazeProductPage;
import Utilities.Log;
import Utilities.PropertyReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class BaseTest {

    protected String baseURL, itemToSearch;
    protected WebDriver driver;
    protected WebDriverWait wait;
    protected DemoBlazeHomePage demoBlazeHomePage;
    protected DemoBlazeProductPage demoBlazeProductPage;
    protected DemoBlazeCartPage demoBlazeCartPage;

    public WebDriver getDriver() {
        return driver;
    }

    @BeforeMethod(alwaysRun = true)
    public void setUp() {
        Log.info("I am in Before Method! Test is starting!");

        driver = WebDriverFactory.getDriver(BrowserType.Firefox);
        wait = new WebDriverWait(driver, 10);
        driver.manage().window().maximize();
        initSetup();
    }

    public void initSetup() {
        String propertiesFile = "data.properties";
        PropertyReader propertyReader = new PropertyReader();

        demoBlazeHomePage = new DemoBlazeHomePage(driver);
        demoBlazeProductPage = new DemoBlazeProductPage(driver);
        demoBlazeCartPage = new DemoBlazeCartPage(driver);

        demoBlazeHomePage.goTo(propertyReader.getProperty(propertiesFile, "DEMO_BLAZE_URL"));
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() {
        Log.info("I am in After Method! Test is ending!");

        driver.close();
        // driver.quit();
    }
}
