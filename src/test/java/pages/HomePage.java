package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePage {

    private WebDriver webDriver;

    @FindBy(css = "#header input")
    private WebElement search;

    public HomePage(WebDriver webDriver) {
        this.webDriver = webDriver;
        PageFactory.initElements(webDriver, this);
    }

    public String searchApp(String appname) throws InterruptedException {
        search.click();
        search.clear();
        search.sendKeys("T");
        search.sendKeys("a");
        search.sendKeys("l");
        search.sendKeys("l");
        search.sendKeys("y");
        return appname;
    }
}
