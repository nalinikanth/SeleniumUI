package utils;

import org.openqa.selenium.By.ByCssSelector;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

import static java.util.stream.Collectors.toList;
import static org.openqa.selenium.By.xpath;

public class WebElementUtils {

    public static List<String> getWebElementsText(List<WebElement> webElements) {
        return webElements.stream().map(WebElement::getText).collect(toList());
    }

    public static List<String> getWebElementsText(WebDriver driver, String css) {
        return getWebElementsText(getWebElements(driver, css));
    }

    public static List<WebElement> getWebElements(WebDriver driver, String css) {
        return driver.findElements(new ByCssSelector(css));
    }

    public static List<String> getWebElementsText(WebElement element, String css) {
        return getWebElementsText(element.findElements(new ByCssSelector(css)));
    }

    public static WebElement getWebElement(WebDriver driver, String css) {
        return driver.findElement(new ByCssSelector(css));
    }

    public static WebElement getWebElementWithId(WebDriver driver, String id) {
        return driver.findElement(new ById(id));
    }

    public static String getWebElementText(WebElement webElement, String css) {
        return webElement.findElement(new ByCssSelector(css)).getText();
    }

    public static String getWebElementText(WebDriver driver, String css) {
        return driver.findElement(new ByCssSelector(css)).getText();
    }

    public static WebElement getWebElementWithText(WebDriver driver, String xpathString, String text) {
        return driver.findElement(xpath(xpathString + "[contains(text(), '" + text + "')]"));
    }

    public static WebElement getWebElementWithValue(WebDriver driver, String xpathString, String value) {
        return driver.findElement(xpath(xpathString + "[@value='" + value + "']"));
    }

    public static WebElement getWebElementByXpath(WebDriver driver, String xpathString) {
        return driver.findElement(xpath(xpathString));
    }

    public static List<WebElement> getWebElementsByXpath(WebDriver driver, String xpathString) {
        return driver.findElements(xpath(xpathString));
    }

    public static Boolean areDisabled(WebDriver driver, String css) {
        List<WebElement> webElements = getWebElements(driver, css);
        return webElements.stream().allMatch(e -> e.getAttribute("disabled").equals("true"));
    }

    public static void waitForElement() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
        }
    }
}
