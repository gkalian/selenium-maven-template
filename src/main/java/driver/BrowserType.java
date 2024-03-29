package driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.config.DriverManagerType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.remote.AbstractDriverOptions;
/**
 * Different Browser settings
 * @author gkalian
 * @version 2.0
 */
public enum BrowserType {
    /**Browser settings and options*/
    CHROME {
        @Override
        public WebDriver createDriver() {
            WebDriverManager.getInstance(DriverManagerType.CHROME).setup();
            return new ChromeDriver(getOptions());
        }

        @Override
        public ChromeOptions getOptions() {
            ChromeOptions chromeOptions = new ChromeOptions();
            chromeOptions.addArguments("--start-maximized");
            chromeOptions.addArguments("--disable-infobars");
            chromeOptions.addArguments("--disable-notifications");
            chromeOptions.addArguments("--lang=en");
            chromeOptions.addArguments("--remote-allow-origins=*");
            return chromeOptions;
        }
    },

    FIREFOX{
        @Override
        public WebDriver createDriver() {
        WebDriverManager.getInstance(DriverManagerType.FIREFOX).setup();
        return new FirefoxDriver(getOptions());
    }

        @Override
        public FirefoxOptions getOptions() {
            FirefoxOptions firefoxOptions = new FirefoxOptions();
            firefoxOptions.addArguments("--start-maximized");
            return firefoxOptions;
        }
    },

    EDGE{
        @Override
        public WebDriver createDriver() {
            WebDriverManager.getInstance(DriverManagerType.EDGE).setup();
            return new EdgeDriver(getOptions());
        }

        @Override
        public EdgeOptions getOptions() {
            EdgeOptions edgeOptions = new EdgeOptions();
            edgeOptions.addArguments("--start-maximized");
            edgeOptions.addArguments("--disable-infobars");
            edgeOptions.addArguments("--disable-notifications");
            edgeOptions.addArguments("--remote-allow-origins=*");
            return edgeOptions;
        }
    },

    IE{
        @Override
        public WebDriver createDriver() {
            WebDriverManager.getInstance(DriverManagerType.IEXPLORER).setup();
            return new InternetExplorerDriver(getOptions());
        }

        @Override
        public InternetExplorerOptions getOptions() {
            InternetExplorerOptions internetExplorerOptions = new InternetExplorerOptions();
            internetExplorerOptions.ignoreZoomSettings();
            return internetExplorerOptions;
        }
    };

    public abstract WebDriver createDriver();

    public abstract AbstractDriverOptions<?> getOptions();
}
