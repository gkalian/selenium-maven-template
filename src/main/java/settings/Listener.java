package settings;

import driver.DriverFactory;
import driver.DriverManager;
import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ITestResult;
/**
 * Listener for proper web driver initialization
 * @author gkalian
 * @version 1.0
 */
public class Listener implements IInvokedMethodListener {

    @Override
    public void beforeInvocation(IInvokedMethod method, ITestResult testResult) {
        if (method.isTestMethod()) {
            DriverManager.setWebDriver(DriverFactory.createInstance());
        }
    }

    @Override
    public void afterInvocation(IInvokedMethod method, ITestResult testResult) {
        if (method.isTestMethod()) {
            DriverManager.quitDriver();
        }
    }

}
