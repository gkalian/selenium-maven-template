package helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
/**
 * Class to store click methods
 * @author gkalian
 * @version 1.0
 */
public class Element {

    JSExecutor js = new JSExecutor();
    public static WebDriver driver;

    /**Click web element using selenium click*/
    public void clickElement(WebElement element) {
        element.click();
    }

    /**Click web element using js executor*/
    public void clickElementWithJavascript(WebElement element) {
        js.executeJavascript("arguments[0].click();", element);
    }

}
