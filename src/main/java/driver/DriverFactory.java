package driver;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import utils.PropertyLoader;

/**
 * Driver factory to initialize web driver
 * @author gkalian
 * @version 1.1
 */
public class DriverFactory {

    public static WebDriver createInstance(String browser) {
        WebDriver driver = BrowserType.valueOf(browser.toUpperCase()).createDriver();;
        driverConfig(driver);
        return driver;
    }

    private static void driverConfig(WebDriver driver) {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
        driver.manage().deleteAllCookies();
        //driver.manage().window().maximize();
    }

}
