package pages;

import methods.Wait;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

/**
 * Abstract page with driver initialization
 * @author gkalian
 * @version 1.0
 */
public abstract class AbstractPage {
    public WebDriver driver;
    public Wait wait;

    /**Constructor*/
    public AbstractPage(WebDriver driver) {
        this.driver = driver;
    }

    /**Page methods*/
    public void openUrl(String url) {
        driver.get(url);
    }

    public void clickElementById(String id){
        driver.findElement(By.id(id)).click();
    }

    public void clickElementByClassName(String classname){
        driver.findElement(By.className(classname)).click();
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
