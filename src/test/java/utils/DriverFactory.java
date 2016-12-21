package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DriverFactory {

    private static WebDriver driver;

    public static WebDriver getBrowser(String browserName) {
        switch (browserName) {
            case "Firefox":
                System.setProperty("webdriver.gecko.driver", "src/test/resources/geckodriver");
                driver = new FirefoxDriver();
                break;
            case "Chrome":
                System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");
                ChromeOptions options = new ChromeOptions();
//                options.addArguments("-incognito");
                options.addArguments("--disable-cache");
                DesiredCapabilities capabilities = DesiredCapabilities.chrome();
                capabilities.setCapability(ChromeOptions.CAPABILITY, options);
                driver = new ChromeDriver(capabilities);
                break;
        }
        return driver;
    }
}

