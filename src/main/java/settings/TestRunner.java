package settings;

import driver.DriverManager;
import org.testng.annotations.*;

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
            DriverManager.quitDriver();
        }

}
