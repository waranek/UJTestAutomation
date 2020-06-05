package selenium.uj.project.utils;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;

public class CustomScreenshot {

    public void makeScreenshot(WebDriver driver, String fileName) {

        File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

        try {
            FileUtils.copyFile(screenshotFile, new File(
                    CustomFile.getProjectPath() +
                            BaseProperties.SCREENSHOT_DIRECTORY_NAME +
                            fileName +
                            BaseProperties.SCREENSHOT_FILE_EXTENSION
            ));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
