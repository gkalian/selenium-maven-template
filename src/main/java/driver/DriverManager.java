package driver;

import org.openqa.selenium.WebDriver;
/**
 * Default getter-setter class for web driver
 * plus thread support
 * @author gkalian
 * @version 1.0
 */
public class DriverManager {
    /**Constructor*/
    private DriverManager() {
    }
    /**Need to threads*/
    private static ThreadLocal<WebDriver> driver = new ThreadLocal<WebDriver>();
    /**Getter*/
    public static WebDriver getDriver() {
        return driver.get();
    }
    /**Setter*/
    public static void setDriver(WebDriver driver) {
        DriverManager.driver.set(driver);
    }
    /**Driver closing*/
    public static void quitDriver() {
        if (getDriver() != null) {
            getDriver().close();
            getDriver().quit();
            driver.remove();
        }
    }
}