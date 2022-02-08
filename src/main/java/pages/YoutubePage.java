package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Google page with all written methods
 * @author gkalian
 * @version 1.0
 */
public class YoutubePage extends AbstractPage<YoutubePage> {

    /**Constructor*/
    public YoutubePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements( driver, this);
    }

    /**Web Elements*/
    @FindBy(css = "input#search")
    WebElement search;

    @FindBy(id = "search-icon-legacy")
    WebElement searchBtn;

    /**Page Methods*/
    public YoutubePage openYT(String url) {
        openUrl(url);
        waitUntilPageIsLoaded();
        return this;
    }

    public YoutubePage searchFor (String value){
        search.click();
        search.sendKeys(value);
        searchBtn.click();
        waitUntilPageIsLoaded();
        return this;
    }

    public YoutubePage titleYTAssert (String title) {
        waitUntilPageIsLoaded();
        titleAssert(title);
        return this;
    }

    public YoutubePage checkYTUrl (String url) {
        waitUntilPageIsLoaded();
        urlAssert(url);
        return this;
    }

}