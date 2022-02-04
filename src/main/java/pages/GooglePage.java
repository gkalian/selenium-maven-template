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
public class GooglePage extends AbstractPage{
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
    public void searchFor(String value){
        searchBox.sendKeys(value + Keys.RETURN);
    }

    public void openGoogleURL(String url) {
        openUrl(url);
    }

    public void checkGoogleTitleAssert (String title) {
        titleAssert(title);
    }


}