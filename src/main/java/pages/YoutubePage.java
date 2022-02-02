package pages;

import org.openqa.selenium.WebDriver;

import static org.testng.Assert.assertTrue;
/**
 * Google page with all written methods
 * @author gkalian
 * @version 1.0
 */
public class YoutubePage extends AbstractPage{

    public YoutubePage(WebDriver driver) {
        super(driver);
    }

    public void openURL(String url) {
        driver.get(url);
    }

    public void titleAssert (String title) {
        assertTrue(driver.getTitle().contains(title));
    }


}