package Steps;

import Pages.Login;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class StepsDefinitionLogin extends Base {


    @Given("I am in the login page")
    public void iAmInTheLoginPage() {

    }

    @And("I enter the MSISDN (.*)$")
    public void iEnterTheMSISDN(String MSISDN) {
        loginPage.enterMSISDN(MSISDN);
    }

    @And("I enter the password (.*)$")
    public void iEnterThePasswordPassword(String password) throws InterruptedException {
       loginPage.iEnterThePasswordPassword(password);
        Thread.sleep(2000);

    }

    @When("I click on the login button")
    public void iClickOnTheLoginButton() throws InterruptedException {
        loginPage.iClickOnTheLoginButton();
    }

    @Then("I should see the home page")
    public void iShouldSeeTheHomePage() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//span[contains(.,'Deposit')])[3]")).isDisplayed();
    }

//    @After
//    public void closeBrowser() {
//        driver.quit();
//    }

}
