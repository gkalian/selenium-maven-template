package settings;

import driver.DriverManager;
import org.testng.annotations.*;
/**
 * Default behavior for tests with testng annotation
 * @author gkalian
 * @version 1.0
 */
@Listeners(Listener.class)
public class TestRunner {

        @BeforeMethod
        public void beforeMethod() {
        }

        @AfterMethod
        public void afterMethod() {
        }

        @AfterSuite
        public void afterSuite() {
            //DriverManager.quitDriver();
        }

}
