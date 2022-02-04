package tests;

import driver.DriverManager;
import jdk.jfr.Description;
import org.testng.annotations.Test;
import pages.GooglePage;
import settings.TestRunner;

/**
 * Initial test to open google page
 * @author gkalian
 * @version 1.0
 */
@Test
public class GoogleTests extends TestRunner {

    public String url = "https://www.google.com/";
    public String title = "Google";
    public String search = "rick astley";

    @Description("Test method to search on google")
    public void exampleTest(){
        GooglePage google = new GooglePage(DriverManager.getDriver());

        google.openGoogleURL(url);
        google.checkGoogleTitleAssert(title);
        google.searchFor(search);
        google.checkGoogleTitleAssert(search);

    }
}
