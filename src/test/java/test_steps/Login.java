package test_steps;

import org.openqa.selenium.WebDriver;
import pages.LoginPage;
import utils.DriverFactory;

import java.util.Properties;

import static utils.WebElementUtils.waitForElement;

public class Login {

    public static WebDriver login(Properties properties) {
        return login(properties, "username", "password");
    }

    public static WebDriver login(Properties properties, String userName, String password) {
        String baseUrl = properties.getProperty("dhis2url");
        WebDriver driver = DriverFactory.getBrowser(properties.getProperty("browser"));
        driver.get(baseUrl);
        driver.manage().window().maximize();
        LoginPage logindhis = new LoginPage(driver);
        logindhis.loginSteps(properties.getProperty(userName), properties.getProperty(password));
        waitForElement();
        return driver;
    }
}
