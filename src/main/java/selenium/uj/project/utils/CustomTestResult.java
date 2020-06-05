package selenium.uj.project.utils;

import org.testng.ITestResult;

import java.util.Date;

public class CustomTestResult {

    public String getResultScreenshotFileName(ITestResult result) {
        return new Date().getTime() + "_" + result.getMethod().getMethodName() + "_" + getResultName(result.getStatus());
    }

    public String getResultMessageLog (ITestResult result) {
        return "RESULT - " + result.getMethod().getMethodName() + " - " + getResultName(result.getStatus());
    }

    private String getResultName(int result) {
        if (result == ITestResult.SUCCESS) {
            return "SUCCESS";
        } else if (result == ITestResult.FAILURE) {
            return "FAILURE";
        } else if (result == ITestResult.SKIP) {
            return "SKIP";
        } else {
            return "UNKNOWN";
        }
    }
}