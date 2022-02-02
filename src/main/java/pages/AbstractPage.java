package pages;

import org.openqa.selenium.WebDriver;
/**
 * Abstract page with driver inizialozator
 * @author gkalian
 * @version 1.0
 */
public abstract class AbstractPage {
    protected WebDriver driver;

    public AbstractPage(WebDriver driver) {
        this.driver = driver;
    }

}
