package driver;

import java.time.Duration;

import io.github.bonigarcia.wdm.WebDriverManager;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.WebDriver;
import utils.PropertyLoader;

/**
 * Driver factory to initialize web driver
 * @author gkalian
 * @version 1.1
 */
public class DriverFactory {
    /**Driver initialisation
     * Browser depends on value stored in property file*/
    public static WebDriver createInstance(String browser) {
        WebDriver driver = BrowserType.valueOf(browser.toUpperCase()).createDriver();;
        driverConfig(driver);
        return driver;
    }
    /**Common driver configuration*/
    public static void driverConfig(WebDriver driver) {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(PropertyLoader.getImplicitlyWait()));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(PropertyLoader.getPageLoadTimeout()));
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
    }

}
