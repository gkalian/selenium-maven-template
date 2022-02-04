package tests;

import driver.DriverManager;
import jdk.jfr.Description;
import org.testng.annotations.Test;
import pages.YoutubePage;
import settings.TestRunner;

/**
 * Initial test to open youtube page
 * @author gkalian
 * @version 1.0
 */

@Test
public class YoutubeTests extends TestRunner {
    static String url = "https://www.youtube.com/";
    static String title = "Youtube";

    @Description("Test method to search on youtube")
    public static void exampleTest(){
        YoutubePage yt = new YoutubePage(DriverManager.getDriver());

        yt.openYT(url);
        yt.titleYTAssert(title);
    }
}
