package pages;

import org.openqa.selenium.WebDriver;
import static org.testng.Assert.assertTrue;
/**
 * Google page with all written methods
 * @author gkalian
 * @version 1.0
 */
public class GooglePage extends AbstractPage{

    public GooglePage(WebDriver driver) {
        super(driver);
    }

    public void openURL(String url) {
        driver.get(url);
    }

    public void titleAssert (String title) {
        assertTrue(driver.getTitle().contains(title));
    }


}