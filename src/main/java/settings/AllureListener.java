package settings;

import io.qameta.allure.Allure;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;
import utils.Screenshots;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 * Allure settings to take screen
 * @author gkalian
 * @version 1.0
 */
public class AllureListener implements ITestListener {
    Screenshots sc = new Screenshots();

    @Override
    public void onTestSuccess(ITestResult result) {

        try {
            sc.doScreenShot(result);
        } catch (IOException e) {
            e.printStackTrace();
        }

        Allure.addAttachment("ScreenShot", new ByteArrayInputStream(((TakesScreenshot) result
                .getTestContext()
                .getAttribute("driver"))
                .getScreenshotAs(OutputType.BYTES)));
    }

    @Override
    public void onTestFailure(ITestResult result) {
        try {
            sc.doScreenShot(result);
        } catch (IOException e) {
            e.printStackTrace();
        }

        Allure.addAttachment("ScreenShot", new ByteArrayInputStream(((TakesScreenshot) result
                .getTestContext()
                .getAttribute("driver"))
                .getScreenshotAs(OutputType.BYTES)));
    }

}
