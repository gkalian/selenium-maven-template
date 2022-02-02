package settings;

import driver.DriverFactory;
import driver.DriverManager;
import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ITestListener;
import org.testng.ITestResult;
import utils.PropertyLoader;

/**
 * Listener for proper web driver initialization
 * @author gkalian
 * @version 1.0
 */
public class Listener implements IInvokedMethodListener, ITestListener {

    @Override
    public void beforeInvocation(IInvokedMethod method, ITestResult testResult) {
        if (method.isTestMethod()) {
            DriverManager.setDriver(DriverFactory.
                    createInstance(PropertyLoader.getPropertyByName("browser.properties","browser.name")));
        }
    }

    @Override
    public void afterInvocation(IInvokedMethod method, ITestResult testResult) {
        if (method.isTestMethod()) {
            DriverManager.quitDriver();
        }
    }

}
