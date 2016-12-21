package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.Config;

import java.util.Properties;

import static org.testng.Assert.assertEquals;
import static test_steps.Login.login;
import static utils.WebElementUtils.waitForElement;

public class BaseTest {
    protected WebDriver driver;
    protected Properties properties;

    @Test
    public void beforeMethod() throws Exception {
        properties = Config.getProperties();
        driver = login(properties);
        assertEquals(driver.getTitle(),"DHIS 2");
    }

    @AfterClass
    public void after() {
        driver.close();
        driver.quit();
    }
}
