package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Abstract page with driver inizialozator
 * @author gkalian
 * @version 1.0
 */
public abstract class AbstractPage {
    public WebDriver driver;

    /**Constructor*/
    public AbstractPage(WebDriver driver) {
        this.driver = driver;
    }

}
