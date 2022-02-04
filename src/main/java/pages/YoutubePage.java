package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * Google page with all written methods
 * @author gkalian
 * @version 1.0
 */
public class YoutubePage extends AbstractPage{

    /**Constructor*/
    public YoutubePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements( driver, this);
    }

    public void openYT(String url) {
        openUrl(url);}

    public void titleYTAssert (String title) {
        titleAssert(title);
    }

}