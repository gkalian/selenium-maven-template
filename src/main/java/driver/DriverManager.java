package driver;

import org.openqa.selenium.WebDriver;

public class DriverManager {

    private DriverManager() {
    }

    private static ThreadLocal<WebDriver> webDriver = new ThreadLocal<WebDriver>();

    public static WebDriver getDriver() {
        return webDriver.get();
    }

    public static void setWebDriver(WebDriver driver) {
        webDriver.set(driver);
    }

    public static void quitDriver() {
        if (getDriver() != null) {
            getDriver().close();
            getDriver().quit();
            webDriver.remove();
        }
    }
}