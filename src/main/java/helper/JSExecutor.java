package helper;

import driver.DriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class JSExecutor {

    WebDriver driver = DriverManager.getDriver();

    public JavascriptExecutor getJavascriptExecutor() {
        return (JavascriptExecutor) driver;
    }

    public void executeJavascript(String javascriptToExecute, Object... arguments) {
        getJavascriptExecutor().executeScript(javascriptToExecute, arguments);
    }

    public void executeJavascript(String javascriptToExecute) {
        getJavascriptExecutor().executeScript(javascriptToExecute);
    }
}
