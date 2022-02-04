package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.testng.Assert.assertTrue;

/**
 * Abstract page with driver inizialozator
 * @author gkalian
 * @version 1.0
 */
public abstract class AbstractPage {
    public static WebDriver driver;

    /**Constructor*/
    protected AbstractPage(WebDriver driver) {
        AbstractPage.driver = driver;
    }

    /**Page methods*/
    protected static void openUrl(String url) {
        driver.get(url);
    }

    /**Assertions*/
    protected static void titleAssert(String title) {
        assertTrue(driver.getTitle().contains(title));
    }
}
