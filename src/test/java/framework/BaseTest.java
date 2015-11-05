package framework;
import org.openqa.selenium.WebDriver;

import static junit.framework.Assert.assertEquals;

/**
 * Created by payu on 7/15/2015.
 */
public class BaseTest {

    public static String login = "";
    public static String password = "";

    public void openBrowser() {
        String browserName = System.getProperty("browser");
        WebDriver driver = DriverFactory.createInstance(browserName);
        DriverManager.setWebDriver(driver);
    }

    public void closeBrowser() {
        WebDriver driver = DriverManager.getDriver();
        if (driver != null) {
            driver.quit();
        }
    }

    public static void openPage(String url) {
        DriverManager.getDriver().get(url);
    }

    public static void refreshPage() {
        DriverManager.getDriver().navigate().refresh();
    }

}
