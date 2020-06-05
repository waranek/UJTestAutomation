package selenium.uj.project.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class CustomDriverFactory {

    private CustomFile customFile;

    public CustomDriverFactory() {
        customFile = new CustomFile();
    }

    public WebDriver getConfiguredDriver(String driverType) {
        return getConfiguredDriver(driverType, BaseProperties.IMPLICITLY_WAIT, BaseProperties.WINDOW_MAXIMIZE);
    }

    public WebDriver getConfiguredDriver(String driverType, long implicitlyWait) {
        return getConfiguredDriver(driverType, implicitlyWait, BaseProperties.WINDOW_MAXIMIZE);
    }

    public WebDriver getConfiguredDriver(String driverType, boolean windowMaximize) {
        return getConfiguredDriver(driverType, BaseProperties.IMPLICITLY_WAIT, windowMaximize);
    }

    public WebDriver getConfiguredDriver(String browserType, long implicitlyWait, boolean windowMaximize) {
        WebDriver driver;
        if (browserType.equalsIgnoreCase(BaseProperties.CHROME_BROWSER_TYPE)) {
            // Zdefiniowanie ścieżki dla zewnętrznego drivera przeglądarki Chrome
            System.setProperty("webdriver.chrome.driver", customFile.getResourceFilePathString(BaseProperties.CHROME_DRIVER_FILE_NAME));
            driver = new ChromeDriver(); // inicjalizacja przeglądarką Chrome
        } else if (browserType.equalsIgnoreCase(BaseProperties.FIREFOX_BROWSER_TYPE)) {
            // Zdefiniowanie ścieżki dla zewnętrznego drivera przeglądarki Firefox
            System.setProperty("webdriver.gecko.driver", customFile.getResourceFilePathString(BaseProperties.FIREFOX_DRIVER_FILE_NAME));
            driver = new FirefoxDriver(); // inicjalizacja przeglądarką Firefox
        } else {
            // Zdefiniowanie ścieżki dla zewnętrznego drivera przeglądarki Chrome
            System.setProperty("webdriver.chrome.driver", customFile.getResourceFilePathString(BaseProperties.CHROME_DRIVER_FILE_NAME));
            driver = new ChromeDriver(); // inicjalizacja przeglądarką Chrome
        }
        driver.manage().timeouts().implicitlyWait(implicitlyWait, TimeUnit.SECONDS); // ustawienie czasu oczekiwania na elementy
        if (windowMaximize) {
            driver.manage().window().maximize(); // maksymalizacja okna
        }
        return driver;
    }
}