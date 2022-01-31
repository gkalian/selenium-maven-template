package driver;

import java.time.Duration;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;

public class DriverFactory {

    public static WebDriver createInstance() {

        WebDriver driver = null;
        String browserName = System.getProperty("browser", Type.CHROME.toString()).toUpperCase();
        Type Type = DriverFactory.Type.valueOf(browserName);

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        options.addArguments("--lang=en");
        options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
        options.addArguments("--disable-gpu");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-extensions");
        options.addArguments("--start-maximized");

        switch (Type) {
            case FIREFOX:
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                break;
            case EDGE:
                WebDriverManager.edgedriver().setup();
                driver = new EdgeDriver();
                break;
            case IE:
                WebDriverManager.iedriver().setup();
                driver = new InternetExplorerDriver();
                break;
            case OPERA:
                WebDriverManager.operadriver().setup();
                driver = new OperaDriver();
                break;
            default:
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver(options);
                break;
        }

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();

        return driver;
    }

    private enum Type {
        CHROME,
        FIREFOX,
        OPERA,
        EDGE,
        IE
    }

}
