package utils;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 * Support screenshots tests
 * @author gkalian
 * @version 1.0
 */
public class Screenshots {
    /**Main method to take screenshot*/
    public void doScreenShot(ITestResult iTestResult) throws IOException {
        //Taking screenshot
        File tempFile = ((TakesScreenshot) iTestResult
                .getTestContext()
                .getAttribute("driver"))
                .getScreenshotAs(OutputType.FILE);

        // Directory for the file
        String finalDir = iTestResult.getTestContext().getOutputDirectory() + File.separator + "Screenshots";

        //Generating file name
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss");
        String fileName = String.format("%s_%s.png", iTestResult.getMethod().getMethodName(),
                dateFormat.format(new Date()));

        //Path with file name
        String dirWithFile = finalDir + File.separator + fileName;

        // Saving screenshot
        FileUtils.copyFile(tempFile, new File(dirWithFile));
    }

    private byte[] doScreenShotByte(ITestResult iTestResult) {
        //Taking screenshot
        return ((TakesScreenshot) iTestResult
                .getTestContext()
                .getAttribute("driver"))
                .getScreenshotAs(OutputType.BYTES);
    }

    public void takeScreenshot(WebDriver driver) throws IOException {
        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        String path = "./target/screenshots/" + screenshot.getName();
        FileUtils.copyFile(screenshot, new File(path));
    }
}
