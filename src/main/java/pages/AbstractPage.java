package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

/**
 * Abstract page with driver inizialozator
 * @author gkalian
 * @version 1.0
 */
public abstract class AbstractPage {
    public WebDriver driver;

    /**Constructor*/
    protected AbstractPage(WebDriver driver) {
        this.driver = driver;
    }

    /**Page methods*/
    protected void openUrl(String url) {
        driver.get(url);
    }

    protected void clickElementById(String id){
        driver.findElement(By.id(id)).click();
    }

    protected void clickElementByClassName(String classname){
        driver.findElement(By.className(classname)).click();
    }

    /**Assertions*/
    protected void titleAssert(String title) {
        assertTrue(driver.getTitle().contains(title));
    }

    protected void urlAssert(String url) {
        assertEquals(url, driver.getCurrentUrl());
    }

}
