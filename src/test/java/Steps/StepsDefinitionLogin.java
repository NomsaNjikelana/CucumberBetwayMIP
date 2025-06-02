package Steps;

import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

public class StepsDefinitionLogin extends Base {

    @Given("I am in the login page")
    public void iAmInTheLoginPage() {

    }

    @And("I enter the MSISDN (.*)$")
    public void iEnterTheMSISDN(String MSISDN) {
        driver.findElement(By.xpath("//input[@id='MobileNumber']")).sendKeys(MSISDN);
    }

    @And("I enter the password (.*)$")
    public void iEnterThePasswordPassword(String password) throws InterruptedException {
        Thread.sleep(5000);
        driver.findElement(By.id("Password")).sendKeys(password);

    }

    @When("I click on the login button")
    public void iClickOnTheLoginButton() throws InterruptedException {
        Thread.sleep(5000);
        driver.findElement(By.id("Login")).click();
        Thread.sleep(10000);
        driver.findElement(By.xpath("//*[@id=\"toast-da9adcca-970f-46a9-8c40-9c05958779b0\"]/div/div/div/div/div[3]/a[2]/img")).click();
    }

    @Then("I should see the home page")
    public void iShouldSeeTheHomePage() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//span[contains(.,'Deposit')])[3]")).isDisplayed();
    }

    @After
    public void closeBrowser() {
        driver.quit();
    }

}
