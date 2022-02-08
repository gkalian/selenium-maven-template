package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Google page with all written methods
 * @author gkalian
 * @version 1.0
 */
public class GooglePage extends AbstractPage<GooglePage> {

    /**Constructor*/
    public GooglePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements( driver, this);
    }

    /**Web Elements*/
    @FindBy(name = "q")
    WebElement searchBox;

    @FindBy(className = "ULSxyf")
    WebElement videoBlock;

    /**Page Methods*/
    public GooglePage openGoogleURL(String url) {
        openUrl(url);
        waitUntilPageIsLoaded();
        return this;
    }

    public GooglePage searchFor(String value){
        searchBox.sendKeys(value + Keys.RETURN);
        waitUntilPageIsLoaded();
        return this;
    }

    public GooglePage checkGoogleTitleAssert (String title) {
        waitUntilPageIsLoaded();
        titleAssert(title);
        return this;
    }


}