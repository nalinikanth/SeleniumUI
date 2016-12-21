package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    private WebDriver driver;

    @FindBy(id = "j_username")
    private WebElement user_name_field;

    @FindBy(id = "j_password")
    private WebElement password_field;

    @FindBy(id = "submit")
    private WebElement login;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public String loginSteps(String username, String password) {
        user_name_field.sendKeys(username);
        password_field.sendKeys(password);
        login.click();
        return "logged in";
    }

}