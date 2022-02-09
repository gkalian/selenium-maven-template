package helper;

import driver.DriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
/**
 * Class to store js executor methods
 * @author gkalian
 * @version 1.0
 */
public class JSExecutor {

    WebDriver driver = DriverManager.getDriver();
    /**get JS executor*/
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
