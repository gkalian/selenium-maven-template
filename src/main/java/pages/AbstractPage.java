package pages;

import helper.Element;
import helper.Wait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

/**
 * Abstract page with driver initialization
 * @author gkalian
 * @version 1.0
 */
public abstract class AbstractPage<T> {
    public WebDriver driver;
    public Wait wait = new Wait();
    public Element element = new Element();

    /**Constructor*/
    public AbstractPage(WebDriver driver) {
        this.driver = driver;
    }

    /**Page methods*/
    public void openUrl(String url) {
        driver.get(url);
    }

    public void clickElement(WebElement id){
        element.clickElement(id);
    }

    /**Assertions*/
    public void titleAssert(String title) {
        assertTrue(driver.getTitle().contains(title));
    }

    public void urlAssert(String url) {
        assertEquals(url, driver.getCurrentUrl());
    }

    /**Waits*/
    public void waitUntilPageIsLoaded() {
        wait.waitUntilPageIsLoaded(driver);
    }
}
