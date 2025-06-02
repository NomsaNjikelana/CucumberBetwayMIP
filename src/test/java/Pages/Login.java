package Pages;

import io.cucumber.java.After;
import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
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

    public Login(WebDriver driver) {
        this.driver = driver;
    }

    public Login enterMSISDN(String msisdn) {
        new WebDriverWait(driver, Duration.ofSeconds(15)).until(visibilityOf(MSISDN));
        MSISDN.sendKeys(msisdn);
        return this;
    }

    public void iEnterThePasswordPassword(String password){
        new WebDriverWait(driver, Duration.ofSeconds(15)).until(visibilityOf(Password));
        Password.sendKeys(password);
    }

    public void iClickOnTheLoginButton() {
        new WebDriverWait(driver, Duration.ofSeconds(15)).until(visibilityOf(loginButton));
        loginButton.click();
        if (driver.findElement(By.xpath("//*[@id=\"toast-da9adcca-970f-46a9-8c40-9c05958779b0\"]/div/div/div/div/div[3]/a[2]/img")).isDisplayed()) {
            driver.findElement(By.xpath("//*[@id=\"toast-da9adcca-970f-46a9-8c40-9c05958779b0\"]/div/div/div/div/div[3]/a[2]/img")).click();
        }
    }
}
