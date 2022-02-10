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
    String url = "https://www.youtube.com/";
    String title = "YouTube";
    String search = "rick astley";
    String searchUrl = "https://www.youtube.com/results?search_query=rick+astley";

    @Description("Test method to search on youtube")
    public void exampleTest()  {
            YoutubePage yt = new YoutubePage(DriverManager.getDriver());

            yt
                    .openYT(url)
                    .titleYTAssert(title)
                    .searchFor(search)
                    .checkYTUrl(searchUrl);

    }
}
