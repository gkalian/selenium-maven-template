package helper;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import utils.PropertyLoader;

import java.time.Duration;
import java.time.temporal.ChronoUnit;
/**
 * Class to store wait methods
 * @author gkalian
 * @version 1.0
 */
public class Wait {
    /**Initial method for webdriver fluent wait*/
    public static FluentWait<WebDriver> wait;

    public static FluentWait<WebDriver> fluentWait (WebDriver driver) {
        if (wait == null) {
            return new FluentWait<>(driver)
                    .withTimeout(Duration.ofSeconds(PropertyLoader.getExplicitWait()))
                    .pollingEvery(Duration.of(200, ChronoUnit.MILLIS))
                    .ignoring(NoSuchElementException.class);
        }
        return wait;
    }

    /**Wait until element become visible*/
    public WebElement waitForElementToBeVisible(WebDriver driver, WebElement element) {
        return fluentWait(driver).until(ExpectedConditions.visibilityOf(element));
    }

    /**Wait until element become clickable*/
    public WebElement waitForElementToBeClickable(WebDriver driver, WebElement element) {
        return fluentWait(driver).until(ExpectedConditions.elementToBeClickable(element));
    }

    /**Wait until page is fully loaded*/
    public void waitUntilPageIsLoaded(WebDriver driver){
        wait = fluentWait(driver);
        wait.until(WebDriver -> ((JavascriptExecutor) driver).executeScript("return document.readyState").equals("complete"));
    }
}
