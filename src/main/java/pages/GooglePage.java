package pages;

import org.openqa.selenium.WebDriver;
import static org.testng.Assert.assertTrue;

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