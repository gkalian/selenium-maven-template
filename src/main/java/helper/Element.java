package helper;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Element {

    JSExecutor js = new JSExecutor();
    public static WebDriver driver;

    public void clickElement(WebElement element) {
        element.click();
    }

    public void clickElementWithJavascript(WebElement element) {
        js.executeJavascript("arguments[0].click();", element);
    }

}
