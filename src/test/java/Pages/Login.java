package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class Login {

    WebDriver driver;

    @FindBy(xpath = "//input[@id='MobileNumber']")
    WebElement MSISDN;

    @FindBy(id = "Password")
    WebElement Password;

    @FindBy(id = "Login")
    WebElement loginButton;

    @FindBy(xpath = "//*[@id=\"toast-da9adcca-970f-46a9-8c40-9c05958779b0\"]/div/div/div/div/div[3]/a[2]/img")
    WebElement loginPopup;

    public Login(WebDriver driver) {
        this.driver = driver;
    }

    public Login enterMSISDN(String msisdn) {
        new WebDriverWait(driver, Duration.ofSeconds(15)).until(visibilityOf(MSISDN));
        MSISDN.sendKeys(msisdn);
        return this;
    }

    public void iEnterThePasswordPassword(String password) {
        new WebDriverWait(driver, Duration.ofSeconds(15)).until(visibilityOf(Password));
        Password.sendKeys(password);
    }

    public void iClickOnTheLoginButton() {
        new WebDriverWait(driver, Duration.ofSeconds(15)).until(visibilityOf(loginButton));
        loginButton.click();
        try {
            new WebDriverWait(driver, Duration.ofSeconds(15)).until(visibilityOf(loginPopup));
            if (loginPopup.isDisplayed()) {
                loginPopup.click();
            } else {
                System.out.println("Login popup is not displayed.");
            }


        } catch (Exception e) {
            System.out.println("Element not found or not visible within the wait time.");
        }

    }
}

